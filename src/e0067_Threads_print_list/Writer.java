package e0067_Threads_print_list;

public class Writer implements Runnable {
    Thread t;
    String name;
    Arr0 arr;

    Writer(String n, Arr0 a) {
        name = n;
        arr = a;
        t = new Thread(this, name);
        t.start();
        System.out.printf("%s was created...\n", t);
    }

    @Override
    public void run() {
        System.out.println(t + " : " + t.getState());

        while (arr.getIndex() < arr.getSIZE()) {
            try {
                arr.write();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.printf("%s : %s : OUT OF INDEX ARRAY\n", Thread.currentThread().getName(), e);
            }

        }

    }
}
