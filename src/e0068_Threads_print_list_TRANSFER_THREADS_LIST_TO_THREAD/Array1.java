package e0068_Threads_print_list_TRANSFER_THREADS_LIST_TO_THREAD;

import java.util.Arrays;

public class Array1 {
    private int SIZE = 50;
    private int index = 0;
    public int[] arr = new int[SIZE];

    int min_number = 0;
    int max_number = 100;

    public synchronized void write() throws InterruptedException, ArrayIndexOutOfBoundsException {
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
