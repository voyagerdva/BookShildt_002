package e0070_Threads_and_socket_try_block;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientThread7 extends Thread {
    Monitor7 monitor;
    String name;
    int PORT;

    ClientThread7(String n, int port, Monitor7 mon) {
        monitor = mon;
        name = n;
        setName(name);
        PORT = port;
        System.out.printf("%s : %s : %s  was created...\n", getName(), getPriority(), getState());
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
                Bag7 bag = new Bag7(j, (j * j));
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
//