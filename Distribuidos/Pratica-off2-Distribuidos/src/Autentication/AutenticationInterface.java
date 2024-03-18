package Autentication;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;

public interface AutenticationInterface extends Remote {

   boolean connect(String login, String password) throws RemoteException;

   void signIn(String login, String password) throws RemoteException;

   String oi() throws RemoteException;
}
