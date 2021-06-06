package project;

public class Process {
    int pid; // Process ID
    int bt; // CPU Burst time required
    int priority; // Priority of this process
    Process(int pid, int bt, int priority)
    {
        this.pid = pid;
        this.bt = bt;
        this.priority = priority;
    }
    public int prior() {
        return priority;
    }
}


