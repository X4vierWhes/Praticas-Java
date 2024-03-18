package Autentication;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;


public class Autentication implements AutenticationInterface {

    private HashMap<String, String> users;

    public Autentication(){
        this.users = new HashMap<>();
    }

    public static void main(String[] args) {
        try{
            Autentication refObjRemoto = new Autentication();

            AutenticationInterface sklt = (AutenticationInterface) UnicastRemoteObject.exportObject(refObjRemoto, 5000);
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT + 1);
            Registry registro = LocateRegistry.getRegistry(Registry.REGISTRY_PORT + 1);
            registro.bind("Autentication", sklt);

            System.err.println("Autenticaçao iniciado!");

        }catch (Exception e){
            System.err.println("Servidor: " + e.toString());
            e.printStackTrace();
        }
    }

    @Override
    public boolean connect(String login, String password) {
        if(users.containsKey(login) && users.get(login).equalsIgnoreCase(password)){
            return true;
        }
        return false;
    }

    @Override
    public boolean signIn(String login, String password) throws RemoteException {
        try {
            users.put(login, password);
            return true;
        }catch (Exception e){
            System.err.println("Não foi possivel cadastrar no sistema.");
            e.printStackTrace();
            return false;
        }
    }

    public String oi(){
        return "Oi, sou o Autentication!";
    }

    @Override
    public void init() throws RemoteException {
        this.users = new HashMap<>();

        users.put("admin", "admin");
        users.put("Whesley", "1234");
        users.put("Thiago", "6666");
        users.put("Davi", "7777");
        users.put("Kevny", "8888");
        users.put("Ryan", "9999");
        users.put("Valentina", "1010");
        users.put("Vinicius", "1111");
        users.put("Sarah", "1212");
        users.put("Joao Vitor", "1313");
    }
}
