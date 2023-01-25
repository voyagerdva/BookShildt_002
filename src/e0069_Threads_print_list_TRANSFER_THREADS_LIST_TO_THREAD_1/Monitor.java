package e0069_Threads_print_list_TRANSFER_THREADS_LIST_TO_THREAD_1;

public class Monitor {
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