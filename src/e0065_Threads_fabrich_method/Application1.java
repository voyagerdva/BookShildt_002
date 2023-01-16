package e0065_Threads_fabrich_method;

public class Application1 {
    public static void main(String[] args) {
//        NewThread444 th1 = new NewThread444("(I )");
//        NewThread444 th2 = new NewThread444("(II)");
        NewThread444 th1 = NewThread444.createAndStart("(I )");
        NewThread444 th2 = NewThread444.createAndStart("(II)");

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
//