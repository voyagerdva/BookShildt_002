package e0063_Threads_Vzaimo_Block;

public class BBBBB {
    synchronized void bar(AAAAA aaaaa) {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": ENTERED INTO METHOD BBB.bar()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + ": TRY TO CALL METHOD AAA.last()");
        aaaaa.last();
    }

    synchronized void last() {
        System.out.println(Thread.currentThread().getName() + ": IN METHOD AAA.last()");
    }
}
