package e0057_Threads;

public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "NEW INFO THREAD");
        System.out.println("DOUTHER THREAD WAS CREATED: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("DOUTHER THREAD IS: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("DOUTHER THREAD IS FINISHED!!!");
    }



}
