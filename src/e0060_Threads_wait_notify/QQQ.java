package e0060_Threads_wait_notify;

public class QQQ {
    int n;
    boolean valueSet = false;
    boolean flag = true;

    synchronized int get() throws InterruptedException {
        while (!valueSet) {
            System.out.printf("get(): перед wait(): < %s > засыпает\n", Thread.currentThread().getName());
            wait();
//            delay();
            System.out.printf("get(): после wait(): < %s > проснулся\n", Thread.currentThread().getName());
        }

        System.out.println("RECEIVED: " + n);
        System.out.println();
        valueSet = false;

        System.out.printf("get(): перед notify: < %s >.\n", Thread.currentThread().getName());
//        delay();
        notify();
        System.out.printf("get(): после notify: < %s >\n", Thread.currentThread().getName());

        return n;
    }

    synchronized void send(int n) throws InterruptedException {
        while (valueSet) {
            System.out.printf("send(): перед wait(): < %s > засыпает\n", Thread.currentThread().getName());
            wait();
//            delay();
            System.out.printf("send(): после wait(): < %s > принял управление\n", Thread.currentThread().getName());
        }

        if (flag) {
            System.out.println("ПЕРВАЯ ТОЧКА ВХОДА П-О-С-Л-Е ЦИКЛА send.while().");
        }
        flag = false;

        this.n = n;
        valueSet = true;
        System.out.println("SENDED: " + n);
        System.out.printf("send(): перед notify: < %s > передает управление в другой поток\n", Thread.currentThread().getName());
        notify();
        System.out.printf("send(): после notify: < %s > ЧТО-ТО ДЕЛАЕТ ПОСЛЕ NOTIFY\n", Thread.currentThread().getName());
    }

    public void delay() {
        for (int i = 0; i < 7; i++) {
            System.out.printf(".");
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
