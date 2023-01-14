package e0062_Threads_wait_notify_2;

public class Waiter implements Runnable {
    private Message message;

    public Waiter(Message m) {
        this.message = m;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        synchronized (message) {
            try {
                System.out.println(name + "Waiting for call method notify(): " + System.currentTimeMillis());
                message.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
