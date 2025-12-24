import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface CartHome extends EJBHome {
	Cart create(String paramString) throws RemoteException, CreateException;

	Cart create(String paramString1, String paramString2) throws RemoteException, CreateException;
}
