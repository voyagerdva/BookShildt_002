package e0074_Threads_MY_INVESTIGATIONS_WITH_OBJ_AND_MONITOR_BASED_ON_ANDREYS_PROJECT;

public class Monitor10 {
    public boolean STOP = false;
    long a = 1L;
    int j = 1;


//    public synchronized void makeWork() {
    public void makeWork() {
        while (true) {
            a *= j;
            j++;

            if (a > 1_000_000_000L) {
                a = 1;
            }
//            System.out.println("BEFORE IF: STOP = " + STOP);
            if (STOP == true) {
                System.out.println("INSIDE IF: STOP = " + STOP);
                STOP = false;
                return;
            }
//            for (int i = 0; i < 5; i++) {
//                a = a + j;
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }
    }

    public void stopTrue() {
        System.out.println("stopTrue() - 2, STOP = " + STOP);
        STOP = true;
        System.out.println("stopTrue() - 2, STOP = " + STOP);
    }
}
