package JAVA_Insel_Smart.Kapitel_2.Casting;

class Animal {
    // Methoden und Felder für die Klasse Animal
}

class Dog extends Animal1 {
    // Methoden und Felder für die Klasse Dog
}

public class Objekt_Casting {
    public static void main(String[] args) {
        // Beispiel 1: Korrektes Casting
        Animal1 animal1 = new Dog1();
        Dog1 dog1 = (Dog1) animal1; // funktioniert, weil animal tatsächlich ein Dog ist
        System.out.println("Casting von Animal zu Dog erfolgreich.");

        // Beispiel 2: Falsches Casting
        Animal1 anotherAnimal1 = new Animal1();
        try {
            Dog1 anotherDog1 = (Dog1) anotherAnimal1; // wirft ClassCastException zur Laufzeit
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }
    }
}
