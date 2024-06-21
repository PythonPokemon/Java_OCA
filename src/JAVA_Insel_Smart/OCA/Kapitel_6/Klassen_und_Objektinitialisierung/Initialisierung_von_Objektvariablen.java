/*
Erklärung
Direktinitialisierung von Objektvariablen:

Die Variable name in der Player-Klasse wird direkt bei der Deklaration auf "Unknown" gesetzt.
Der Konstruktor Player(String name) ermöglicht die Initialisierung der name-Variable beim Erstellen eines Objekts.
Statische Initialisierungsblöcke:

Die Game-Klasse verwendet einen statischen Initialisierungsblock, um die statische Variable playerCount auf 0 zu setzen. Dieser Block wird ausgeführt, wenn die Klasse geladen wird.
Direktinitialisierung von Klassenvariablen:

Die Game1-Klasse initialisiert die statische Variable playerCount1 direkt bei der Deklaration.
Verwendung in der main-Methode:

Zwei Player-Objekte (player1 und player2) werden erstellt und ihre Namen werden angezeigt.
Die statische Methode displayPlayerCount der Game- und Game1-Klassen zeigt die Spieleranzahl an. Die Spieleranzahl wird mit der Methode incrementPlayerCount erhöht und die aktualisierte Anzahl wird erneut angezeigt.
Zusammenfassung
Objektvariablen können direkt bei der Deklaration oder über Konstruktoren initialisiert werden.
Statische Variablen können über statische Initialisierungsblöcke oder direkt bei der Deklaration initialisiert werden.
Methoden zur Anzeige und Änderung der Variablen helfen, die Änderungen zu überprüfen und die Konzepte zu veranschaulichen.
* */

package JAVA_Insel_Smart.OCA.Kapitel_6.Klassen_und_Objektinitialisierung;

public class Initialisierung_von_Objektvariablen {

    // Objektvariablen können direkt bei der Deklaration initialisiert werden.
    class Player {
        String name = "Unknown"; // Direktinitialisierung

        // Konstruktor zur Initialisierung
        Player(String name) {
            this.name = name;
        }

        // Methode zur Anzeige der Informationen
        void displayInfo() {
            System.out.println("Player Name: " + name);
        }
    }

    // Statische Initialisierungsblöcke werden ausgeführt, wenn die Klasse geladen wird.
    static class Game {
        static int playerCount;

        static {
            playerCount = 0; // Statische Initialisierung
        }

        // Methode zur Anzeige der Informationen
        static void displayPlayerCount() {
            System.out.println("Game Player Count: " + playerCount);
        }

        // Methode zum Erhöhen der Spieleranzahl
        static void incrementPlayerCount() {
            playerCount++;
        }
    }

    // Statische Variablen können auch direkt bei der Deklaration initialisiert werden.
    static class Game1 {
        static int playerCount1 = 0; // Direktinitialisierung

        // Methode zur Anzeige der Informationen
        static void displayPlayerCount() {
            System.out.println("Game1 Player Count: " + playerCount1);
        }

        // Methode zum Erhöhen der Spieleranzahl
        static void incrementPlayerCount() {
            playerCount1++;
        }
    }

    public static void main(String[] args) {
        Initialisierung_von_Objektvariablen mainClass = new Initialisierung_von_Objektvariablen();

        // Erstellen eines Player-Objekts mit Standardnamen
        Player player1 = mainClass.new Player("Alice");
        player1.displayInfo(); // Ausgabe: Player Name: Alice

        // Erstellen eines Player-Objekts mit direkt initialisiertem Namen
        Player player2 = mainClass.new Player("Bob");
        player2.displayInfo(); // Ausgabe: Player Name: Bob

        // Verwenden der Game-Klasse
        Game.displayPlayerCount(); // Ausgabe: Game Player Count: 0
        Game.incrementPlayerCount();
        Game.displayPlayerCount(); // Ausgabe: Game Player Count: 1

        // Verwenden der Game1-Klasse
        Game1.displayPlayerCount(); // Ausgabe: Game1 Player Count: 0
        Game1.incrementPlayerCount();
        Game1.displayPlayerCount(); // Ausgabe: Game1 Player Count: 1
    }
}
