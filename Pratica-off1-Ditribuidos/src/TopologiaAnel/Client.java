package TopologiaAnel;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Runnable{

    ClientSocket clientSocket;
    @Override
    public void run() {

    }

    public Client(String host, int port){
        try {
            clientSocket = new ClientSocket(new Socket(host, port));
            System.out.println("Login: ");
            Scanner cin = new Scanner(System.in);
            clientSocket.setLogin(cin.nextLine());
            this.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Client("127.0.0.1", 1111);
    }
}
