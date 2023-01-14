package e0057_Threads;

public class CurrenThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current thread of runtime!!!");

        t.setName("My Thread");

        System.out.println("After change name thread - " + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.err.println(n);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            System.err.println("MAIN THREAD WAS BROKEN:");
            e.printStackTrace();

        }
    }
}
