package e0058_Threads;

public class MultiThreadDemo111DemoJoin {
    public static void main(String[] args) {

        NewThread11111 ob1 = new NewThread11111("(I )");
        NewThread11111 ob2 = new NewThread11111("(II)");
        NewThread11111 ob3 = new NewThread11111("THREE");

        System.out.println("T1 run: " + ob1.t.isAlive());
        System.out.println("T2 run: " + ob2.t.isAlive());
        System.out.println("T3 run: " + ob3.t.isAlive());

        try {
            System.out.println("Wating threads finish!!!");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("MAIN THREAD IS BROKEN!!!");
        }

        System.out.println("T1 run: " + ob1.t.isAlive());
        System.out.println("T2 run: " + ob2.t.isAlive());
        System.out.println("T3 run: " + ob3.t.isAlive());

        System.out.println("MAIN THREAD IS FINISHED!!!");

    }
}
////