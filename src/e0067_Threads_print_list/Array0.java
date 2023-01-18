package e0067_Threads_print_list;

import java.util.Arrays;

public class Array0 {
    int a, b, c, d = 1;

    private int SIZE = 150;
    private int index = 0;
    public int[] arr = new int[SIZE];

    private boolean stopFlag = false;

    int min_number = 0;
    int max_number = 100;

    public synchronized void write() throws InterruptedException, ArrayIndexOutOfBoundsException {
        int number = min_number + (int) (Math.random() * max_number);
        arr[index] = number;
//        System.out.printf("%s : %s\n", index, Thread.currentThread().getName());
        index++;

        for (int j = 0; j < 200; j++) {
            a *= j;
        }
    }


    public synchronized void print() {
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < 200; j++) {
            b *= j;
        }


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
