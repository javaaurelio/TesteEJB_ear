
import java.rmi.RemoteException;
import java.util.Vector;
import javax.ejb.EJBObject;

public interface Bicicleta extends EJBObject {
  void addBook(String paramString) throws RemoteException;
  
  void removeBook(String paramString) throws BicicletaException, RemoteException;
  
  Vector getContents() throws RemoteException;
}
