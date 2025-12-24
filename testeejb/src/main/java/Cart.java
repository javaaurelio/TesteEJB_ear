import java.rmi.RemoteException;
import java.util.Vector;
import javax.ejb.EJBObject;

public interface Cart extends EJBObject {
  void addBook(String paramString) throws RemoteException;
  
  void removeBook(String paramString) throws BookException, RemoteException;
  
  Vector getContents() throws RemoteException;
}
