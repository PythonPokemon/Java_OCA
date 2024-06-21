/*
Regeln zur Initialisierung von Klassenvariablen
Direktinitialisierung:

Statische Variablen können direkt bei der Deklaration initialisiert werden. Dies ist der einfachste und häufigste Weg.
Beispiel:
java
Code kopieren
static int playerCount = 0;
Statische Initialisierungsblöcke:

Statische Variablen können auch in einem statischen Initialisierungsblock initialisiert werden. Dies ist nützlich, wenn die Initialisierung komplexer ist und mehrere Anweisungen erfordert.
Beispiel:
java
Code kopieren
static {
    playerCount = 0;
    // Weitere Initialisierungsanweisungen
}
Zugriff und Änderung:

Statische Variablen gehören zur Klasse und nicht zu Instanzen der Klasse. Sie können direkt über den Klassennamen zugegriffen und geändert werden.
Beispiel:
java
Code kopieren
Game.playerCount = 5;
Sichtbarkeit und Modifikatoren:

Statische Variablen können verschiedene Sichtbarkeitsmodifikatoren haben (public, private, protected, default). Sie können auch mit dem final-Modifikator versehen werden, um sie unveränderlich zu machen.
Beispiel:
java
Code kopieren
public static final int MAX_PLAYERS = 10;
Dieses Beispiel zeigt, wie statische Variablen direkt bei der Deklaration initialisiert und verwendet werden können, sowie einige Regeln und Best Practices für ihre Verwendung.
* */

package JAVA_Insel_Smart.OCA.Kapitel_6.Klassen_und_Objektinitialisierung;

public class Initialisierung_von_Klassenvariablen {

    // Statische Variablen können direkt bei der Deklaration initialisiert werden.
    static class Game {
        static int playerCount = 0; // Direktinitialisierung

        // Statische Methode zur Anzeige der Spieleranzahl
        static void displayPlayerCount() {
            System.out.println("Game Player Count: " + playerCount);
        }

        // Statische Methode zum Erhöhen der Spieleranzahl
        static void incrementPlayerCount() {
            playerCount++;
        }
    }

    public static void main(String[] args) {
        // Initialer Wert der statischen Variable
        Game.displayPlayerCount(); // Ausgabe: Game Player Count: 0

        // Erhöhen der Spieleranzahl
        Game.incrementPlayerCount();
        Game.displayPlayerCount(); // Ausgabe: Game Player Count: 1

        // Erhöhen der Spieleranzahl erneut
        Game.incrementPlayerCount();
        Game.displayPlayerCount(); // Ausgabe: Game Player Count: 2
    }
}
