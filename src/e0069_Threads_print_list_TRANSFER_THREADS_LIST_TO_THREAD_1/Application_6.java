package e0069_Threads_print_list_TRANSFER_THREADS_LIST_TO_THREAD_1;

import java.util.ArrayList;

public class Application_6 {

    public static void main(String[] args) {
        Monitor monitor = new Monitor();

        System.out.println();
        Array2 arr = new Array2();

        java.util.List<Thread> writers = new ArrayList<>();
        java.util.List<Thread> subscribers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            writers.add(new Writer2("<Writer_" + i + ">", arr, monitor));
            writers.get(i).start();
        }
        Printer2 printer = new Printer2("<Printer>", arr, monitor);
        printer.start();


        int[] index = {3, 5, 7, 8};

        for (int i : index) {
            subscribers.add(writers.get(i));
        }
        subscribers.add(printer);
        System.out.println("-------------------------------");

        StateLooker2 stateLooker = new StateLooker2("<STATELOOKER>", subscribers, monitor);
        stateLooker.start();

    }
}
//