package e0060_Threads_wait_notify;

public class PC {
    public static void main(String[] args) {
        QQQ qqq = new QQQ();
        new Producer(qqq);
        new Consum(qqq);
    }
}
