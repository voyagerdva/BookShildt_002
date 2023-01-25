package e0070_Threads_and_socket_try_block;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread7 extends Thread {
    Monitor7 monitor;
    String name;
    int PORT;

    ServerThread7(String n, int port, Monitor7 mon) {
        monitor = mon;
        PORT = port;
        name = n;
        setName(name);
        System.out.printf("%s : %s : %s  was created...\n", getName(), getPriority(), getState());
    }

    @Override
    public void run() {

        try {
            ServerSocket server = new ServerSocket(PORT);
            System.out.printf("\nThread: %s, Application: Bag, server started\n", name);

            Thread.sleep(2000);

            Socket socket = server.accept();

            System.out.println("Connection accepted: " + socket);

            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            while (socket.isConnected()) {
                Bag7 bag = (Bag7) ois.readObject();
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