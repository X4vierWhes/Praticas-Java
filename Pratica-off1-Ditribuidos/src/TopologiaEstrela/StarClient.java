package TopologiaEstrela;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class StarClient implements Runnable{

    private StarSocket starSocket;

    public StarClient(String host, int port) throws IOException {
        starSocket = new StarSocket(new Socket(host, port));
        init();
    }

    private void init() {
        String login;
        Scanner cin = new Scanner(System.in);
        System.out.println("Login: ");
        login = cin.next();
    }


    @Override
    public void run() {

    }
}
