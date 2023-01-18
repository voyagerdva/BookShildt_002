package e0067_Threads_print_list;

public class Writer extends Thread {
    String name;
    Array0 arr;

    Writer(String n, Array0 a) {
        name = n;
        setName(name);
        arr = a;
        System.out.printf("%s was created...\n", name);
    }

    @Override
    public void run() {
//        System.out.println(name + " : " + getState());

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
