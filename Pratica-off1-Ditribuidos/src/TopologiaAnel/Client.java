package TopologiaAnel;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client{

    public ClientSocket clientSocket;

    public void run(){

        System.out.println("HostAddress = " + clientSocket.getHostAddress());
        System.out.println("HostName = " + clientSocket.getHostName());

        System.out.println(clientSocket.getLogin() + " " + clientSocket.getIp());


        ImplClient c = new ImplClient(clientSocket);
        Thread t = new Thread(c);
        t.start();

    }


    public Client(String host, int port){
        String login;
        try {
            System.out.println("Login: ");
            Scanner cin = new Scanner(System.in);
            login = cin.next();
            //System.out.println(login);

            clientSocket = new ClientSocket(new Socket(host, port), login);
            clientSocket.setIp(host);
            clientSocket.sendMensage(clientSocket.getLogin()); //Enviando Login para servidor
            this.run();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Client("127.0.0.1", (1%4)*1111 + 1111); //2222
        //new Client("127.0.0.1", (2%4)*1111 + 1111); //3333
        //new Client("127.0.0.1", (3%4)*1111 + 1111); //4444
        //new Client("127.0.0.1", (4%4)*1111 + 1111); //1111

    }


}
