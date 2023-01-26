package e0074_Threads_Andrey;

public class Th12 extends Thread {
    long count = 0;
    Object monitor;
    public boolean conditionWait;
    public boolean conditionNotify;
    public boolean alive;

    Th12(String n, Object monitor) {
        setName(n);
        this.monitor = monitor;
        conditionWait = false;
        conditionNotify = false;
        alive = true;
        System.out.printf("New thread %s created.\n", getName());
    }

    public static Th12 createAndStart (String name, Object monitor) {
        Th12 th = new Th12(name, monitor);
        th.start();
        return th;
    }

    @Override
    public void run () {
        while (alive) {
            synchronized (monitor) {

                if (conditionWait) {
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (conditionNotify) {
                    try {
                        monitor.notify();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                count = count + 1;

            }
        }
    }

    public void monitorNotify (boolean conditionNotify) {
        this.conditionNotify = conditionNotify;
    }

    public void monitorWait (boolean wait) {
        this.conditionWait = wait;
    }
}