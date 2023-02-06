package e0076_Threads_HANDLE_BY_KEYBOARD;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Application11 {
    public static void main(String[] args) {
        System.out.println("BEFORE FUTURE");

        ExecutorService executorService;
        Future future = null;
        Future future2;
        Future future3;

        executorService = Executors.newFixedThreadPool(100);
        System.out.println("RUN1");


        Callable<Object> callable1 = new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                Thread.sleep(1000);
                System.out.println("BLA BLA");
                return new String("RESULT");
            }
        };

        for (int i = 0; i < 100; i++) {
            future = executorService.submit(callable1);
        }


        Object obj = new Object();

        List<Thread> thList = new ArrayList<>();
        thList.add(Th11.createAndStart("Th_1", future));
        thList.add(Th11.createAndStart("Th_2", future));
        thList.add(Th11.createAndStart("Th_3", future));


        Printer11 controller = Printer11.createAndStart("Th1", thList);
        KeyHandler11 keyHandler = new KeyHandler11("KEY_HANDLER", obj, thList);
        keyHandler.start();




    }

}