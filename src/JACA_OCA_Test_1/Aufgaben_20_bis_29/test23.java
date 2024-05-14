/*
* In Java vergleicht die Methode equals() von String und StringBuilder den Inhalt der Zeichenketten, nicht die Objektreferenzen selbst.
* Da str eine Instanz von String ist und sb eine Instanz von StringBuilder, sind sie unterschiedliche Typen und werden als ungleich betrachtet, auch wenn ihre Inhalte gleich sind.
*
* In deinem Code wird zuerst der Ausdruck str.equals(sb) ausgewertet.
* Dies ergibt false, da die Methode equals() zwischen einem String und einem StringBuilder vergleicht und sie als ungleich betrachtet.
*
* Danach wird der Ausdruck sb.equals(str) ausgewertet.
* Dies ergibt ebenfalls false, da die Methode equals() in der Klasse StringBuilder nicht die gleiche Implementierung hat wie in der Klasse String.
* In der StringBuilder-Klasse wird der Vergleich nach dem Typ der Objekte durchgeführt, und da str eine Instanz von String ist und sb eine Instanz von StringBuilder, werden sie als ungleich betrachtet.
*
* Deshalb gibt der Ausdruck str.equals(sb) + ":" + sb.equals(str) "false:false" aus.
* Beide Vergleiche ergeben false, weil die Typen der Objekte unterschiedlich sind, selbst wenn ihre Inhalte gleich sind.
**/

package JACA_OCA_Test_1.Aufgaben_20_bis_29;

public class test23 {
    public static void main(String[] args) {
        String str = "java";
        StringBuilder sb = new StringBuilder("java");

        System.out.println(str.equals(sb) + ":" + sb.equals(str));  // <-- hier ist der Unterschied
    }


    // alternative Methode | toSring() umwandlung | zum Testen auskommentieren
//    public static void main(String[] args) {
//        String str = "java";
//        StringBuilder sb = new StringBuilder("java");
//
//        // Vergleicht den tatsächlichen Inhalt der Zeichenketten miteinander "java"
//        System.out.println(str.equals(sb.toString()) + ":" + sb.toString().equals(str));  // <-- hier ist der Unterschied
//    }
}
