/*
Erklärung
Standard-Konstruktor:

Dieser Konstruktor hat keine Parameter und initialisiert die Felder name, score und level mit Standardwerten.

Konstruktor mit einem Parameter:
Dieser Konstruktor nimmt einen String (name) als Parameter und initialisiert das Feld name mit diesem Wert.
Die anderen Felder (score und level) werden mit Standardwerten initialisiert.

Konstruktor mit zwei Parametern:
Dieser Konstruktor nimmt einen String (name) und einen int (score) als Parameter und initialisiert die Felder name
und score mit diesen Werten.
Das Feld level wird mit einem Standardwert initialisiert.

Konstruktor mit drei Parametern:
Dieser Konstruktor nimmt einen String (name), einen int (score) und einen int (level) als Parameter und
initialisiert alle Felder mit diesen Werten.

Methode displayInfo:
Diese Methode gibt die Informationen des Spielers (name, score, level) auf der Konsole aus.

Verwendung in der main-Methode:
Es werden vier Player-Objekte erstellt, jedes mit einem anderen Konstruktor:
player1 verwendet den Standard-Konstruktor.
player2 verwendet den Konstruktor mit einem Parameter.
player3 verwendet den Konstruktor mit zwei Parametern.
player4 verwendet den Konstruktor mit drei Parametern.
* */
package JAVA_Insel_Smart.OCA.Kapitel_6.Konstruktor.Parametrisierte_und_überladene_Konstruktor;

public class Player {
    String name;
    int score;
    int level;

    // Standard-Konstruktor (keine Parameter)
    public Player() {
        this.name = "Unbekannt";
        this.score = 0;
        this.level = 1;
    }

    // Konstruktor mit einem Parameter
    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.level = 1;
    }

    // Konstruktor mit zwei Parametern
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
        this.level = 1;
    }

    // Konstruktor mit drei Parametern
    public Player(String name, int score, int level) {
        this.name = name;
        this.score = score;
        this.level = level;
    }

    // Methode zur Anzeige der Informationen
    public void displayInfo() {
        System.out.println("Name: " + name + ", Score: " + score + ", Level: " + level);
    }

    public static void main(String[] args) {
        // Verwenden des Standard-Konstruktors
        Player player1 = new Player();
        player1.displayInfo(); // Ausgabe: Name: Unbekannt, Score: 0, Level: 1

        // Verwenden des Konstruktors mit einem Parameter
        Player player2 = new Player("Alice");
        player2.displayInfo(); // Ausgabe: Name: Alice, Score: 0, Level: 1

        // Verwenden des Konstruktors mit zwei Parametern
        Player player3 = new Player("Bob", 100);
        player3.displayInfo(); // Ausgabe: Name: Bob, Score: 100, Level: 1

        // Verwenden des Konstruktors mit drei Parametern
        Player player4 = new Player("Charlie", 200, 5);
        player4.displayInfo(); // Ausgabe: Name: Charlie, Score: 200, Level: 5
    }
}
