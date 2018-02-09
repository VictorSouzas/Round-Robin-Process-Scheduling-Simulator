package ProcessSchedule;

import DataStructure.Queue;
import Process.Process;

public class RobinRound {
    private int quantum;
    private int count;
    private Queue waitingQueue;
    private Queue processQueue;
    private Queue processedQueue;
    private Process executionProcess;
    private int time;

    public RobinRound(Queue waitingQueue){
        this.waitingQueue = waitingQueue;
        this.quantum = 2;
        this.processQueue = new Queue();
        this.processedQueue = new Queue();
        this.executionProcess = null;
        this.time = 0;
        this.Scheduler();
    }
    private void Scheduler() {
        this.count = 0;
        while(!processQueue.isEmpty() || !waitingQueue.isEmpty()) {
            if(this.executionProcess != null)
                if(CheckRemoveEvents())
                    remove();
            if(this.executionProcess == null && !this.processQueue.isEmpty()){
                this.executionProcess = (Process) this.processQueue.remove();
                this.executionProcess.getInput().add(this.time);
            }

            Queue income = Event.arrive(this.waitingQueue, this.time);
            if(!income.isEmpty())
                integrate(income, this.processQueue);

            this.count++;
            this.time++;
        }
    }

    private boolean CheckRemoveEvents() {
        if(this.count >= this.quantum){
            Event.remove(this.executionProcess, this.quantum, this.time);
            return true;
        }
        if(this.executionProcess.getIO() != null && checkIO()){
            Event.remove(this.executionProcess, -1, this.time);
            return true;
        }
        return false;
    }

    private void remove(){
        if(this.executionProcess.getDuration() <= 0){
            this.processedQueue.add(this.executionProcess);
        }else {
            this.processQueue.add(this.executionProcess);
        }
        this.executionProcess = null;
        this.count = 0;
    }

    private void integrate(Queue income, Queue processQueue){
        for (Process i = (Process) income.remove(); income.getSize() > 0;i = (Process) income.remove()){
            i.getInput().add(this.time);
            processQueue.add(i);
        }
    }

    private boolean checkIO(){
        /*for (int i = 0; i <= this.executionProcess.getIO().length-1; i++)
            if(this.executionProcess.getDuration() == this.executionProcess.getIO()[i])
                return true;*/
        return true;
    }

    public Queue getProcessedQueue() {
        return processedQueue;
    }
}
