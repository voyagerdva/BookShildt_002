package e0076_Threads_HANDLE_BY_KEYBOARD;

public class Th11 extends Thread {
    long count = 0;
    Object monitor;

    public boolean conditionWait;
    public boolean conditionNotify;
    public boolean alive;
    public boolean conditionWhileTrue;

    Th11(String n, Object monitor) {
        setName(n);
        this.monitor = monitor;
        conditionWait = false;
        conditionNotify = false;
        alive = true;
        System.out.printf("New thread %s created.\n", getName());
    }

    public static Th11 createAndStart(String name, Object monitor) {
        Th11 th = new Th11(name, monitor);
        th.start();
        return th;
    }

    @Override
    public void run() {
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

                if (conditionWhileTrue) {
                    while (true) {

                    }
                }
                count = count + 1;

            }
        }
    }

    public void monitorNotify(boolean conditionNotify) {
        this.conditionNotify = conditionNotify;
    }

    public void monitorWait(boolean wait) {
        this.conditionWait = wait;
    }

}