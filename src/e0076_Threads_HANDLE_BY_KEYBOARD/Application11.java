package e0076_Threads_HANDLE_BY_KEYBOARD;

import java.util.ArrayList;
import java.util.List;

public class Application11 {
    public static void main(String[] args) {

        Object obj = new Object();

        List<Thread> thList = new ArrayList<>();
        thList.add(Th11.createAndStart("Th_1", obj));
        thList.add(Th11.createAndStart("Th_2", obj));
        thList.add(Th11.createAndStart("Th_3", obj));


        Printer11 controller = Printer11.createAndStart("Th1", thList);
        KeyHandler11 keyHandler = new KeyHandler11("KEY_HANDLER", obj, thList);
        keyHandler.start();
    }

}