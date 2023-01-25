package e0072_Threads_BLOCKED_try;

public class Th8_2 extends Thread {
    Monitor8 monitor;
    String name;
    Array8 arr;

    private boolean STOP = false;

    Th8_2(String n, Array8 a, Monitor8 m) {
        monitor = m;
        name = n;
        arr = a;
        setName(name);
        System.out.printf("%s : %s : %s  was created...\n", getName(), getPriority(), getState());
    }


    @Override
    public void run() {
        System.out.printf("%s : %s : %s\n", name, getPriority(), getState());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("--------- %s : %s : %s  enter into SYNCH ...\n", getName(), getPriority(), getState());

        monitor.countDown();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        monitor.countDown();

    }


    public void stopFalse() {
        STOP = false;
    }

    public void stopTrue() {
        STOP = true;
    }


}
