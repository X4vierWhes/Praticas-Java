package TopologiaEstrela;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

public class StarServer implements Runnable{

    private ServerSocket serverSocket;

    private List<StarSocket> clientsList;

    public StarServer(int port) throws IOException {
        this.serverSocket = new ServerSocket(port);
        this.clientsList = new ArrayList<>();
        this.start();
    }

    private void start() {
        try {

            System.out.println("Servidor rodando na porta " +
                    serverSocket.getLocalPort());
            System.out.println("HostAddress = " +
                    InetAddress.getLocalHost().getHostAddress());
            System.out.println("HostName = " +
                    InetAddress.getLocalHost().getHostName());

            System.out.println("Aguardando conexão do cliente...");

            this.connectionLoop(); //Entrando em loop que conectara os clientes

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void connectionLoop() throws IOException {
        while(true){
            clientsList.add(new StarSocket(serverSocket.accept()));
        }
    }

    @Override
    public void run() {

    }
}
