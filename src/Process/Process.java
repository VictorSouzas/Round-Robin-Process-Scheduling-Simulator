package Process;

import DataStructure.Queue;

public class Process {
    private int pid;
    private int duration;
    private Queue<Integer> input;
    private Queue<Integer> output;
    private int[] IO;

    public Process(int pid, int duration, int input) {
        this.pid = pid;
        this.duration = duration;
        this.input = new Queue(input);
        this.output = new Queue();
    }

    public Process(int pid, int duration, int input,int[] IO){
        this(pid, duration, input);
        this.IO = IO;
    }
    public void subtractDuration(int value){
        this.duration = this.duration - value;
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
