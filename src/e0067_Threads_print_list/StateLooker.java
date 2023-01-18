package e0067_Threads_print_list;

import java.util.ArrayList;
import java.util.List;

public class StateLooker implements Runnable {
    Thread t;
    String name;
    java.util.List<Thread> subwriters = new ArrayList<>();


    StateLooker(String n, List<Thread> th) {
        name = n;
        t = new Thread(this, name);

        th.forEach(t -> {
            subwriters.add(t);
        });

        th.forEach(s -> {
            System.out.printf("%s : %s\n", s.getName(), s.getState());
        });


//        subwriters.set(0, th.get(0));
//        subwriters.set(1, th.get(1));
//        subwriters.set(2, th.get(2));

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
            System.out.printf("%s : %s\n", s.getName(), s.getState());
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
