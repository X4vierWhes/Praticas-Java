package TopologiaAnel;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{

    ServerSocket serverSocket;
    ClientSocket clientSocket;

    int port;

    public Server(int port){
        this.port = port;
        this.run();
    }


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
            String login;

            this.connectionLoop(); //Entrando em loop ue conectara os clientes

        } catch (IOException e) {
           e.printStackTrace();
        }
    }

    private void connectionLoop() throws IOException {
        //Conexão com cliente

        String msg;

        while(true){

            clientSocket = new ClientSocket(serverSocket.accept());
            //Extraindo nome de Login;
            if(((msg = clientSocket.readMessage()) != null) && (clientSocket.getLogin() == null) && clientSocket != null){
                System.out.print("Conexão " +
                        (ImplServer.cont++) +
                        " com o cliente "+
                        clientSocket.getHostAddress() +
                        "/" +
                        clientSocket.getHostName()
                );
                clientSocket.login = msg;
                System.out.print(" Conectado como -> " + clientSocket.getLogin());
                System.out.println();
            }


            ImplServer server = new ImplServer(clientSocket);
            Thread t = new Thread(server);
            t.start();

        }
    }

    public static void main(String[] args) {
        //new Server((1%4)*1111 + 1111); //2222
        //new Server((2%4)*1111 + 1111); //3333
        //new Server((3%4)*1111 + 1111); //4444
        //new Server((4%4)*1111 + 1111); //1111

    }
}

class main1{
    public static void main(String[] args) {
        new Server((1%4)*1111 + 1111); //2222
    }
}

class main2{
    public static void main(String[] args) {
        new Server((2%4)*1111 + 1111); //2222
    }
}

class main3{
    public static void main(String[] args) {
        new Server((3%4)*1111 + 1111); //2222
    }
}

class main4{
    public static void main(String[] args) {
        new Server((4%4)*1111 + 1111); //2222
    }
}