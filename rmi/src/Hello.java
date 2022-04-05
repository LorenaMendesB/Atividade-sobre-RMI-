

import java.rmi.*;
 
public interface Hello extends Remote {
   public float delta(float a, float b, float c) throws RemoteException;

}
