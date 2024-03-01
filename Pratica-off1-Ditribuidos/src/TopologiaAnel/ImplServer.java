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
                    try {
                        this.sendMsgToAll(msg, clientSocket); //Enviar mensagens para todos;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else{
                    this.sendMsgToOne(msg, clientSocket); //Enviar mensagens so para uma pessoa;
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




    public void sendMsgToAll(String msg, ClientSocket remetente) throws IOException { //Broadcast
        int portRemetente = (remetente.getPort() /1111) - 1;
        //System.out.println("Numero da porta remetente: " + portRemetente);
        //System.out.println("Host do remetente: " + remetente.getHostAddress());
        //Ideia é andar em sentido horario enviando a mensagem ate chegar novamente no remetente

        //String host = remetente.getHostAddress();
        int portNext = portRemetente + 1;
        //System.out.println("PortNext:" + portNext);
        int portsocket = (portNext%4)*1111 + 1111;
        System.out.println("PortSocket next: " + portsocket);
        ClientSocket next = new ClientSocket(new Socket("127.0.0.1", portsocket));
        //System.out.println("Porta do Destinatario: " + next.getPort());
        //System.out.println("Host do destinatario: " + next.getHostAddress());
        next.sendMensage("@" + clientSocket.getLogin() + ": " +msg);
        //next.readMessage();
        //Logica de passar pro proximo;
        //while(true){

          //  Socket next = new Socket();
           // if()
       // }
    }

    public void sendMsgToOne(String msg, ClientSocket remetente){ //Unicast
        System.out.println("Entrou");
    }


}
