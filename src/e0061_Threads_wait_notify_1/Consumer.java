package e0061_Threads_wait_notify_1;

import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {
    Store store;

    Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 60; i++) {
            synchronized (store) {
                try {
                    store.get();
//                    Thread.sleep(store.delay);
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
