package ProcessSchedule;

import DataStructure.Queue;

public class RobinRound {
    public static void main(String[] args) {
        Queue waitingQueue = Generate.process(Integer.parseInt(args[0]));

    }
}
