/*
Hier ist ein Beispiel, das zeigt, wie final-Variablen sowohl im Konstruktor als auch
in statischen Initialisierungsblöcken gesetzt werden können. final-Variablen können nur einmal initialisiert werden,
und nach der Initialisierung kann ihr Wert nicht mehr geändert werden.
------------------------------------------------------------------------------------------------------------------------
Regeln und Best Practices
Einmalige Initialisierung:

final-Variablen können nur einmal initialisiert werden, entweder bei der Deklaration,
in einem Initialisierungsblock oder im Konstruktor.

Finale Instanzvariablen:
Instanzvariablen, die als final deklariert sind, müssen im Konstruktor initialisiert werden,
 wenn sie nicht bereits bei der Deklaration initialisiert wurden.

Finale statische Variablen:
Statische Variablen, die als final deklariert sind, können direkt bei der Deklaration oder
in einem statischen Initialisierungsblock initialisiert werden.

Unveränderlichkeit:
Nach der Initialisierung kann der Wert einer final-Variablen nicht mehr geändert werden.
Dies stellt sicher, dass die Variable konstant bleibt.
Dieses Beispiel zeigt, wie final-Variablen sowohl im Konstruktor als auch in statischen Initialisierungsblöcken
initialisiert werden können und welche Regeln dabei beachtet werden müssen.
* */

package JAVA_Insel_Smart.OCA.Kapitel_6.Konstruktor;

// Finale Werte im Konstruktor und in statischen Blöcken setzen
public class Finale_Werte_im_Konstruktor {

    // Innere Klasse Player mit einer finalen Instanzvariablen
    class Player {
        final String name;
        final int score;

        // Konstruktor zur Initialisierung der finalen Instanzvariablen
        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        // Methode zur Anzeige der Informationen
        void displayInfo() {
            System.out.println("Name: " + name + ", Score: " + score);
        }
    }

    // Statische innere Klasse Game mit einer finalen statischen Variable
    static class Game {
        final static int MAX_PLAYERS;

        // Statischer Initialisierungsblock zur Initialisierung der finalen statischen Variable
        static {
            MAX_PLAYERS = 10;
        }

        // Methode zur Anzeige der statischen Informationen
        static void displayGameInfo() {
            System.out.println("Max Players: " + MAX_PLAYERS);
        }
    }

    public static void main(String[] args) {
        Finale_Werte_im_Konstruktor mainClass = new Finale_Werte_im_Konstruktor();

        // Erstellen eines Player-Objekts mit finalen Werten
        Player player1 = mainClass.new Player("Alice", 100);
        player1.displayInfo(); // Ausgabe: Name: Alice, Score: 100

        Player player2 = mainClass.new Player("Bob", 150);
        player2.displayInfo(); // Ausgabe: Name: Bob, Score: 150

        // Anzeige der finalen statischen Variable
        Game.displayGameInfo(); // Ausgabe: Max Players: 10
    }
}
