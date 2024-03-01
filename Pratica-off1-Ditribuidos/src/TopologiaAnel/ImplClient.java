package TopologiaAnel;

import java.io.IOException;
import java.util.Scanner;

public class ImplClient implements Runnable{

    private final ClientSocket clientSocket;
    private boolean connect = true;



    public ImplClient(ClientSocket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        System.out.println("O cliente conectou ao servidor como " +
                clientSocket.getLogin());



        System.out.println("BEM VINDO AO GRUPO! INICIE SUA CONVERSA:");
        System.out.println("*********COMANDOS***********");
        System.out.println("use @ e o nome de quem deseja mandar uma mensagem privada;");
        System.out.println("Digite FIM para desconectar do servidor.");

        String msg;
        Scanner teclado = new Scanner(System.in);



        //Enviar mensagens ao servidor.
        while (connect){
            msg = teclado.nextLine();

            if(!msg.equalsIgnoreCase("fim")) {
                clientSocket.sendMensage(msg);
                //clientSocket.sendMensage("@" + clientSocket.getLogin() + ": " + msg);
            }else{
                connect = false;
            }

            //new Thread(this::msgLoop).start();
        }

        clientSocket.close();

        System.out.println("Voce desconectou.");

    }

    private void msgLoop() {

    }
}
