package Store;

import Main.Vehicle;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Store implements StoreInterface{
    private HashMap<String, Vehicle> store;

    public Store(){
        this.store = new HashMap<>();
    }

    public HashMap<String, Vehicle> getStore() {
        return store;
    }

    public void setStore(HashMap<String, Vehicle> store) {
        this.store = store;
    }

    @Override
    public void init() throws RemoteException {
        this.store = new HashMap<>();
        this.store.put("123900", new Vehicle("RX-7", "123900", 2024, 12000.0));
        this.store.put("123901", new Vehicle("Civic", "123901", 2024, 15000.0));
        this.store.put("123902", new Vehicle("Ford-Ka", "123902", 2007, 3000.0));
        this.store.put("123903", new Vehicle("Prisma", "123903", 2007, 6000.0));
        this.store.put("123904", new Vehicle("Ethios", "123904", 2007, 9000.0));
        this.store.put("123905", new Vehicle("Corolla", "123905", 2007, 8000.0));
        this.store.put("123906", new Vehicle("Civic", "123906", 2024, 18000.0));
        this.store.put("123907", new Vehicle("Ford-Ka", "123907", 2007, 3800.0));
        this.store.put("123908", new Vehicle("Ethios", "123908", 2007, 8900.0));

    }

    @Override
    public boolean addCar(Vehicle a) throws RemoteException {
        try{
            this.store.put(a.getRenavam(), a);
            return true;
        }catch (Exception e){
            System.err.println("Não foi possivel adicionar no banco de dados.");
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Vehicle> listAll() throws RemoteException {
        return new ArrayList<>(this.store.values());
    }

    @Override
    public List<Vehicle> listModel(String model) throws RemoteException {
        List<Vehicle> models = new ArrayList<>();
        for(Vehicle a: this.store.values()){
            if(a.getModel().equalsIgnoreCase(model)){
                models.add(a);
            }
        }
        return models;
    }

    @Override
    public List<Vehicle> listCategory(String category) throws RemoteException {
        return null;
    }

    @Override
    public int size() throws RemoteException {
        return store.size();
    }


    @Override
    public String oi() throws RemoteException {
        return "Store conectado!";
    }

    public static void main(String[] args) {
        try{
            Store refObjRemoto = new Store();

            StoreInterface sklt = (StoreInterface) UnicastRemoteObject.exportObject(refObjRemoto, 6000);
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT + 2);
            Registry registro = LocateRegistry.getRegistry(Registry.REGISTRY_PORT + 2);
            registro.bind("Store", sklt);

            System.err.println("Store iniciado!");

        }catch (Exception e){
            System.err.println("Servidor: " + e.toString());
            e.printStackTrace();
        }
    }
}
