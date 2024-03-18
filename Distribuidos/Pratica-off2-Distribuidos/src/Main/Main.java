package Main;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import  Gateway.*;

public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        System.out.println("Informe o nome/endereço do RMIRegistry");
        String host = cin.nextLine();

        try{
            Registry registro = LocateRegistry.getRegistry(host, Registry.REGISTRY_PORT);
            GatewayInterface stub = (GatewayInterface) registro.lookup("Gateway");
            System.out.println(stub.oi());
            stub.init();

        }catch (RemoteException e){
            e.printStackTrace();
        }catch (NotBoundException e){
            e.printStackTrace();
        }
    }
}
