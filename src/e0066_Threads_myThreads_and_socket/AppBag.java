package e0066_Threads_myThreads_and_socket;

public class AppBag {
    public static void main(String[] args) {
        int PORT = 3004;
        Bag bag = new Bag(10, 20);
        Object obj = new Object();

        Th1 th1 = Th1.createAndStart("Th1_server", PORT);
        Th2 th2 = Th2.createAndStart("Th2_client", PORT);

        try {
            th1.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            th2.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
//