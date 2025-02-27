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
------------------------------------------------------------------------------------------------------------------------
equals() Methode
Die Methode equals() wird verwendet, um den inhaltlichen Vergleich von Objekten zu ermöglichen.
Das bedeutet, dass zwei Objekte als gleich angesehen werden, wenn sie denselben Zustand haben.
Die equals() Methode ist in der Klasse Object definiert und kann in Unterklassen überschrieben werden,
um eine spezifische Vergleichslogik zu implementieren.

* */
package JAVA_Insel_Smart.OCA.Kapitel_3;

public class EqualsMethode {
    public static void main(String[] args) {
        java.awt.Point player = new java.awt.Point();   // erstellung neues Objekt | namens 'player'
        player.x = player.y = 10;                       // eigenschaften vom Objekt x, y mit den elementen 10

        java.awt.Point door = new java.awt.Point();     // erstellung neues Objekt | namens 'door'
        door.setLocation(10, 10);                 // eigenschaften vom Objekt x, y mit den elementen 10

        System.out.println(player.equals(door)); // true | vergleicht die elemente | sind gleich
        System.out.println(door.equals(player)); // true | vergleicht die elemente | sind gleich

        java.awt.Point snake = new java.awt.Point();    // erstellung neues Objekt | namens 'snake'
        snake.setLocation(20, 22);                // eigenschaften vom Objekt x, y mit den elementen 20, 22
        System.out.println(snake.equals(door)); // false | vergleicht die elemente | sind ungliech
    }
}
