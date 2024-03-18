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
        if(users.containsKey(login) && users.containsValue(password)){
            return true;
        }
        return false;
    }

    @Override
    public void signIn(String login, String password) throws RemoteException {
        users.put(login, password);
    }

    public String oi(){
        return "Oi, sou o Autentication!";
    }
}
