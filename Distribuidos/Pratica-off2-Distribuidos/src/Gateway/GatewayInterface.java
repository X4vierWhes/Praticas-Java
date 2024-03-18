package Gateway;

import java.rmi.Remote;
import java.rmi.RemoteException;

import Autentication.AutenticationInterface;


public interface GatewayInterface extends Remote, AutenticationInterface {
    String oi() throws RemoteException;

    void init() throws RemoteException;
}
