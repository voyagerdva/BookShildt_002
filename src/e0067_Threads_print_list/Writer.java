package e0067_Threads_print_list;

public class Writer implements Runnable {
    Thread t;
    String name;
    Jar jar;

    Writer(String n, Jar j) {
        name = n;
        jar = j;
        t = new Thread(this, name);
        t.start();
        System.out.printf("%s was created...\n", t);
    }

    @Override
    public void run() {
        System.out.println(t + " : " + t.getState());

        while (jar.getIndex() < jar.getSIZE()) {
            try {
                jar.write();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.printf("%s : %s : OUT OF INDEX ARRAY\n", Thread.currentThread().getName(), e);
            }

        }

    }
}
