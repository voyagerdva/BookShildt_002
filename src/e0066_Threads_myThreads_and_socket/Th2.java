package e0066_Threads_myThreads_and_socket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

import static java.lang.Thread.sleep;

public class Th2 implements Runnable {
    String name;
    Thread t;
    int PORT;

    Th2(String n, int port) {
        name = n;
        t = new Thread(this, name);
        PORT = port;
        System.out.printf("New thread %s created.\n", name);
    }

    public static Th2 createAndStart(String name, int port) {
        Th2 th = new Th2(name, port);
        th.t.start();
        return th;
    }

    @Override
    public void run() {

        try {
            Socket socket = new Socket("localhost", PORT);
            System.out.println("SplincodeTV_Array. socket: " + socket);

            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            int i = 0;
            for (int j = 0; j < 4; j++) {
                Bag bag = new Bag(j, (j * j));
                System.out.println("sended: " + bag);
                oos.writeObject(bag);
                sleep(200);
            }

            oos.close();
            socket.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
