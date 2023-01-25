package e0072_Threads_BLOCKED_try;

public class Th8_3 extends Thread {
    Monitor8 monitor;
    String name;
    Array8 arr;

    private boolean STOP = false;


    Th8_3(String n, Array8 a, Monitor8 m) {
        monitor = m;
        name = n;
        arr = a;
        setName(name);
        System.out.printf("%s : %s : %s  was created...\n", getName(), getPriority(), getState());
    }


    @Override
    public void run() {

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (monitor) {
            monitor.makeWork();
        }


    }


    public void stopFalse() {
        STOP = false;
    }

    public void stopTrue() {
        STOP = true;
    }


}
