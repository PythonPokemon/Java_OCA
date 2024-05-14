/*
* Der Code enthält eine abstrakte Klasse Animal und eine konkrete Klasse Dog, die von Animal erbt. Hier ist eine Erklärung:

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
//// Was kommt raus?
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
//        Dog(String name, String breed) {
//            super(name);
//            this.breed = breed;
//        }
//
//        public String getBreed() {
//            return breed;
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
