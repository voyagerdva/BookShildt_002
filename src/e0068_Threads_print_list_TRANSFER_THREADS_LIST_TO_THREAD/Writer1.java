package e0068_Threads_print_list_TRANSFER_THREADS_LIST_TO_THREAD;

public class Writer1 implements Runnable {
    Thread t;
    String name;
    Array1 arr;

    Writer1(String n, Array1 a) {
        name = n;
        arr = a;
        t = new Thread(this, name);
        t.start();
        System.out.printf("%s was created...\n", t);
    }

//    public static Writer1 createAndStart(String name, Array1 a) {
//        Writer1 w = new Writer1(name, a);
//        w.t.start();
//        return w;
//    }



//======  ОБРАЗЕЦ ИЗ ДР. ПРОЕКТА :
//    Th1(String n, int port) {
//        PORT = port;
//        name = n;
//        t = new Thread(this, name);
//        System.out.printf("New thread %s created.\n", name);
//    }









    @Override
    public void run() {
        System.out.println(t + " : " + t.getState());


//        while (arr.getIndex() < arr.getSIZE()) {
//            try {
//                arr.write();
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.err.printf("%s : %s : OUT OF INDEX ARRAY\n", Thread.currentThread().getName(), e);
//            }
//
//        }

    }
}
