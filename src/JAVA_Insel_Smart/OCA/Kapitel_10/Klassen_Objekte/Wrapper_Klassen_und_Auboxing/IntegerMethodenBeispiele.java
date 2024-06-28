/*
Die Klasse Integer
Die Klasse Integer in Java bietet eine Vielzahl von Methoden zur Manipulation und Verarbeitung von Integer-Werten.
Hier sind einige einfache Beispiele, die zeigen, wie man diese Methoden benutzt und richtig einsetzt.
------------------------------------------------------------------------------------------------------------------------
Erklärung
Verwendung der bitCount-Methode:

Die Methode Integer.bitCount zählt die Anzahl der auf 1 gesetzten Bits (auch bekannt als "Hamming-Gewicht")
in der Binärdarstellung eines Integer-Werts.
Beispiel: int bitCount = Integer.bitCount(5); gibt 2 zurück, da die Binärdarstellung von 5 (101) zwei gesetzte Bits hat.

Verwendung der reverse-Methode:

Die Methode Integer.reverse kehrt die Bitfolge eines Integer-Werts um.
Beispiel: int reversed = Integer.reverse(5); gibt 2684354560 zurück,
da die umgekehrte Bitfolge von 5 (101) 10100000000000000000000000000000 ergibt.

Ausgabe der Ergebnisse:

System.out.println("Anzahl der gesetzten Bits in 5: " + bitCount);
System.out.println("Umgekehrte Binärdarstellung von 5: " + reversed);
System.out.println("Umgekehrte Binärdarstellung von 5 (Binär): " + Integer.toBinaryString(reversed));
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.Wrapper_Klassen_und_Auboxing;

public class IntegerMethodenBeispiele {
    public static void main(String[] args) {
        // Verwendung der bitCount-Methode
        int bitCount = Integer.bitCount(5);  // 5 in Binärdarstellung ist 101, hat 2 gesetzte Bits
        System.out.println("Anzahl der gesetzten Bits in 5: " + bitCount);  // 2

        // Verwendung der reverse-Methode
        int reversed = Integer.reverse(5);  // 5 in Binärdarstellung ist 101, umgekehrt ist 10100000000000000000000000000000
        System.out.println("Umgekehrte Binärdarstellung von 5: " + reversed);  // 2684354560
        System.out.println("Umgekehrte Binärdarstellung von 5 (Binär): " + Integer.toBinaryString(reversed));  // 10100000000000000000000000000000
    }
}
