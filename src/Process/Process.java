package Process;

import DataStructure.Queue;

public class Process {
    private int pid;
    private int duration;
    private Queue input;
    private Queue output;
    private int[] IO;

    public Process(int pid, int duration) {
        this.pid = pid;
        this.duration = duration;
        this.input = new Queue((int) Math.random() * 50);
        this.output = new Queue();
    }

    public Process(int pid, int duration, int[] IO){
        this(pid, duration);
        this.IO = IO;
    }

    public int getPid() {
        return pid;
    }

    public int getDuration() {
        return duration;
    }

    public int[] getIO() {
        return IO;
    }

    public Queue getInput() {
        return input;
    }

    public Queue getOutput() {
        return output;
    }
}
