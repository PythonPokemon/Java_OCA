/*
In Java kann eine Klasse nur von einer anderen Klasse erben (Einfachvererbung).
Eine Klasse kann jedoch mehrere Schnittstellen implementieren.
* */

package JAVA_Insel_Smart.OCA.Kapitel_7.Vererbung;

// Basisklasse (Superklasse)
class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

// Abgeleitete Klasse (Subklasse)
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class Einfachvererbung {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Ausgabe: Woof
    }
}

