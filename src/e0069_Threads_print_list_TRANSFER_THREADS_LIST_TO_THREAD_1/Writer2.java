package e0069_Threads_print_list_TRANSFER_THREADS_LIST_TO_THREAD_1;

public class Writer2 extends Thread {
    Monitor monitor;
    String name;
    Array2 arr;

    Writer2(String n, Array2 a, Monitor m) {
        monitor = m;
        name = n;
        arr = a;
        setName(name);
        System.out.printf("%s : %s : %s  was created...\n", getName(), getPriority(), getState());
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
        System.out.printf("%s : %s : %s\n", getName(), getPriority(), getState());
        System.out.printf("%s : %s : %s\n", name, getPriority(), getState());


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
//