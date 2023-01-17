package e0067_Threads_print_list;

import java.util.ArrayList;

public class Application_4 {

    public static void main(String[] args) {
        System.out.println();
        java.util.List<Writer> writers = new ArrayList<>();
        Arr0 arr = new Arr0();

        Printer printer = new Printer("<Printer>", arr);

        for (int i = 0; i < 10; i++) {
            writers.add(new Writer("<Writer_" + i + ">", arr));
        }


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
