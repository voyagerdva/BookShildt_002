package e0061_Threads_SYNCHRONIZED_BLOCK_AND_METHOD;

public class Program {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer, "PRODUCER").start();
        new Thread(consumer, "CONSUMER").start();
    }
}
