/*
Sind zwei Punkte gleich?
Ob zwei Punkte gleich sind, sagt uns die equals(…)-Methode. Die
Anwendung ist einfach. Stellen wir uns vor, wir wollen Koordinaten
für einen Spieler, eine Tür und eine Schlange verwalten und dann
testen, ob der Spieler »auf« der Tür steht und die Schlange auf der
Position des Spielers:
------------------------------------------------------------------------------------------------------------------------
Da Spieler und Tür die gleichen Koordinaten besitzen, liefert
equals(…) die Rückgabe true. Dabei ist es egal, ob wir den Spieler mit
der Tür oder die Tür mit dem Spieler vergleichen – das Ergebnis bei
equals(…) sollte immer symmetrisch sein.

* */
package JAVA_Insel_Smart.Kapitel_3;

public class EqualsMethode {
    public static void main(String[] args) {
        java.awt.Point player = new java.awt.Point();
        player.x = player.y = 10;

        java.awt.Point door = new java.awt.Point();
        door.setLocation(10, 10);

        System.out.println(player.equals(door)); // true
        System.out.println(door.equals(player)); // true

        java.awt.Point snake = new java.awt.Point();
        snake.setLocation(20, 22);
        System.out.println(snake.equals(door)); // false

    }
}
