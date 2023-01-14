package e0059_Threads_SYNCH_monitor;

public class Callme {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Broken: " + e);
        }

        System.out.println("]");
    }
}
//