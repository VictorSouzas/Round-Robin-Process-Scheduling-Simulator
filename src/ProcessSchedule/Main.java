package ProcessSchedule;

import DataStructure.Queue;
import Process.Process;

public class Main {
    public static void main(String[] args) {
        Queue<Process> waitingQueue = new Queue<>(new Process(1, 15, 5));
        waitingQueue.add(new Process(2, 25, 1));
        waitingQueue.add(new Process(3, 45, 3));
        RobinRound robinRound = new RobinRound(waitingQueue);
        Queue<Process> processQueue =  robinRound.getProcessedQueue();
        for (Process i = (Process) processQueue.getFirst().getValue(); !processQueue.isEmpty(); processQueue.remove(), i = (Process) processQueue.getFirst().getValue()){
            System.out.printf("Pid : " + i.getPid());
            System.out.printf(" ");
        }

    }
}
