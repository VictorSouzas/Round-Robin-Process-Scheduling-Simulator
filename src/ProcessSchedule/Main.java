package ProcessSchedule;

import DataStructure.Queue;

public class Main {
    public static void main(String[] args) {
        Queue waitingQueue = Generate.process(Integer.parseInt(args[0]));
        RobinRound robinRound = new RobinRound(waitingQueue);
        robinRound.getProcessedQueue();
    }
}
