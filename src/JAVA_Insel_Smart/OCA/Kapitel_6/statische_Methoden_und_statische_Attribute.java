/*
6.3 Eine für alle – statische Methoden und statische Attribute
Statische Mitglieder gehören zur Klasse und nicht zu Instanzen der Klasse.
Sie werden mit dem Schlüsselwort static deklariert.

6.3.1 Warum statische Eigenschaften sinnvoll sind
Statische Eigenschaften sind nützlich, um gemeinsame Daten oder Funktionen zu definieren,
die nicht an eine spezifische Instanz gebunden sind.
------------------------------------------------------------------------------------------------------------------------
Statische Mitglieder sind Variablen und Methoden, die mit dem Schlüsselwort static deklariert werden. Sie gehören zur Klasse selbst und nicht zu Instanzen (Objekten) der Klasse. Das bedeutet, dass sie ohne die Erstellung eines Objekts der Klasse verwendet werden können. Hier sind die Hauptmerkmale und Unterschiede zwischen statischen und nicht-statischen Mitgliedern:

Merkmale statischer Mitglieder:
Klassenebene:

Statische Mitglieder gehören zur Klasse und nicht zu einer bestimmten Instanz.
Sie werden nur einmal erstellt und von allen Instanzen der Klasse geteilt.
Aufruf ohne Objekt:

Statische Methoden und Variablen können direkt über den Klassennamen aufgerufen werden.
Beispiel: ClassName.staticMethod() oder ClassName.staticVariable.
Gemeinsamer Zustand:

Statische Variablen speichern Informationen, die von allen Instanzen der Klasse gemeinsam genutzt werden.
Änderungen an einer statischen Variable sind für alle Instanzen sichtbar.
Lebensdauer:

Statische Mitglieder existieren während der gesamten Laufzeit des Programms, unabhängig davon, ob Instanzen der Klasse erstellt werden oder nicht.
* */

package JAVA_Insel_Smart.OCA.Kapitel_6;

class Game {
    static int playerCount;

    static void incrementPlayerCount() {
        playerCount++;
        System.out.println("Ruf mich auf, ich bin eine Statische Methode, einer statischen Klasse:-)");
    }
}


public class statische_Methoden_und_statische_Attribute {
    public static void main(String[] args) {

        // Statische Eigenschaften und Methoden werden mit dem Klassennamen aufgerufen:
        Game.incrementPlayerCount();
    }
}
