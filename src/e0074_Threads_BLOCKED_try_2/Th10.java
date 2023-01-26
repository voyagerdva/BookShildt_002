package e0074_Threads_BLOCKED_try_2;

public class Th10 extends Thread {
    long count = 0;
    Object monitor;
//    Monitor10 monitor;
    public boolean conditionWait;
    public boolean conditionNotify;
    public boolean alive;
    public boolean conditionWhileTrue;

    Th10(String n, Object monitor) {
//    Th10(String n, Monitor10 monitor) {
        setName(n);
        this.monitor = monitor;
        conditionWait = false;
        conditionNotify = false;
        alive = true;
        System.out.printf("New thread %s created.\n", getName());
    }

    public static Th10 createAndStart (String name, Object monitor) {
//    public static Th10 createAndStart (String name, Monitor10 monitor) {
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

//    public void sayWait() {
//        try {
//            monitor.wait();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void sayNotify() {
//        monitor.notify();
//    }

}