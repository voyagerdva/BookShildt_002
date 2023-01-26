package e0076_Threads_HANDLE_BY_KEYBOARD;

import e0074_Threads_Andrey.Th12;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

public class KeyHandler11 extends Thread {
    String name;
    int digital;
    String simbol;

    List<Thread> threadList;

    Object monitor;

    boolean t1 = false;
    boolean t2 = false;
    boolean t3 = false;

    KeyHandler11(String n, Object monitor, List<Thread> threadList) {
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

                System.err.println("ВВЕДИТЕ ЧТО-ТО ИЗ { t1, t2 } :...\n");
                simbol = bufferedReader.readLine(); //читаем строку с клавиатуры

                switch (simbol) {

                    case "t1":
                        System.err.println("Остановлен поток 1: " + simbol);
                        t1 = true;
                        ((Th11) threadList.get(0)).monitorWait(true);
                        t1 = false;
                        continue;
                    case "t2":
                        System.err.println("Остановлен поток 3: " + simbol);
                        t2 = true;
                        ((Th11) threadList.get(1)).conditionWhileTrue = true;
                        t2 = false;
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
