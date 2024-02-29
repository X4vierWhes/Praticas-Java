package TopologiaAnel;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


public class ClientSocket implements Closeable { //Implementando closeable para fazer o proprio socket;
    private final Socket socket; //Socket padrão;

    private String ip;

    private int port;

    private InetAddress inet;

    public String login; //Nome do usuario;

    private final BufferedReader cin; //Ler mensagens do enviadas ou recebidas do cliente;

    private final PrintWriter cout; // Enviar mensagens do Cliente para o Servidor e vice versa;

    public ClientSocket(Socket socket, String login) throws IOException{
        this.socket = socket;
        inet = socket.getInetAddress();
        this.login = login;
        this.port = socket.getPort();
        this.cin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.cout = new PrintWriter(socket.getOutputStream(), true);
    }

    public ClientSocket(Socket socket) throws IOException { //Construtor do Socket;
        this.socket = socket;
        inet = socket.getInetAddress();
        this.port = socket.getPort();
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

    public void setIp(String str){
        this.ip = str;
    }

    public String getIp(){
        return this.ip;
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

    public String getHostAddress(){
        return socket.getInetAddress().getHostAddress();
    }

    public String getHostName() {
        return socket.getInetAddress().getHostName();
    }

    public int getPort(){
        return socket.getLocalPort();
    }
}
