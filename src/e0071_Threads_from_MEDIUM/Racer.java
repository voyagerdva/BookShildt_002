package e0071_Threads_from_MEDIUM;

public class Racer extends Thread {
    Racer(int id) {
        super("Racer[" + id + "]");
    }

    public void run() {
        for (int i = 1; i < 40; i++) {
            if (i % 10 == 0) {
                System.out.println(getName() + ", i = " + i);
                Thread.yield();
            }
        }
    }

}
