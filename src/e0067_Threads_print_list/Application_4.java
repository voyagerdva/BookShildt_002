package e0067_Threads_print_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Application_4 {

    public static void main(String[] args) {
        System.out.println();
        java.util.List<Thread> writers = new ArrayList<>();
        java.util.List<Thread> subwriters = new ArrayList<>();
        Array0 arr = new Array0();

        Printer printer = new Printer("<Printer>", arr);

        for (int i = 0; i < 10; i++) {
            writers.add(new Writer("<Writer_" + i + ">", arr));
        }

        System.out.println();
        System.out.println("---------------------------");
        System.out.printf("%s : %s\n", writers.get(0).getName(), writers.get(0).getState());
        System.out.printf("%s : %s\n", writers.get(2).getName(), writers.get(2).getState());
        System.out.printf("%s : %s\n", writers.get(4).getName(), writers.get(4).getState());
        System.out.printf("%s : %s\n", printer.getName(), printer.getState());
        System.out.printf("%s : %s\n", printer.t.getName(), printer.t.getState());



                System.out.println("---------------------------");
        System.out.println();
        System.out.println();


        subwriters.add(writers.get(0));
        subwriters.add(writers.get(2));
        subwriters.add(writers.get(4));
        subwriters.add(printer);

        StateLooker stateLooker = new StateLooker("<STATELOOKER>", subwriters);

        writers.forEach(w -> {
            try {
                w.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        try {
            printer.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
