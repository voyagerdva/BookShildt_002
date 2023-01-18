package e0068_Threads_print_list_TRANSFER_THREADS_LIST_TO_THREAD;

import java.util.ArrayList;

public class Application_5 {

    public static void main(String[] args) {
        System.out.println();
        java.util.List<Writer1> writers = new ArrayList<>();
        java.util.List<Writer1> subwriters = new ArrayList<>();
        Array1 arr = new Array1();

        Printer1 printer = new Printer1("<Printer>", arr);

        for (int i = 0; i < 10; i++) {
            writers.add(new Writer1("<Writer_" + i + ">", arr));
        }

        subwriters.add(writers.get(0));
        subwriters.add(writers.get(2));
        subwriters.add(writers.get(4));

        StateLooker1 stateLooker = new StateLooker1("<STATELOOKER>", subwriters);

        writers.forEach(w -> {
            try {
                w.t.join();
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
