/*
Erklärung mit detaillierten Kommentaren und Pfeilen
------------------------------------------------------------------------------------------------------------------------
Standard-Konstruktor:

public Player() {
    this("Unbekannt", 0, 1); // <-- Ruft den Konstruktor mit drei Parametern auf
}
Der Standard-Konstruktor ruft den Haupt-Konstruktor mit den Standardwerten "Unbekannt", 0, und 1 auf.
------------------------------------------------------------------------------------------------------------------------
2.Konstruktor mit einem Parameter:

public Player(String name) {
    this(name, 0, 1); // <-- Ruft den Konstruktor mit drei Parametern auf
}
Der Konstruktor mit einem Parameter ruft den Haupt-Konstruktor mit dem angegebenen Namen
und den Standardwerten 0 für score und 1 für level auf.
------------------------------------------------------------------------------------------------------------------------
3.Konstruktor mit zwei Parametern:

public Player(String name, int score) {
    this(name, score, 1); // <-- Ruft den Konstruktor mit drei Parametern auf
}
Der Konstruktor mit zwei Parametern ruft den Haupt-Konstruktor mit dem angegebenen Namen und Score
sowie dem Standardwert 1 für level auf.
------------------------------------------------------------------------------------------------------------------------
4.Haupt-Konstruktor mit drei Parametern:

public Player(String name, int score, int level) {
    this.name = name;
    this.score = score;
    this.level = level;
}
Der Haupt-Konstruktor initialisiert die Felder name, score und level mit den übergebenen Werten.
* */
package JAVA_Insel_Smart.OCA.Kapitel_6.Konstruktor.Einen_anderen_Konstruktor_der_gleichen_Klasse_mit_this_Aufrufen;

public class Player {
    String name;
    int score;
    int level;

    // Standard-Konstruktor
    public Player() {
        this("Unbekannt", 0, 1); // <-- Ruft den Konstruktor mit drei Parametern auf
    }

    // Konstruktor mit einem Parameter
    public Player(String name) {
        this(name, 0, 1); // <-- Ruft den Konstruktor mit drei Parametern auf
    }

    // Konstruktor mit zwei Parametern
    public Player(String name, int score) {
        this(name, score, 1); // <-- Ruft den Konstruktor mit drei Parametern auf
    }

    // Haupt-Konstruktor mit drei Parametern
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
        Player player1 = new Player(); // <-- Ruft den Standard-Konstruktor auf
        player1.displayInfo(); // Ausgabe: Name: Unbekannt, Score: 0, Level: 1

        // Verwenden des Konstruktors mit einem Parameter
        Player player2 = new Player("Alice"); // <-- Ruft den Konstruktor mit einem Parameter auf
        player2.displayInfo(); // Ausgabe: Name: Alice, Score: 0, Level: 1

        // Verwenden des Konstruktors mit zwei Parametern
        Player player3 = new Player("Bob", 100); // <-- Ruft den Konstruktor mit zwei Parametern auf
        player3.displayInfo(); // Ausgabe: Name: Bob, Score: 100, Level: 1

        // Verwenden des Haupt-Konstruktors mit drei Parametern
        Player player4 = new Player("Charlie", 200, 5); // <-- Ruft den Haupt-Konstruktor mit drei Parametern auf
        player4.displayInfo(); // Ausgabe: Name: Charlie, Score: 200, Level: 5
    }
}
