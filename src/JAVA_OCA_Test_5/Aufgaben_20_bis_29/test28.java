/*

X3
 * */
package JAVA_OCA_Test_5.Aufgaben_20_bis_29;

interface A1 {
    default void print() {
        System.out.println("X1");
    }
}

interface X2 extends A1 {
    void print();
}

interface X3 extends X2 {
    default void print() {
        System.out.println("X3");
    }
}

class X implements X3 {}

public class test28 {
    public static void main(String[] args) {
        A1 obj = new X();
        obj.print();
    }
}
