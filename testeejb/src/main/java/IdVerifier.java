public class IdVerifier {
  public boolean validate(String paramString) {
    boolean bool = true;
    for (byte b = 0; b < paramString.length(); b++) {
      if (!Character.isDigit(paramString.charAt(b)))
        bool = false; 
    } 
    return bool;
  }
}
