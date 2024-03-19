package Gateway;

import Autentication.AutenticationInterface;
import Main.Vehicle;
import Store.StoreInterface;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


public class Gateway implements GatewayInterface {

    protected AutenticationInterface autentication;

    protected StoreInterface store;

    public Gateway(){}

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
        return autentication.connect(login, password);
    }

    @Override
    public boolean signIn(String login, String password) throws RemoteException {
        return autentication.signIn(login, password);
    }

    @Override
    public String oi() throws RemoteException {
        return "Oi, sou o Gateway!";
    }

    @Override
    public void init() throws RemoteException {
        try{
            Registry registro = LocateRegistry.getRegistry("localhost", Registry.REGISTRY_PORT + 1);
            autentication = (AutenticationInterface) registro.lookup("Autentication");
            //System.out.println(stub.oi());
            autentication.init();
            System.err.println(autentication.oi());
        }catch (RemoteException e){
            e.printStackTrace();
        }catch (NotBoundException e){
            e.printStackTrace();
        }

        try{
            Registry registro = LocateRegistry.getRegistry("localhost", Registry.REGISTRY_PORT + 2);
            store = (StoreInterface) registro.lookup("Store");
            //System.out.println(stub.oi());
            store.init();
            System.err.println(store.oi());
        }catch (RemoteException e){
            e.printStackTrace();
        }catch (NotBoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean addCar(Vehicle a) throws RemoteException {
        return store.addCar(a);
    }

    @Override
    public List<Vehicle> listAll() throws RemoteException {
        return store.listAll();
    }

    @Override
    public List<Vehicle> listModel(String model) throws RemoteException {
        return store.listModel(model);
    }

    @Override
    public List<Vehicle> listCategory(String category) throws RemoteException {
        return store.listCategory(category);
    }

    @Override
    public int size() throws RemoteException {
        return store.size();
    }
}
