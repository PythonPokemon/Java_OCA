/*
------------------------------------------------------------------------------------------------------------------------
Behandeln von vorzeichenlosen Zahlen
Wrapper-Klassen in Java bieten Methoden zur Behandlung von vorzeichenlosen Zahlen.
Diese Methoden sind nützlich, wenn du mit vorzeichenlosen Werten arbeiten musst,
die als signierte Typen gespeichert sind.
------------------------------------------------------------------------------------------------------------------------
Erklärung
------------------------------------------------------------------------------------------------------------------------
1.Umwandlung in vorzeichenlose long-Darstellung:
Die Methode Integer.toUnsignedLong konvertiert einen int-Wert in seine vorzeichenlose long-Darstellung.

long unsignedInt = Integer.toUnsignedLong(-1); konvertiert -1 in 4294967295, da -1 als 4294967295 interpretiert wird,
wenn er vorzeichenlos ist.
------------------------------------------------------------------------------------------------------------------------
2.Vergleich von vorzeichenlosen int-Werten:
Die Methode Integer.compareUnsigned vergleicht zwei int-Werte als vorzeichenlose Zahlen.

int compareResult = Integer.compareUnsigned(-1, 1); ergibt einen positiven Wert,
da -1 als 4294967295 interpretiert wird und somit größer als 1 ist.
------------------------------------------------------------------------------------------------------------------------
3.Ausgabe der Ergebnisse: Die Ergebnisse der Methodenaufrufe werden ausgegeben.

System.out.println("Vorzeichenlose long-Darstellung von -1: " + unsignedInt);
System.out.println("Vergleich von -1 und 1 als vorzeichenlose Zahlen: " + compareResult);
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Wrapper_Klassen_und_Auboxing;

public class UnsignedZahlenBeispiele {
    public static void main(String[] args) {
        // Umwandlung eines int in eine vorzeichenlose long-Darstellung
        long unsignedInt = Integer.toUnsignedLong(-1);  // 4294967295
        System.out.println("Vorzeichenlose long-Darstellung von -1: " + unsignedInt);

        // Vergleich von vorzeichenlosen int-Werten
        int compareResult = Integer.compareUnsigned(-1, 1);  // > 0, da -1 als 4294967295 interpretiert wird
        System.out.println("Vergleich von -1 und 1 als vorzeichenlose Zahlen: " + compareResult);
    }
}
