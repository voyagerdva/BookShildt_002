package e0074_Threads_Andrey;

import e0076_Threads_HANDLE_BY_KEYBOARD.Th11;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Controller12 extends Thread {
    String name;
    List<Thread> threadList;

    boolean suspend = false;
    boolean t1 = true;
    boolean t2 = true;
    boolean t3 = false;

    Controller12(String n, List<Thread> threadList) {
        name = n;
        this.threadList = threadList;
        System.out.printf("New thread %s created.\n", name);
    }

    public static Controller12 createAndStart(String name, List<Thread> threadList) {
        Controller12 th = new Controller12(name, threadList);
        th.start();
        return th;
    }

    @Override
    public void run() {

        while (true){
            threadList.forEach(t -> {System.out.printf(
                    "%s - %s, %s : %s\n",
                    t.getName(),
                    t.getState(),
                    ((Th12) t).conditionWait,
                    ((Th12) t).conditionNotify);
            });
            System.out.println();

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            ((Th2)threadList.get(1)).condition = true;
            if(t1) {
                ((Th12) threadList.get(0)).monitorWait(true);
                t1 = false;
            }

            if(t1) {
                ((Th12) threadList.get(1)).monitorNotify(true);
                t2 = false;
            }
//            ((Th2)threadList.get(0)).condition = true;
        }

    }
}