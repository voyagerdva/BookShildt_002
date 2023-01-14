package e0060_Threads_wait_notify;

public class Producer implements Runnable {
    QQQ qqq;

    Producer(QQQ qqq) {
        this.qqq = qqq;
        new Thread(this, "PROD----").start();
    }

    public void run() {
        int i = 0;

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                qqq.send(i++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
