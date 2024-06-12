/*

DEER JUMPS
DEER JUMPS TO 5 FEET
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_1_bis_9;

abstract class Animal {
    abstract void jump() throws RuntimeException;
}

class Deer extends Animal {
    void jump() { //Line n1
        System.out.println("DEER JUMPS");
    }

    void jump(int i) {
        System.out.println("DEER JUMPS TO " + i + " FEET");
    }
}

public class test1 {
    public static void main(String[] args) {
        Animal animal = new Deer();
        ((Deer)animal).jump(); //Line n2
        ((Deer)animal).jump(5); //Line n3
    }
}
