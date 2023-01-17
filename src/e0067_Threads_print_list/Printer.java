package e0067_Threads_print_list;

public class Printer implements Runnable {
    Thread t;
    String name;
    Jar jar;

    int min_delay = 50;
    int max_delay = 150;



    Printer(String n, Jar j) {
        name = n;
        jar = j;
        t = new Thread(this, name);
        t.start();
        System.out.printf("%s was created...\n", t);
    }

    @Override
    public void run() {
        System.out.println(t.getState());

        while (jar.getIndex() < jar.getSIZE()) {
//        while (true) {
//        for (int i=0; i < jar.getSIZE(); i++) {
            jar.print();

            int delay = min_delay + (int) (Math.random() * max_delay);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        jar.print();

    }
}
