/*
Objekt_Casting_instaceof_Methode
* */
package JAVA_Insel_Smart.Kapitel_2.Casting;

class Animal1 {
    // Methoden und Felder für die Klasse Animal
}

class Dog1 extends Animal1 {
    // Methoden und Felder für die Klasse Dog
}

class Cat1 extends Animal1 {
    // Methoden und Felder für die Klasse Cat
}

public class Objekt_Casting_instaceof_Methode {
    public static void main(String[] args) {
        // Beispiel 1: Korrektes Casting mit instanceof Überprüfung
        Animal1 animal1 = new Dog1();
        if (animal1 instanceof Dog1) {
            Dog1 dog1 = (Dog1) animal1;
            System.out.println("Casting von Animal zu Dog erfolgreich.");
        } else {
            System.out.println("animal ist kein Dog und kann nicht gecastet werden.");
        }

        // Beispiel 2: Falsches Casting vermeiden mit instanceof Überprüfung
        Animal1 anotherAnimal1 = new Animal1();
        if (anotherAnimal1 instanceof Dog1) {
            Dog1 anotherDog1 = (Dog1) anotherAnimal1;
            System.out.println("Casting von Animal zu Dog erfolgreich.");
        } else {
            System.out.println("anotherAnimal ist kein Dog und kann nicht gecastet werden.");
        }

        // Beispiel 3: Casting zu einem anderen Typ mit instanceof Überprüfung
        Animal1 yetAnotherAnimal1 = new Cat1();
        if (yetAnotherAnimal1 instanceof Dog1) {
            Dog1 yetAnotherDog1 = (Dog1) yetAnotherAnimal1;
            System.out.println("Casting von Animal zu Dog erfolgreich.");
        } else {
            System.out.println("yetAnotherAnimal ist kein Dog und kann nicht gecastet werden.");
        }

        // Beispiel 4: Korrektes Casting zu Cat mit instanceof Überprüfung
        if (yetAnotherAnimal1 instanceof Cat1) {
            Cat1 yetAnotherCat1 = (Cat1) yetAnotherAnimal1;
            System.out.println("Casting von Animal zu Cat erfolgreich.");
        } else {
            System.out.println("yetAnotherAnimal ist kein Cat und kann nicht gecastet werden.");
        }
    }
}
