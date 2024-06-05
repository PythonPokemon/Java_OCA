/*

Code compiles successfully and on execution prints DERIVED on to the console
 * */
package JAVA_OCA_Test_5.Aufgaben_20_bis_29;

class Base {
    static void print() { //Line n1
        System.out.println("BASE");
    }
}

class Derived extends Base {
    static void print() { //Line n2
        System.out.println("DERIVED");  // wird ausgegeben
    }
}

public class test27 {
    public static void main(String[] args) {
        Base b = null;
        Derived d = (Derived) b; //Line n3
        d.print(); //Line n4
    }
}
