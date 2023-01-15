package e0063_Threads_Vzaimo_Block;

public class AAAAA {
    synchronized void foo(BBBBB bbbbb) {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": ENTERED INTO METHOD AAA.foo()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + ": TRY TO CALL METHOD BBB.last()");
        bbbbb.last();
    }

    synchronized void last() {
        System.out.println(Thread.currentThread().getName() + ": IN METHOD AAA.last()");
    }
}
