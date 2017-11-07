package ProcessSchedule;

import DataStructure.Queue;
import Process.Process;
public class Event {
    public static Queue arrive(Queue processQueue, int time){
        int size = processQueue.getSize();
        Queue newQueue = new Queue();
        for (int i = 0; i <= size; i++){
            Process process = (Process) processQueue.remove();
            if((int) process.getInput().getFirst() == time){
                newQueue.add(process);
                continue;
            }
            processQueue.add(process);
        }
        return newQueue;
    }

    public static Process remove(Process process, int quantum, int time){
        process.getOutput().add(time);
        process.subtractDuration(quantum);
        return process;
    }
}
