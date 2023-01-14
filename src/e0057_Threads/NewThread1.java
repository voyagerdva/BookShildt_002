package e0057_Threads;

public class NewThread1 extends Thread {
    NewThread1() {
        super("DEMO THREAD...");
        System.out.println("DOUTHER THREAD IS: " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("DOUTHER THREAD: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("DOUTHER THREAD IS FINISHED!!!");
        }
}