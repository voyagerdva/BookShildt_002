package e0067_Threads_print_list;

import java.util.ArrayList;

public class Application_4 {

    public static void main(String[] args) {
        System.out.println();
        java.util.List<Writer> writers = new ArrayList<>();
        Jar jar = new Jar();

        Printer printer = new Printer("<Printer>", jar);

        for (int i = 0; i < 10; i++) {
            writers.add(new Writer("<Writer_" + i + ">", jar));
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

//        printer.t.getState();
//
//        jar.print();
//
//
//        writers.forEach(w -> {
//            w.t.getState();});
//
//

    }
}
