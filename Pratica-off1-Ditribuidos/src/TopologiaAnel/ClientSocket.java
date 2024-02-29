package TopologiaAnel;

import java.io.*;
import java.net.Socket;


public class ClientSocket implements Closeable { //Implementando closeable para fazer o proprio socket;
    private final Socket socket; //Socket padrão;

    private String login; //Nome do usuario;

    private final BufferedReader cin; //Ler mensagens do enviadas ou recebidas do cliente;

    private final PrintWriter cout; // Enviar mensagens do Cliente para o Servidor e vice versa;



    public ClientSocket(Socket socket) throws IOException { //Construtor do Socket;
        this.socket = socket;
        this.cin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.cout = new PrintWriter(socket.getOutputStream(), true);

    }

    public boolean sendMensage(String str){
        cout.println(str);

        return !cout.checkError();
    }

    public String readMessage(){
        try {
            return cin.readLine();
        } catch (IOException e) {
            return null;
        }
    }



    public String getLogin(){
        return this.login;
    }

    public void setLogin(String str){
        this.login = login;
    }

    @Override
    public void close(){
        try {
            cin.close();
            cout.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public boolean isClosed(){
        return socket.isClosed();
    }
}
