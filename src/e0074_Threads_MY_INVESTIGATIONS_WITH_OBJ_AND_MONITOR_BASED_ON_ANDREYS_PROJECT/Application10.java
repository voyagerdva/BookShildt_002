package e0074_Threads_MY_INVESTIGATIONS_WITH_OBJ_AND_MONITOR_BASED_ON_ANDREYS_PROJECT;

import java.util.ArrayList;
import java.util.List;

public class Application10 {
    public static void main(String[] args) {

//        Object obj = new Object();
        Monitor10 obj = new Monitor10();

        List<Thread> thList = new ArrayList<>();
        thList.add(Th10.createAndStart("Th_1", obj));
        thList.add(Th10.createAndStart("Th_2",  obj));
        thList.add(Th10.createAndStart("Th_3",  obj));


        Controller10 controller = Controller10.createAndStart("Th1", thList);
        KeyHandler10 keyHandler = new KeyHandler10("KEY_HANDLER", obj, thList);
        keyHandler.start();
    }

}