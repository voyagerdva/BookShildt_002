package e0064_Threads_suspend_resyme;

public class Application {
    public static void main(String[] args) {
        NewThread333 th1 = new NewThread333("(I )");
        NewThread333 th2 = new NewThread333("(II)");

        try {
            System.out.println("\n> 1) Application.try{} by thread: >" + Thread.currentThread().getName() + "< is sleep to 1000 millis");
            Thread.sleep(1000);

            System.out.println("SUSPEND THREAD (I )");
            th1.mysuspend();


            System.out.println("\n> 2) Application.try{} by thread: >" + Thread.currentThread().getName() + "< is sleep to 1000 millis");
            Thread.sleep(1000);

            System.out.print("RESUME THREAD (I ). ");
            th1.myresume();
            System.out.println("SUSPEND THREAD (II)");
            th2.mysuspend();

            System.out.println("\n> 3) Application.try{} by thread: >" + Thread.currentThread().getName() + "< is sleep to 1000 millis");
            Thread.sleep(1000);

            System.out.print("RESUME THREAD (II). ");
            th2.myresume();
        } catch (InterruptedException e) {
            System.out.println("MAIN THREAD BROKEN");
        }

        try {
            System.out.println("\nWAITING FINISH THREADS");
            th1.t.join();
            th2.t.join();
        } catch (InterruptedException e) {
            System.out.println("MAIN THREAD BROKEN");
        }

        System.out.println("MAIN THREAD FINISHED");
    }
}
