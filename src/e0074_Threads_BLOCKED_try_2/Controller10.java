package e0074_Threads_BLOCKED_try_2;

import java.util.List;

public class Controller10 extends Thread {
    String name;
    List<Thread> threadList;

    boolean suspend = false;
    boolean t1 = true;
    boolean t2 = true;
    boolean t3 = false;

    Controller10(String n, List<Thread> threadList) {
        name = n;
        this.threadList = threadList;
        System.out.printf("New thread %s created.\n", name);
    }

    public static Controller10 createAndStart(String name, List<Thread> threadList) {
        Controller10 th = new Controller10(name, threadList);
        th.start();
        return th;
    }

    @Override
    public void run() {

        while (true){
            threadList.forEach(t -> System.out.println(t.getName() + " - " + t.getState()));
            System.out.println();
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            ((Th2)threadList.get(1)).condition = true;
//            if(t1) {
//                ((Th10) threadList.get(0)).monitorWait(true);
//                t1 = false;
//            }
//
//            if(t2) {
//                ((Th10) threadList.get(1)).conditionWhileTrue = true;
//                t2 = false;
//            }
//            ((Th2)threadList.get(0)).condition = true;
        }

    }
}