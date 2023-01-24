package e0067_Threads_print_list;

import java.util.Arrays;

public class Array0 {
    double b = 1.123D;

    private int SIZE = 150;
    private int index = 0;
    public int[] arr = new int[SIZE];

    private boolean stopFlag = false;

    int min_number = 0;
    int max_number = 100;

    public synchronized void write() throws InterruptedException, ArrayIndexOutOfBoundsException {
        int number = min_number + (int) (Math.random() * max_number);
        arr[index] = number;
        index++;

        for (int j = 1; j < 10000; j++) {
            b *= j;
        }
//        System.err.println("=============== : " + b);

    }


    public synchronized void print() {
        System.out.println(Arrays.toString(arr));
        for (int j = 1; j < 10000; j++) {
            b *= j;
        }
//        System.err.println("=============== : " + b);

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getIndex() {
        return index;
    }

    public int getSIZE() {
        return SIZE;
    }

    public void stop() {
        stopFlag = true;
    }

    public boolean getStopFlag() {
        return stopFlag;
    }
}
////