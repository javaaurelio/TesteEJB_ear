
import java.util.Vector;

import javax.ejb.CreateException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

import br.ejb2.impl2.aa.ClassePai;

public class BicicletaBean extends ClassePai implements SessionBean {
//	public class BicicletaBean implements SessionBean {
  String customerName;
  
  String customerId;
  
  Vector contents;
    
  public void ejbCreate(String paramString) throws CreateException {
    if (paramString == null)
      throw new CreateException("Null person not allowed."); 
    this.customerName = paramString;
    this.customerId = "0";
    this.contents = new Vector();
  }
  
  public void ejbCreate(String paramString1, String paramString2) throws CreateException {
    if (paramString1 == null)
      throw new CreateException("Null person not allowed."); 
    this.customerName = paramString1;
    this.contents = new Vector();
  }
  
  public void addBook(String paramString) {
    this.contents.addElement(paramString);
  }
  
  public void removeBook(String paramString) throws BicicletaException {
    boolean bool = this.contents.removeElement(paramString);
    if (!bool)
      throw new BicicletaException(paramString + " not in cart."); 
  }
  
  public Vector getContents() {
    return this.contents;
  }
  
  public void ejbRemove() {}
  
  public void ejbActivate() {}
  
  public void ejbPassivate() {}
  
  public void setSessionContext(SessionContext paramSessionContext) {}
}
