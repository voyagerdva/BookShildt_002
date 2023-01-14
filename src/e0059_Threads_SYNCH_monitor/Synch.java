package e0059_Threads_SYNCH_monitor;

public class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "WELCOME");
        Caller ob2 = new Caller(target, "INTO SYNCH");
        Caller ob3 = new Caller(target, "WORLD!!!");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Broken: " + e);
        }
    }
}

