package e0069_Threads_print_list_TRANSFER_THREADS_LIST_TO_THREAD_1;

import java.util.ArrayList;
import java.util.List;

public class StateLooker2 extends Thread{
    String name;
    List<Thread> subscribers = new ArrayList<>();
    Monitor monitor;


    StateLooker2(String n, List<Thread> threads, Monitor m) {
        monitor = m;
        name = n;
        setName(name);
        threads.forEach(th -> {
            subscribers.add(th);
            System.out.printf("from constructor StateLooker1 : %s : %s\n", th.getName(), th.getState());
        });

        System.out.printf("%s : %s : %s  was created...\n", getName(), getPriority(), getState());
    }


    @Override
    public void run() {
        while (true) {
            subscribers.forEach(s -> {
                System.out.printf("%s sais: %s , %s\n", Thread.currentThread().getName(), s.getName(), s.getState());
                System.out.printf("%s sais: %s , %s\n", name, s.getName(), s.getState());
            });

            monitor.sayWait();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.printf("%s : %s : %s\n", getName(), getPriority(), getState());
//        System.out.printf("%s : %s : %s\n", name, getPriority(), getState());
//
//

//        while (true) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            System.out.printf("# thread %s : ");
//
//
//        }
    }
}
