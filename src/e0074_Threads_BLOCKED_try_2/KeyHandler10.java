package e0074_Threads_BLOCKED_try_2;

import java.io.*;
import java.util.List;

public class KeyHandler10 extends Thread {
    String name;
    int digital;
    String simbol;

    List<Thread> threadList;

    Object monitor;
//    Monitor10 monitor;

    boolean t1 = true;
    boolean t2 = true;
    boolean t3 = false;

    KeyHandler10(String n, Object monitor, List<Thread> threadList) {
//    KeyHandler10(String n, Monitor10 monitor, List<Thread> threadList) {
        this.threadList = threadList;
        this.monitor = monitor;
        name = n;
        setName("name");
        System.out.printf("%s : %s : %s  was created...\n", getName(), getPriority(), getState());
    }

    @Override
    public void run() {
        InputStream inputStream = System.in;

        while (true) {
            try {
                Reader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                System.err.println("ЧИТАЕМ СТРОКУ С КЛАВЫ:...\n");
                simbol = bufferedReader.readLine(); //читаем строку с клавиатуры

                if (simbol.equals("w")) {
                    System.err.println("Вы ввели: " + simbol);
                    ((Th10) threadList.get(0)).conditionWait = true;

//                    synchronized (monitor) {
//                        monitor.wait();
//                    }
                } else if (simbol.equals("n")) {
                    System.err.println("Вы ввели: " + simbol);
                    ((Th10) threadList.get(0)).conditionNotify = true;

//                    synchronized (monitor) {
//                        monitor.notify();
//                    }
                } else {
                    System.err.println("Нет совпадений на '" + simbol + "'");
                }


//                switch (simbol) {
//                    case "w":
//                        System.err.println("ввели: " + simbol);
//                        synchronized (monitor) {
//                            monitor.STOP = true;
//                            monitor.wait();
//                        }
//                        continue;
//                    case "n":
//                        System.err.println("ввели: " + simbol);
//                        synchronized (monitor) {
//                            monitor.STOP = true;
//                            monitor.notify();
//                        }
//                        continue;
//                    default:
//                        System.err.println("Нет совпадений...");
//                }
            } catch (Exception e) {
                System.err.println(">>> HANDLED EXCEPTION !!! <<<" + e.toString());
            }
        }
    }


}
