package e0072_Threads_BLOCKED_try;

public class Th8_1 extends Thread {
    Monitor8 monitor;
    String name;
    Array8 arr;

    private boolean STOP = false;

    Th8_1(String n, Array8 a, Monitor8 m) {
        monitor = m;
        name = n;
        arr = a;
        setName(name);
        System.out.printf("%s : %s : %s  was created...\n", getName(), getPriority(), getState());
    }


    @Override
    public void run() {
        try {
            System.out.printf("%s : %s : %s\n", name, getPriority(), getState());
            System.out.println();

            System.out.printf("--------- %s : %s : %s  enter into SYNCH ...\n", getName(), getPriority(), getState());

            monitor.countUp();

            Thread.sleep(4000);

            System.out.printf("--------- %s : %s  sayWait() ...\n", getName(), getState());
            monitor.countUp();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }







    public void stopFalse() {
        STOP = false;
    }

    public void stopTrue() {
        STOP = true;
    }

    public void sayWait() {
        synchronized (monitor) {
            monitor.sayWait();
        }
    }

}
