package Process;

import DataStructure.Queue;

public class Process {
    private int pid;
    private int duration;
    private int arrival;
    private Queue input;
    private Queue output;
    private Queue IO;

    public Process(int pid, int duration, int arrival) {
        this.pid = pid;
        this.duration = duration;
        this.arrival = arrival;
        this.input = new Queue();
        this.output = new Queue();
    }

    public Process(int pid, int duration, int arrival, Queue IO){
        this(pid, duration, arrival);
        this.IO = IO;
    }

    public int getPid() {
        return pid;
    }

    public int getDuration() {
        return duration;
    }

    public int getArrival() {
        return arrival;
    }

    public Queue getIO() {
        return IO;
    }

    public Queue getInput() {
        return input;
    }

    public Queue getOutput() {
        return output;
    }
}
