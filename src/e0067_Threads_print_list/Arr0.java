package e0067_Threads_print_list;

import java.util.Arrays;

public class Arr0 {
    private int SIZE = 100;
    private int index = 0;
    public int[] arr = new int[SIZE];


    int min_number = 0;
    int max_number = 100;

    private boolean stop = false;

    public synchronized void write() throws InterruptedException, ArrayIndexOutOfBoundsException {

        while (stop) {
            wait();
        }

        int number = min_number + (int) (Math.random() * max_number);
        arr[index] = number;
        System.out.printf("%s : %s\n", index, Thread.currentThread().getName());
        index++;
    }


    public synchronized void print() {
        System.out.println(Arrays.toString(arr));
    }

    public int getIndex() {
        return index;
    }

    public int getSIZE() {
        return SIZE;
    }
}
