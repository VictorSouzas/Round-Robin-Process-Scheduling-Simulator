package ProcessSchedule;

import DataStructure.Queue;
import Process.Process;

public class Generate {

    public static Queue process(int max){
        Queue queue = new Queue();
        for (int i = 0; i < max; i++){
            int duration = (int) (Math.random() * 100);
            if(Math.random() < 0.5){
                queue.add(new Process(i,duration));
                continue;
            }
            queue.add(new Process(i,duration, Generate.generateIoQueue(duration)));
        }
        return queue;
    }

    private static Queue generateIoQueue(int duration){
        Queue queue = new Queue(Math.random() * duration);
        for (int i = 0; i < duration; i++)
            if(Math.random() < 0.5)
                queue.add(Math.random() * duration);
        return queue;
    }

}
