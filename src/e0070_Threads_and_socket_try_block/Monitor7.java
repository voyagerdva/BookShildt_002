package e0070_Threads_and_socket_try_block;

public class Monitor7 {
    public synchronized void sayNotify() {
        notify();
    }

    public synchronized void sayWait() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sayWaitMillis(int millis) {
        try {
            wait(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
//