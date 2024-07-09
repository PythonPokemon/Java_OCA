/*
Klassenblock (Class Block)
Dies ist ein Block, der den Körper einer Klasse definiert.
------------------------------------------------------------------------------------------------------------------------
Syntax

public class KlassenName {
    // Block in geschweiften Klammern
    // Dieser Code definiert Felder, Methoden und Konstruktoren der Klasse
}
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_1.Code_Blöcke;

class Person {
    String name;
    int alter;

    // Konstruktor der Klasse 'Person'
    // methodenName(Parametertyp parameterName, auch mehrere möglich: Parametertyp parameterName)
    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Alter: " + alter);
    }
}

// ACHTUNG | es geht immer nur eine 'public' klasse pro datei. !
public class Klassenblock {
    public static void main(String[] args) {

    }
}
