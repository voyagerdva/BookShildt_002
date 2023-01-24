package e0070_Threads_and_socket_try_block;

import java.util.ArrayList;

public class Application7 {
    public static void main(String[] args) {
        Monitor7 monitor7 = new Monitor7();
        int PORT = 3006;

        //----------------------------------------------------------------------------

        Thread serverThread = new ServerThread7("ServerThread", PORT, monitor7);
        serverThread.start();

        Thread clientThread = new ClientThread7("ClientThread", PORT, monitor7);
        clientThread.start();

        ArrayList<Thread> subscribers = new ArrayList<>();
        subscribers.add(serverThread);
        subscribers.add(clientThread);

        Thread stateLooker = new StateLooker7("StateLooker", subscribers, monitor7);
        stateLooker.start();

        //----------------------------------------------------------------------------

        try {
            serverThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            clientThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            stateLooker.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
//