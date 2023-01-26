package e0074_Threads_MY_INVESTIGATIONS_WITH_OBJ_AND_MONITOR_BASED_ON_ANDREYS_PROJECT;

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

                switch (simbol) {
                    case "w1":
                        System.err.println("Вы ввели: " + simbol);
                        ((Th10) threadList.get(0)).conditionWait = true;
                        continue;
                    case "w2":
                        System.err.println("Вы ввели: " + simbol);
                        ((Th10) threadList.get(1)).conditionWait = true;
                        continue;
                    case "w3":
                        System.err.println("Вы ввели: " + simbol);
                        ((Th10) threadList.get(2)).conditionWait = true;
                        continue;
                    case "e1":
                        System.err.println("Вы ввели: " + simbol);
                        ((Th10) threadList.get(0)).conditionNotify = true;
                        continue;
                    case "e2":
                        System.err.println("Вы ввели: " + simbol);
                        ((Th10) threadList.get(1)).conditionNotify = true;
                        continue;
                    case "e3":
                        System.err.println("Вы ввели: " + simbol);
                        ((Th10) threadList.get(2)).conditionNotify = true;
                        continue;
                    default:
                        System.err.println("Нет совпадений...");
                }
            } catch (Exception e) {
                System.err.println(">>> HANDLED EXCEPTION !!! <<<" + e.toString());
            }
        }
    }


}
