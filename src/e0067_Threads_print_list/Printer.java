package e0067_Threads_print_list;

public class Printer extends Thread {
    String name;
    Array0 arr;

    int min_delay = 50;
    int max_delay = 150;

    Printer(String n, Array0 a) {
        name = n;
        setName(name);
        arr = a;
        System.out.printf("%s was created...\n", name);
    }

    @Override
    public void run() {
        System.out.println(getState());

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
        arr.stop();

    }
}
