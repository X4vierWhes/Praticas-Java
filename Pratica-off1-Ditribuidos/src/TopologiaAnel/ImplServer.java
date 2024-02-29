package TopologiaAnel;

import java.io.IOException;
import java.util.Scanner;

public class ImplServer implements Runnable{

    public ClientSocket clientSocket;
    private boolean connect = true;

    public static int cont = 1;

    public Scanner s = null;
    public ImplServer(ClientSocket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {

        this.mensageLoop();
    }

    public void mensageLoop(){
        String msg;

            //Servidor recebendo mensagens dos clientes
        while(connect){
            if( (msg = clientSocket.readMessage())  != null &&!("fim".equalsIgnoreCase(msg))){
                System.out.println(clientSocket.getHostName() + " / " + clientSocket.getPort()  +
                        " / " + clientSocket.getLogin() +
                        " -> " + msg);
            }else{
                connect = false;
            }
        }
    }


}
