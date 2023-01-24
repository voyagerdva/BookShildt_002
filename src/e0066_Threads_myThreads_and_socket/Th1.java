package e0066_Threads_myThreads_and_socket;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Th1 implements Runnable {
    String name;
    Thread t;
    int PORT;
    boolean suspend = false;

    ObjectInputStream ois;
    ObjectOutputStream oos;


    Th1(String n, int port) {
        PORT = port;
        name = n;
        t = new Thread(this, name);
        System.out.printf("New thread %s created.\n", name);
    }

    public static Th1 createAndStart(String name, int port) {
        Th1 th = new Th1(name, port);
        th.t.start();
        return th;
    }

    @Override
    public void run() {

        try {
            ServerSocket server = new ServerSocket(3004);
            System.out.printf("Thread: %s, Application: Bag, server started\n", name);

            Socket socket = server.accept();

            System.out.println("Connection accepted: " + socket);

            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());

            while (socket.isConnected()) {
                Bag bag = (Bag) ois.readObject();
                System.out.printf("Получен объект %s, в нем поля: %s / %s\n", bag, bag.x, bag.y);
            }

            ois.close();
            socket.close();
            server.close();
        } catch (Exception e) {
            System.err.println("-= EXCEPTION HANDLER =-\nBROKEN with EXCEPTION:");
            e.printStackTrace();
        }
    }
}
//