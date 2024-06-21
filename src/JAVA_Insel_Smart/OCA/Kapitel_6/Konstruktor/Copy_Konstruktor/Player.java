/*
Erklärung
Standard-Konstruktor:

Initialisiert die Felder name, score und level mit Standardwerten.
Konstruktor mit Parametern:

Initialisiert die Felder name, score und level mit den angegebenen Werten.
Copy-Konstruktor:

Nimmt ein anderes Player-Objekt als Parameter und kopiert dessen Felder (name, score und level) in das neue Objekt.
this.name = other.name;
this.score = other.score;
this.level = other.level;
Methode displayInfo:

Gibt die Informationen des Spielers (name, score, level) auf der Konsole aus.
Verwendung in der main-Methode:

Es wird ein Player-Objekt (originalPlayer) mit dem Konstruktor mit Parametern erstellt.
Es wird ein weiteres Player-Objekt (copiedPlayer) mit dem Copy-Konstruktor erstellt, das eine Kopie von originalPlayer ist.
Änderungen an copiedPlayer beeinflussen originalPlayer nicht, was zeigt, dass es sich um separate Objekte handelt.
* */

package JAVA_Insel_Smart.OCA.Kapitel_6.Konstruktor.Copy_Konstruktor;

public class Player {
    String name;
    int score;
    int level;

    // Standard-Konstruktor
    public Player() {
        this.name = "Unbekannt";
        this.score = 0;
        this.level = 1;
    }

    // Konstruktor mit Parametern
    public Player(String name, int score, int level) {
        this.name = name;
        this.score = score;
        this.level = level;
    }

    // Copy-Konstruktor
    public Player(Player other) {
        this.name = other.name;
        this.score = other.score;
        this.level = other.level;
    }

    // Methode zur Anzeige der Informationen
    public void displayInfo() {
        System.out.println("Name: " + name + ", Score: " + score + ", Level: " + level);
    }

    public static void main(String[] args) {
        // Verwenden des Konstruktors mit Parametern
        Player originalPlayer = new Player("Alice", 100, 5);
        originalPlayer.displayInfo(); // Ausgabe: Name: Alice, Score: 100, Level: 5

        // Verwenden des Copy-Konstruktors
        Player copiedPlayer = new Player(originalPlayer);
        copiedPlayer.displayInfo(); // Ausgabe: Name: Alice, Score: 100, Level: 5

        // Ändern der Kopie, um zu zeigen, dass es sich um separate Objekte handelt
        copiedPlayer.name = "Bob";
        copiedPlayer.score = 200;
        copiedPlayer.level = 10;
        copiedPlayer.displayInfo(); // Ausgabe: Name: Bob, Score: 200, Level: 10

        // Original bleibt unverändert
        originalPlayer.displayInfo(); // Ausgabe: Name: Alice, Score: 100, Level: 5
    }
}
