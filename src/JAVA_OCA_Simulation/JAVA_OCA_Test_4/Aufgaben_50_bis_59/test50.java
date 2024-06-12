/*
Animal
Deer
------------------------------------------------------------------------------------------------------------------------

 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_4.Aufgaben_50_bis_59;

class Animal {
    protected void jump() {
        System.out.println("Animal");
    }
}

class Cat extends Animal {
    public void jump(int a) {
        System.out.println("Cat");
    }
}

class Deer extends Animal {
    public void jump() {
        System.out.println("Deer");
    }
}

// Dateiname: Circus | Udemy
public class test50 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal deer = new Deer();
        cat.jump();
        deer.jump();
    }
}
