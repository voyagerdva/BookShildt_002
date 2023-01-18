package e0068_Threads_print_list_TRANSFER_THREADS_LIST_TO_THREAD;

import java.util.ArrayList;
import java.util.List;

public class StateLooker1 implements Runnable {
    Thread t;
    String name;
    List<Writer1> subwriters = new ArrayList<>();


    StateLooker1(String n, List<Writer1> writer) {
        name = n;
        t = new Thread(this, name);

        writer.forEach(w -> {
            subwriters.add(w);
            System.out.printf("from constructor StateLooker1 : %s : %s\n", w.t.getName(), w.t.getState());
        });

        t.start();
        System.out.println();
        System.out.printf("%s was created...\n", t);
        System.out.println();
    }


    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t + " : " + t.getState());

        subwriters.forEach(s -> {
            System.out.printf("%s : %s\n", s.t.getName(), s.t.getState());
        });
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
