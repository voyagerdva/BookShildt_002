package e0058_Threads;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("ONE");
        new NewThread("TWO");
        new NewThread("THREE");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("MAIN THREAD IS BROKEN!!!");
        }

        System.out.println("MAIN THREAD IS FINISHED!!!");

    }
}
