package e0067_Threads_print_list;

public class Printer implements Runnable {
    Thread t;
    String name;
    Arr0 arr;

    int min_delay = 50;
    int max_delay = 150;

    Printer(String n, Arr0 a) {
        name = n;
        arr = a;
        t = new Thread(this, name);
        t.start();
        System.out.printf("%s was created...\n", t);
    }

    @Override
    public void run() {
        System.out.println(t.getState());

        while (arr.getIndex() < arr.getSIZE()) {
            arr.print();

            int delay = min_delay + (int) (Math.random() * max_delay);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        arr.print();

    }
}
