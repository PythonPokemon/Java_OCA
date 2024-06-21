/*
Regeln und Best Practices
Reihenfolge der Ausführung:

Instanzinitialisierungsblöcke werden vor den Konstruktoren ausgeführt.
Dies gilt unabhängig davon, welcher Konstruktor aufgerufen wird.
Mehrere Instanzinitialisierungsblöcke:

Wenn mehrere Instanzinitialisierungsblöcke vorhanden sind, werden sie in der Reihenfolge ihrer Deklaration ausgeführt.
Verwendung von Instanzinitialisierungsblöcken:

Instanzinitialisierungsblöcke sind nützlich, wenn eine Initialisierung für alle Konstruktoren gleich sein soll und man nicht den gleichen Code in mehreren Konstruktoren duplizieren möchte.
Instanzinitialisierungsblöcke bieten eine Möglichkeit, gemeinsamen Initialisierungscode für alle Konstruktoren zu schreiben, was den Code sauberer und leichter wartbar macht.
* */

package JAVA_Insel_Smart.OCA.Kapitel_6.Klassen_und_Objektinitialisierung;

public class Exemplarinitialisierer {

    class Player {
        String name;
        int score;

        // Instanzinitialisierungsblock
        {
            name = "Unknown";
            score = 0;
            System.out.println("Instanzinitialisierungsblock ausgeführt");
        }

        // Standard-Konstruktor
        public Player() {
            System.out.println("Standard-Konstruktor ausgeführt");
        }

        // Konstruktor mit einem Parameter
        public Player(String name) {
            this.name = name;
            System.out.println("Konstruktor mit einem Parameter ausgeführt");
        }

        // Methode zur Anzeige der Informationen
        void displayInfo() {
            System.out.println("Name: " + name + ", Score: " + score);
        }
    }

    public static void main(String[] args) {
        Exemplarinitialisierer mainClass = new Exemplarinitialisierer();

        // Erstellen eines Player-Objekts mit dem Standard-Konstruktor
        Player player1 = mainClass.new Player();
        player1.displayInfo(); // Ausgabe: Name: Unknown, Score: 0

        // Erstellen eines Player-Objekts mit dem Konstruktor mit einem Parameter
        Player player2 = mainClass.new Player("Alice");
        player2.displayInfo(); // Ausgabe: Name: Alice, Score: 0
    }
}
