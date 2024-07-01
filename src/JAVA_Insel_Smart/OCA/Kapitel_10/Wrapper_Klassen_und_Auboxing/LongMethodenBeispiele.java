/*
Die Long-Klasse
Die Klasse Long in Java bietet verschiedene Methoden zur Manipulation von Long-Werten.
Diese Methoden helfen bei der Durchführung von Operationen wie Rotationen,
Vergleichen und anderen mathematischen Berechnungen.
------------------------------------------------------------------------------------------------------------------------
Erklärung
------------------------------------------------------------------------------------------------------------------------
Verwendung der rotateLeft-Methode:

Diese Methode rotiert die Bits eines Long-Werts nach links um die angegebene Anzahl von Positionen.
Beispiel: long l = Long.rotateLeft(1L, 1); ergibt 2, da 1 (0001 in Binärdarstellung)
um eine Position nach links rotiert wird und 10 (0010 in Binärdarstellung) ergibt.
------------------------------------------------------------------------------------------------------------------------
Verwendung der rotateRight-Methode:

Diese Methode rotiert die Bits eines Long-Werts nach rechts um die angegebene Anzahl von Positionen.
Beispiel: long l2 = Long.rotateRight(2L, 1); ergibt 1, da 2 (0010 in Binärdarstellung)
um eine Position nach rechts rotiert wird und 1 (0001 in Binärdarstellung) ergibt.
------------------------------------------------------------------------------------------------------------------------
Ausgabe der Ergebnisse:

System.out.println("1 um eine Position nach links rotiert: " + l);
System.out.println("2 um eine Position nach rechts rotiert: " + l2);
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Wrapper_Klassen_und_Auboxing;

public class LongMethodenBeispiele {
    public static void main(String[] args) {
        // Verwendung der rotateLeft-Methode von Long
        long l = Long.rotateLeft(1L, 1);  // 2, da 1 um eine Position nach links rotiert wird
        System.out.println("1 um eine Position nach links rotiert: " + l);  // 2

        // Verwendung der rotateRight-Methode von Long
        long l2 = Long.rotateRight(2L, 1);  // 1, da 2 um eine Position nach rechts rotiert wird
        System.out.println("2 um eine Position nach rechts rotiert: " + l2);  // 1
    }
}
