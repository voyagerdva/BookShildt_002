package e0067_Threads_print_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Application_4 {

    public static void main(String[] args) {
        System.out.println();
        Array0 arr = new Array0();

        java.util.List<Thread> writers = new ArrayList<>();
        java.util.List<Thread> subscribers = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            writers.add(new Writer("<Writer_" + i + ">", arr));
            writers.get(i).start();
        }

        Printer printer = new Printer("<Printer>", arr);
        printer.start();

        int[] index = {1,2,3,4, 5,6, 7, 8,9};

        for (int i : index) {
            subscribers.add(writers.get(i));
        }
        subscribers.add(printer);
        System.out.println("-------------------------------");

        StateLooker stateLooker = new StateLooker("<STATELOOKER>", subscribers, arr);
        stateLooker.start();

        writers.forEach(w -> {
            try {
                w.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        try {
            printer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
