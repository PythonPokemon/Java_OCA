package JAVA_Insel_Smart.OCA.Zugriffs_Modifizierer.a;

public class AccessTest {
    // Fields | Variablen
    int packagePrivateDefaultVar; // package-private
    private String privateVar; // private
    protected int protectedVar; // protected
    public int publicVar; // public

    // Fields | Methoden
    void packagePrivateMethod() {} // package-private
    private void privateMethod() {} // private
    protected void protectedMethod() {} // protected
    public void publicMethod() {} // public

    public static void main(String[] args) {
        AccessTest objRef = new AccessTest();
        System.out.println(objRef.privateVar);
    }
}
