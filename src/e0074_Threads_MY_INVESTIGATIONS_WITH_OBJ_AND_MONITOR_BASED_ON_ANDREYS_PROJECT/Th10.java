package e0074_Threads_MY_INVESTIGATIONS_WITH_OBJ_AND_MONITOR_BASED_ON_ANDREYS_PROJECT;

public class Th10 extends Thread {
    long count = 0;
//    Object monitor;
    Monitor10 monitor;
    public boolean conditionWait;
    public boolean conditionNotify;
    public boolean alive;
    public boolean conditionWhileTrue;

//    Th10(String n, Object monitor) {
    Th10(String n, Monitor10 monitor) {
        setName(n);
        this.monitor = monitor;
        conditionWait = false;
        conditionNotify = false;
        alive = true;
        System.out.printf("New thread %s created.\n", getName());
    }

//    public static Th10 createAndStart (String name, Object monitor) {
    public static Th10 createAndStart (String name, Monitor10 monitor) {
        Th10 th = new Th10(name, monitor);
        th.start();
        return th;
    }

    @Override
    public void run () {
        while (alive) {
            synchronized (monitor) {
//                monitor.makeWork();

                if (conditionWait) {
                    try {
                        monitor.STOP = true;
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

    public void monitorNotify (boolean conditionNotify) {
        this.conditionNotify = conditionNotify;
    }

    public void monitorWait (boolean wait) {
        this.conditionWait = wait;
    }

}