package ProcessSchedule;

import DataStructure.Queue;
import Sorting.QuickInteger;
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
            queue.add(new Process(i,duration, Generate.generateIoVector(duration)));
        }
        return queue;
    }

    private static int[] generateIoVector(int duration){
        int[] vector = new int[(int) (Math.random() * duration % 10)];
        for (int i = 0; i < vector.length; i++)
            if(Math.random() < 0.5)
                vector[i] = (int) (Math.random() * duration);
        QuickInteger quickInteger = new QuickInteger(vector);
        return quickInteger.getVector();
    }

}
