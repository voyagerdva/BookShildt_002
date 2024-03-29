package e0058_Threads;

public class NewThread11111 implements Runnable {
    String name;
    Thread t;

    NewThread11111(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("NEW THREAD :  " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " IS BROKEN!!!");
        }
        System.out.println(name + " IS FINISHED!!!");
    }
}
