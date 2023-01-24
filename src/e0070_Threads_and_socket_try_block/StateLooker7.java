package e0070_Threads_and_socket_try_block;


import java.util.ArrayList;
import java.util.List;

public class StateLooker7 extends Thread{
    String name;
    List<Thread> subscribers = new ArrayList<>();
    Monitor7 monitor;


    StateLooker7(String n, List<Thread> threads, Monitor7 m) {
        monitor = m;
        name = n;
        setName(name);
        threads.forEach(th -> {
            subscribers.add(th);
            System.out.printf("\nfrom constructor StateLooker1 : %s : %s\n", th.getName(), th.getState());
        });

        System.out.printf("%s : %s : %s  was created...\n", getName(), getPriority(), getState());
    }


    @Override
    public void run() {
        System.out.printf("\nFrom %s .run() : %s was created...\n", name, getState());

        while (subscribers.get(0).isAlive()) {
            subscribers.forEach(s -> {
                System.out.printf("%s sais: %s , %s\n", name, s.getName(), s.getState());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        subscribers.forEach(s -> {
            System.out.printf("%s sais: %s , %s\n", name, s.getName(), s.getState());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

    }
}
