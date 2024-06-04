/*


 * */
package JAVA_OCA_Test_4.Aufgaben_20_bis_29;

class A {
    A() {
        this(1);
        System.out.println("M");    // M
    }

    A(int i) {
        System.out.println("N");    // N
    }
}

class B extends A {

}

public class test26 {
    public static void main(String[] args) {
        new B();
    }
}
