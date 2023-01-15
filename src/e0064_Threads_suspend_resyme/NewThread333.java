package e0064_Threads_suspend_resyme;

public class NewThread333 implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread333(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println();
        System.out.println("NEW THREAD: " + t);
        suspendFlag = false;
        t.start();
        System.out.println("finish constructor of " + name + "\n");
    }

    public void run() {
        System.out.println(">NewThread333.run() by thread: " + name);

        try {
            System.out.println(">NewThread333.try{} by thread: " + name);
            for (int i = 15; i > 0; i--) {
//                System.out.println("Iterations of FOR cicle by thread: " + name);
                //ниже этой строчки поток почему не не доходит в начале. Обрывается здесь, возвращается в 14 строчку и выходит из конструктора
                System.out.println(name + ": " + i);
                Thread.sleep(200);

                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " BROKEN.");
        }

        System.out.println(name + " FINISHED.");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        System.out.println("SEND NOTIFY --> from thread >" + Thread.currentThread().getName() + "<");
        notify();
    }
}
