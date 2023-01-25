package e0061_Threads_SYNCHRONIZED_BLOCK_AND_METHOD;

public class Store {
    public int delay = 2000;

    private int product = 0;
    public synchronized void get() throws InterruptedException {
//    public void get() throws InterruptedException {
        while (product < 1) {
            wait();
            System.out.println("get(). Was BOUGHT 1 product FROM store");
        }
        product--;
        System.out.println("CLIENT BOUGHT 1 PRODUCT. PRODUCTS IN STORE ARE: " + product);
//        Thread.sleep(delay);
        notify();
    }

    public synchronized void put() throws InterruptedException {
//    public void put() throws InterruptedException {
        while (product >= 4) {
            wait();
            System.out.println("put(): Was ADDED 1 product TO store");
        }
        product++;
        System.out.println("PRODUCER ADDED 1 PRODUCT. PRODUCTS IN STORE ARE: " + product);
//        Thread.sleep(delay);
        notify();
    }
}
