/*
Erklärung:
Konstruktoren der Basisklasse werden nicht vererbt. Stattdessen müssen sie explizit in der abgeleiteten Klasse aufgerufen werden.
super(name) im Konstruktor der Klasse Dog ruft den Konstruktor der Basisklasse Animal auf.
Dies stellt sicher, dass die Initialisierung, die im Konstruktor der Basisklasse erfolgt,
auch in der abgeleiteten Klasse durchgeführt wird.
* */
package JAVA_Insel_Smart.OCA.Kapitel_7.Vererbung;
// Vererbung_mit_konstruktor_super


// Basisklasse mit einem Konstruktor
class Animal2 {
    protected String name;

    public Animal2(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }
}

// Abgeleitete Klasse, die den Konstruktor der Basisklasse aufruft
class Dog2 extends Animal2 {
    public Dog2(String name) {
        super(name); // Aufruf des Konstruktors der Basisklasse
        System.out.println("Dog constructor called");
    }

    public void display() {
        System.out.println("Dog's name: " + name);
    }
}

public class Vererbung_mit_konstruktor_super {
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2("Buddy");
        dog2.display(); // Ausgabe: Dog's name: Buddy
    }
}
