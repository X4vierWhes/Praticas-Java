package Gateway;

import Autentication.AutenticationInterface;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


public class Gateway implements GatewayInterface {

    AutenticationInterface stub;

    public Gateway(){

    }

    public static void main(String[] args) {
        try{
            Gateway refObjRemoto = new Gateway();

            GatewayInterface sklt = (GatewayInterface) UnicastRemoteObject.exportObject(refObjRemoto, 4000);
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Registry registro = LocateRegistry.getRegistry();
            registro.bind("Gateway", sklt);

            System.err.println("Gateway iniciado!");



        }catch (Exception e){
            System.err.println("Servidor: " + e.toString());
            e.printStackTrace();
        }
    }

    @Override
    public boolean connect(String login, String password) throws RemoteException {
        return stub.connect(login, password);
    }

    @Override
    public boolean signIn(String login, String password) throws RemoteException {
        return stub.signIn(login, password);
    }

    @Override
    public String oi() throws RemoteException {
        return "Oi, sou o Gateway!";
    }

    @Override
    public void init() throws RemoteException {
        try{
            Registry registro = LocateRegistry.getRegistry("localhost", Registry.REGISTRY_PORT + 1);
            stub = (AutenticationInterface) registro.lookup("Autentication");
            //System.out.println(stub.oi());
            stub.init();
        }catch (RemoteException e){
            e.printStackTrace();
        }catch (NotBoundException e){
            e.printStackTrace();
        }
    }
}
