package e0074_Threads_BLOCKED_try_2;

import java.util.ArrayList;
import java.util.List;

public class Application10 {
    public static void main(String[] args) {

        Object obj = new Object();
        Monitor10 monitor = new Monitor10();

        List<Thread> thList = new ArrayList<>();
        thList.add(Th10.createAndStart("Th_1", obj));
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thList.add(Th10.createAndStart("Th_2",  obj));
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thList.add(Th10.createAndStart("Th_3",  obj));


        Controller10 controller = Controller10.createAndStart("Th1", thList);
        KeyHandler10 keyHandler = new KeyHandler10("KEY_HANDLER", obj, thList);
        keyHandler.start();
    }

}