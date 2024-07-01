/*
Die Klassen Double und Float für Fließkommazahlen
Die Klassen Double und Float in Java bieten verschiedene Methoden zur Arbeit mit Fließkommazahlen.
Diese Methoden helfen bei der Durchführung von Berechnungen und Vergleichen mit Fließkommazahlen.
------------------------------------------------------------------------------------------------------------------------
Erklärung
Verwendung der Double.sum-Methode:

Diese Methode addiert zwei double-Werte und gibt die Summe zurück.
Beispiel: double dSum = Double.sum(1.0, 2.0); ergibt 3.0.
Vergleich von double-Werten mit Double.compare:

Diese Methode vergleicht zwei double-Werte.
Beispiel: int dCompare = Double.compare(1.0, 2.0); ergibt -1, da 1.0 kleiner als 2.0 ist.
Verwendung der Float.sum-Methode:

Diese Methode addiert zwei float-Werte und gibt die Summe zurück.
Beispiel: float fSum = Float.sum(1.0f, 2.0f); ergibt 3.0.
Vergleich von float-Werten mit Float.compare:

Diese Methode vergleicht zwei float-Werte.
Beispiel: int fCompare = Float.compare(1.0f, 2.0f); ergibt -1, da 1.0f kleiner als 2.0f ist.
Ausgabe der Ergebnisse:

System.out.println("Summe von 1.0 und 2.0: " + dSum);
System.out.println("Vergleich von 1.0 und 2.0: " + dCompare);
System.out.println("Summe von 1.0f und 2.0f: " + fSum);
System.out.println("Vergleich von 1.0f und 2.0f: " + fCompare);
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Wrapper_Klassen_und_Auboxing;

public class DoubleUndFloatBeispiele {
    public static void main(String[] args) {
        // Verwendung der sum-Methode von Double
        double dSum = Double.sum(1.0, 2.0);  // 3.0
        System.out.println("Summe von 1.0 und 2.0: " + dSum);  // 3.0

        // Vergleich von zwei Double-Werten
        int dCompare = Double.compare(1.0, 2.0);  // < 0
        System.out.println("Vergleich von 1.0 und 2.0: " + dCompare);  // -1

        // Verwendung der sum-Methode von Float
        float fSum = Float.sum(1.0f, 2.0f);  // 3.0
        System.out.println("Summe von 1.0f und 2.0f: " + fSum);  // 3.0

        // Vergleich von zwei Float-Werten
        int fCompare = Float.compare(1.0f, 2.0f);  // < 0
        System.out.println("Vergleich von 1.0f und 2.0f: " + fCompare);  // -1
    }
}
