package e0074_Threads_Andrey;

import java.util.ArrayList;
import java.util.List;

public class Application12 {
    public static void main(String[] args) {

        Object obj = new Object();

        List<Thread> list = new ArrayList<>();
        list.add(Th12.createAndStart("Th_1",  obj));
        list.add(Th12.createAndStart("Th_2",  obj));
        list.add(Th12.createAndStart("Th_3",  obj));


        Controller12 controller = Controller12.createAndStart("CONTROLLER",  list);


    }

}