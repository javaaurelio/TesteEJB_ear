import java.util.Vector;

import javax.ejb.CreateException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

//public class CartBean extends ClassePai implements SessionBean {
	public class CartBean implements SessionBean {
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
    IdVerifier idVerifier = new IdVerifier();
    if (idVerifier.validate(paramString2)) {
      this.customerId = paramString2;
    } else {
      throw new CreateException("Invalid id: " + paramString2);
    } 
    this.contents = new Vector();
  }
  
  public void addBook(String paramString) {
    this.contents.addElement(paramString);
  }
  
  public void removeBook(String paramString) throws BookException {
    boolean bool = this.contents.removeElement(paramString);
    if (!bool)
      throw new BookException(paramString + " not in cart."); 
  }
  
  public Vector getContents() {
    return this.contents;
  }
  
  public void ejbRemove() {}
  
  public void ejbActivate() {}
  
  public void ejbPassivate() {}
  
  public void setSessionContext(SessionContext paramSessionContext) {}
}
