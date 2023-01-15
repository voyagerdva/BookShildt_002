package e0063_Threads_Vzaimo_Block;

public class Deadlock implements Runnable {
    AAAAA aaaaa = new AAAAA();
    BBBBB bbbbb = new BBBBB();

    Deadlock() {
        Thread.currentThread().setName("MAIN_THREAD");

        Thread t = new Thread(this, "KONKURENT_THREAD");
        t.start();

        aaaaa.foo(bbbbb);
        System.out.println("BACK TO MAIN_THREAD");
    }

    public void run() {
        System.out.println("From main run(): " + Thread.currentThread().getName());
        bbbbb.bar(aaaaa);
        System.out.println("BACK TO OTHER THREAD");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
