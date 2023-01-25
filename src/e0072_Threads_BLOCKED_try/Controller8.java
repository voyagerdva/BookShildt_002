package e0072_Threads_BLOCKED_try;

import java.util.ArrayList;
import java.util.List;

public class Controller8 extends Thread {
    Monitor8 monitor;
    String name;
    Array8 arr;
    List<Thread> subscribers = new ArrayList<>();
    Th8_1 th8_1;
    Th8_2 th8_2;
    Th8_3 th8_3;

    Controller8(String n, Array8 a, Monitor8 m, List<Thread> threads, Th8_1 t1, Th8_2 t2, Th8_3 t3) {
        monitor = m;
        name = n;
        arr = a;

        th8_1 = t1;
        th8_2 = t2;
        th8_3 = t3;

        threads.forEach(th -> {
            subscribers.add(th);
            System.out.printf("from constructor %s : %s : %s\n", name, th.getName(), th.getState());
        });

        setName(name);
        System.out.printf("%s : %s : %s  was created...\n", getName(), getPriority(), getState());
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("stopTrue()");
            monitor.stopTrue();
            System.out.println("after stopTrue");

            Thread.sleep(7000);

            synchronized (monitor) {
                monitor.wait();
            }
//            monitor.wait();
//            Thread.sleep(3000);
//
//            System.out.printf("--------- %s : %s  th8_1.sayWait() ...\n", getName(), getState());
//            th8_1.sayWait();
















        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
