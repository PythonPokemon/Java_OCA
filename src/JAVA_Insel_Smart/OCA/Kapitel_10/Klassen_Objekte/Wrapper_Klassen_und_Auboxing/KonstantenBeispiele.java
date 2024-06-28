/*
Konstanten für die Größe eines primitiven Typs
Wrapper-Klassen in Java definieren Konstanten für die Größe und den Wertebereich der entsprechenden primitiven Typen.
Diese Konstanten können verwendet werden, um Informationen über die Größe und den Bereich der Datentypen zu erhalten.
------------------------------------------------------------------------------------------------------------------------
Erklärung
Konstanten für Größe und Bereich:

Integer.SIZE gibt die Anzahl der Bits zurück, die zur Darstellung eines int-Werts benötigt werden (32 Bits).
Integer.BYTES gibt die Anzahl der Bytes zurück, die zur Speicherung eines int-Werts benötigt werden (4 Bytes).
Integer.MAX_VALUE gibt den maximalen Wert zurück, den ein int haben kann (2147483647).
Integer.MIN_VALUE gibt den minimalen Wert zurück, den ein int haben kann (-2147483648).
Ausgabe der Konstanten: Die Konstanten werden mit System.out.println ausgegeben, um die Informationen anzuzeigen.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.Wrapper_Klassen_und_Auboxing;

public class KonstantenBeispiele {
    public static void main(String[] args) {
        // Verwenden der Konstanten in der Integer-Klasse
        int bits = Integer.SIZE;  // Anzahl der Bits für int
        int bytes = Integer.BYTES;  // Anzahl der Bytes für int
        int max = Integer.MAX_VALUE;  // Maximale Wert für int
        int min = Integer.MIN_VALUE;  // Minimale Wert für int

        // Ausgabe der Konstanten
        System.out.println("Anzahl der Bits für int: " + bits);  // 32
        System.out.println("Anzahl der Bytes für int: " + bytes);  // 4
        System.out.println("Maximaler Wert für int: " + max);  // 2147483647
        System.out.println("Minimaler Wert für int: " + min);  // -2147483648
    }
}
