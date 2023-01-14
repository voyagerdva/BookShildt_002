package e0060_Threads_wait_notify;

public class Consum implements Runnable {
    QQQ qqq;

    Consum(QQQ qqq) {
        this.qqq = qqq;
        new Thread(this, "GET+++++").start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                qqq.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
//