package e0069_Threads_print_list_TRANSFER_THREADS_LIST_TO_THREAD_1;

public class Printer2 extends Thread {
    String name;
    Array2 arr;

    Monitor monitor;

    int a = 1;
    int b = 1;

    int min_delay = 50;
    int max_delay = 150;

    Printer2(String n, Array2 a, Monitor mon) {
        monitor = mon;
        name = n;
        arr = a;
        setName(name);
        System.out.printf("%s : %s : %s  was created...\n", getName(), getPriority(), getState());
    }

    @Override
    public void run() {
        System.out.println("1:");
        for (int i = 0; i < 5; i++) {
            monitor.sayNotify();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("2:");
        for (int i = 0; i < 5; i++) {
            monitor.sayNotify();
            monitor.sayWaitMillis(200);
        }

        System.out.println("3:");
        for (int i = 0; i < 5; i++) {
            monitor.sayNotify();
//            System.out.printf("Inside FOR. Thread %s : %s\n",
//                    Thread.currentThread().getName(),
//                    Thread.currentThread().getState());
            for (int j = 1; j < 100; j++) {
                a *= j;
            }
        }

        monitor.sayNotify();
        interrupt();



//        while (arr.getIndex() < arr.getSIZE()) {
//            arr.print();
//
//            int delay = min_delay + (int) (Math.random() * max_delay);
//            try {
//                Thread.sleep(delay);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        arr.print();

    }
}
//