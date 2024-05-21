/*
* Der Code enthält eine abstrakte Klasse Animal und eine konkrete Klasse Dog, die von Animal erbt.
* Hier ist eine Erklärung:

Was passiert im Code?
Abstrakte Klasse Animal:

Definiert eine abstrakte Klasse Animal, die einen privaten Namen (name) enthält.
Der Konstruktor Animal(String name) setzt den Namen des Tieres.
Die Methode getName() gibt den Namen des Tiers zurück.
Klasse Dog (Hund):

Erbt von der Klasse Animal.
Enthält ein zusätzliches privates Attribut breed (Rasse) spezifisch für Hunde.
Der erste Konstruktor Dog(String breed) setzt die Rasse des Hundes, aber keinen Namen.
Der zweite Konstruktor Dog(String name, String breed) setzt sowohl den Namen als auch die Rasse des Hundes.
Die Methode getBreed() gibt die Rasse des Hundes zurück.
Klasse test4:

Die main-Methode erstellt zwei Hunde-Objekte (dog1 und dog2) mit verschiedenen Konstruktoren.
dog1 hat nur die Rasse "Beagle", dog2 hat den Namen "Bubbly" und die Rasse "Pudel".
Es wird versucht, die Namen und Rassen der Hunde auf der Konsole auszugeben.
* */

//package JACA_OCA_Test1.Aufgaben1bis10;
//-------Auskommentieren zum Testen--------------
//----------------------------------------------------------------------------------------------------------------------
//// compiler fehler,         Dog(String breed) konstruktor

//    abstract class Animal {
//        private String name;
//
//        Animal(String name){
//            this.name = name;
//        }
//
//        public String getName() {
//            return  name;
//        }
//    }
//
//    class Dog extends Animal{
//        private  String breed;
//        Dog(String breed) {
//            this.breed = breed;
//        }
//
            // hier ist der fehler
//        Dog(String name, String breed) {
//            super(name);                  //<---
//            this.breed = breed;
//        }
//
//        public String getBreed() {
//            return breed;
//                                          //<---
//        }
//    }
//
//
//public class test4 {
//    public static void main(String[] args) {
//        Dog dog1 = new Dog("Beagle");
//        Dog dog2 = new Dog("Bubbly", "Poodle");
//        System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" +
//                            dog2.getName() + ":" + dog2.get.Breed());
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private String breed;

    // Korrigierter Konstruktor
    Dog(String breed) {
        super("Unknown"); // Ruft den Konstruktor der Basisklasse auf und setzt einen Standardnamen
        this.breed = breed;
    }

    Dog(String name, String breed) {
        super(name); // Ruft den Konstruktor der Basisklasse auf
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

public class test4 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Beagle");
        Dog dog2 = new Dog("Bubbly", "Poodle");
        System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" +
                dog2.getName() + ":" + dog2.getBreed());
    }
}
/*------------------------------------------ACHTUNG ZUSATZWISSEN--------------------------------------------------------

#   Konstruktoren in Java
-   Ein Konstruktor ist eine spezielle Methode einer Klasse, die aufgerufen wird,
    wenn eine Instanz (ein Objekt) dieser Klasse erstellt wird.
    Konstruktoren haben den gleichen Namen wie die Klasse und keinen Rückgabewert (nicht einmal void).

-   Hauptpunkte:
    Name: Der Konstruktor hat den gleichen Namen wie die Klasse.
    Kein Rückgabewert: Konstruktoren haben keinen Rückgabewert.
    Initialisierung: Konstruktoren werden verwendet, um die Felder (Attribute) der Klasse zu initialisieren.
------------------------------------------------------------------------------------------------------------------------
    Beispiel für einen Konstruktor

    public class Dog {
        private String breed;

        // Konstruktor
        public Dog(String breed) {
            super(name); // Aufruf des Konstruktors der Basisklasse Animal  //<-- super
            this.breed = breed;
        }
    }
------------------------------------------------------------------------------------------------------------------------
-   super Schlüsselwort in Java
    Das Schlüsselwort super wird verwendet, um den Konstruktor der direkten Basisklasse aufzurufen.
    Es ermöglicht den Zugriff auf Methoden und Felder der direkten Oberklasse,
    die von der aktuellen Klasse verdeckt werden könnten.

    Hauptpunkte:
    Konstruktoraufruf: super wird verwendet, um den Konstruktor der Basisklasse aufzurufen.
    Methoden/Felder: super kann auch verwendet werden, um auf Methoden und Felder der Basisklasse zuzugreifen,
    die von der Unterklasse überschrieben oder verdeckt werden.
------------------------------------------------------------------------------------------------------------------------
* */