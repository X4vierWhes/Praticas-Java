package TopologiaAnel;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;

public class Server implements Runnable{

    ServerSocket serverSocket;
    ClientSocket clientSocket;

    int port;

    public Server(int port){
        this.port = port;
        this.run();
    }


    @Override
    public void run() {
        try {
            serverSocket = new ServerSocket(this.port); //Iniciando socket do servidor;

            System.out.println("Servidor rodando na porta " +
                    serverSocket.getLocalPort());
            System.out.println("HostAddress = " +
                    InetAddress.getLocalHost().getHostAddress());
            System.out.println("HostName = " +
                    InetAddress.getLocalHost().getHostName());

            System.out.println("Aguardando conexão do cliente...");




        } catch (IOException e) {
           e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server(4000);
    }
}
