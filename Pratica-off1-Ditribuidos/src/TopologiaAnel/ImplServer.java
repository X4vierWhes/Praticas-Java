package TopologiaAnel;

import java.io.IOException;
import java.net.Socket;
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

                if(destinationToAll(msg)){ //Funçao que verifica se alguem foi mencionado no inicio da mensagem
                    this.sendMsgToAll(msg, clientSocket);
                }else{
                    this.sendMsgToOne(msg, clientSocket);
                }
            }else{
                connect = false;
            }
        }
    }

    private boolean destinationToAll(String msg) {
        if(msg.charAt(0) != '@'){ //Se primeiro caracter da mensagem for um @, alguem foi mencionado no chat e a mensagem sera privada;
            return true;
        }else{
            return false;
        }
    }




    public void sendMsgToAll(String msg, ClientSocket remetente){ //Broadcast
        int port = (remetente.getPort() /1111) - 1;
        System.out.println("Numero da porta: " + port);
        System.out.println("Host: " + remetente.getHostAddress());
        //while()
    }

    public void sendMsgToOne(String msg, ClientSocket remetente){ //Unicast
        System.out.println("Entrou");
    }


}
