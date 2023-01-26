package e0076_Threads_HANDLE_BY_KEYBOARD;

import java.util.List;

public class Printer11 extends Thread {
    String name;
    List<Thread> threadList;

    Printer11(String n, List<Thread> threadList) {
        name = n;
        this.threadList = threadList;
        System.out.printf("New thread %s created.\n", name);
    }

    public static Printer11 createAndStart(String name, List<Thread> threadList) {
        Printer11 th = new Printer11(name, threadList);
        th.start();
        return th;
    }

    @Override
    public void run() {

        while (true){
            threadList.forEach(t -> {
                System.out.printf(
                        "%s - %s, %s : %s\n",
                        t.getName(),
                        t.getState(),
                        ((Th11) t).conditionWait,
                        ((Th11) t).conditionNotify);
            });
            System.out.println();

            try {
                sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}