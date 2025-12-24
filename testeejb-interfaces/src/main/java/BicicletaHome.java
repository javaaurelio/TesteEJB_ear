
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface BicicletaHome extends EJBHome {
  Bicicleta create(String paramString) throws RemoteException, CreateException;
  
  Bicicleta create(String paramString1, String paramString2) throws RemoteException, CreateException;
}
