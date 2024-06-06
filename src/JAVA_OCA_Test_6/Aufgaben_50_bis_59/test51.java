/*


 * */
package JAVA_OCA_Test_6.Aufgaben_50_bis_59;

class Base {
    public void log() throws NullPointerException {
        System.out.println("Base: log()");
    }
}

class Derived extends Base {
    public void log() throws RuntimeException {
        System.out.println("Derived: log()");   // Derived: log()
    }
}

public class test51 {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.log();
    }
}
