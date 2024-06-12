/*

-1
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_6.Aufgaben_10_bis_19;

class Base {
    int id = 1000; //Line n1

    Base() {
        Base(); //Line n2
    }

    void Base() { //Line n3
        System.out.println(++id); //Line n4
    }
}

class Derived extends Base {
    int id = 2000; //Line n5

    Derived() {} //Line n6

    void Base() { //Line n7
        System.out.println(--id); //Line n8 //<--- -1
    }
}

public class test16 {
    public static void main(String[] args) {
        Base base = new Derived(); //Line n9
    }
}
