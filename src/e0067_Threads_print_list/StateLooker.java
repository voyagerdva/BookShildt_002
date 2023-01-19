package e0067_Threads_print_list;

import java.util.ArrayList;
import java.util.List;

public class StateLooker extends Thread {
    String name;
        java.util.List<Thread> subwriters = new ArrayList<>();
    Array0 array0;
    int iteration = 1;


    StateLooker(String n, List<Thread> th, Array0 arr) {
        array0 = arr;
        name = n;
        setName(name);

        th.forEach(t -> {
            subwriters.add(t);
        });

        th.forEach(s -> {
            System.out.printf("%s : %s\n", s.getName(), s.getState());
        });

        System.out.println();
        System.out.printf("%s was created...\n", name);
        System.out.println();
    }


    @Override
    public void run() {
        while (!array0.getStopFlag()) {
            System.out.printf("-= Iteration %s =-\n", iteration);

            subwriters.forEach(s -> {
                System.out.printf("%s : %s\n", s.getName(), s.getState());
            });

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            iteration++;
        }

        System.out.printf("-= Iteration %s =-\n", iteration);

        subwriters.forEach(s -> {
            System.out.printf("%s : %s\n", s.getName(), s.getState());
        });

    }
}
