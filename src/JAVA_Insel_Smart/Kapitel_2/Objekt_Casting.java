package JAVA_Insel_Smart.Kapitel_2;

class Animal {
    // Methoden und Felder für die Klasse Animal
}

class Dog extends Animal {
    // Methoden und Felder für die Klasse Dog
}

public class Objekt_Casting {
    public static void main(String[] args) {
        // Beispiel 1: Korrektes Casting
        Animal animal = new Dog();
        Dog dog = (Dog) animal; // funktioniert, weil animal tatsächlich ein Dog ist
        System.out.println("Casting von Animal zu Dog erfolgreich.");

        // Beispiel 2: Falsches Casting
        Animal anotherAnimal = new Animal();
        try {
            Dog anotherDog = (Dog) anotherAnimal; // wirft ClassCastException zur Laufzeit
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }
    }
}
