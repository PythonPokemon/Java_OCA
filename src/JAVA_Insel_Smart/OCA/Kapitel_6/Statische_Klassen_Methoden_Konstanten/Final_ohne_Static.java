/*
Frage:
Kann man einer Instanz auch zwei InstanzKonstanten zu weisen
* */

package JAVA_Insel_Smart.OCA.Kapitel_6.Statische_Klassen_Methoden_Konstanten;
// Eine Konstante für eine Instanz der Klasse. Jede Instanz hat ihre eigene Kopie der Konstante.
class Spiel1 {
    final int Maximale_Männliche_Spieler = 10; // Instanzkonstante
    final int Maximale_Weibliche_Spieler = 5;
}

public class Final_ohne_Static {
    public static void main(String[] args) {

        Spiel1 objektInstanz1 = new Spiel1();
        Spiel1 objektInstanz2 = new Spiel1();


        // zugriff der Instanz auf die InstanzKonstante, aus der Klasse
        System.out.println(objektInstanz1.Maximale_Männliche_Spieler);
        System.out.println(objektInstanz2.Maximale_Männliche_Spieler);
    }
}
