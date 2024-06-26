/*
Regeln zur Initialisierung von Konstanten zur Kompilierzeit
------------------------------------------------------------------------------------------------------------------------
Verwendung von final:

Konstanten, die zur Kompilierzeit initialisiert werden, müssen mit dem Schlüsselwort final deklariert werden.
Dies stellt sicher, dass ihr Wert nicht nach der Initialisierung geändert werden kann.

Beispiel:
public static final int MAX_PLAYERS = 4;
------------------------------------------------------------------------------------------------------------------------
Statische Deklaration:

Konstanten sollten auch als static deklariert werden,
damit sie zur Klasse gehören und nicht zu einer bestimmten Instanz der Klasse.

Beispiel:
public static final String GAME_NAME = "Adventure";
------------------------------------------------------------------------------------------------------------------------
Direktinitialisierung bei der Deklaration:

Konstanten müssen direkt bei ihrer Deklaration initialisiert werden. Der Wert muss zur Kompilierzeit bekannt sein.

Beispiel:
public static final int MAX_PLAYERS = 4;
------------------------------------------------------------------------------------------------------------------------
Verwendung von Konstanten:

Konstanten können direkt über den Klassennamen zugegriffen werden,
ohne dass eine Instanz der Klasse erstellt werden muss.

Beispiel:
System.out.println(Game.MAX_PLAYERS);
------------------------------------------------------------------------------------------------------------------------
Dieses Beispiel zeigt, wie Konstanten zur Kompilierzeit initialisiert werden
und welche Regeln dabei beachtet werden müssen.
Solche Konstanten sind nützlich für feste Werte, die sich während der Ausführung des Programms nicht ändern sollen.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_6.Klassen_und_Objektinitialisierung;

public class EincompilierteBelegungen {

    // Konstanten können zur Kompilierzeit initialisiert werden.
    static class Game {
        public static final int MAX_PLAYERS = 4; // Kompilierzeit-Konstante
        public static final String GAME_NAME = "Adventure"; // Kompilierzeit-Konstante

        // Methode zur Anzeige der Konstanten
        static void displayGameInfo() {
            System.out.println("Game Name: " + GAME_NAME);
            System.out.println("Max Players: " + MAX_PLAYERS);
        }
    }

    public static void main(String[] args) {
        // Anzeige der Konstanteninformationen
        Game.displayGameInfo(); // Ausgabe: Game Name: Adventure, Max Players: 4
    }
}
