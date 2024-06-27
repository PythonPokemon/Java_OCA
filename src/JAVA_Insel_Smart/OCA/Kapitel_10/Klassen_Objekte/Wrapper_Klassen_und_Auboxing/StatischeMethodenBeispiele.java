/*
Statische Reduzierungsmethoden in Wrapper-Klassen
Wrapper-Klassen in Java bieten statische Methoden zur Reduzierung von Arrays auf einzelne Werte.
Diese Methoden sind nützlich, um Summen, Maxima und Minima von Zahlen zu berechnen.
------------------------------------------------------------------------------------------------------------------------
Erklärung
------------------------------------------------------------------------------------------------------------------------
Verwendung der sum-Methode:
Diese Methode addiert zwei int-Werte und gibt die Summe zurück.

int sum = Integer.sum(1, 2); ergibt 3.
------------------------------------------------------------------------------------------------------------------------
Verwendung der max-Methode:
Diese Methode vergleicht zwei int-Werte und gibt den größeren Wert zurück.

int max = Integer.max(1, 2); ergibt 2.
------------------------------------------------------------------------------------------------------------------------
Verwendung der min-Methode:
Diese Methode vergleicht zwei int-Werte und gibt den kleineren Wert zurück.

int min = Integer.min(1, 2); ergibt 1.
------------------------------------------------------------------------------------------------------------------------
Ausgabe der Ergebnisse:
Die Ergebnisse der Methodenaufrufe werden ausgegeben.

System.out.println("Summe von 1 und 2: " + sum);
System.out.println("Maximum von 1 und 2: " + max);
System.out.println("Minimum von 1 und 2: " + min);
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.Wrapper_Klassen_und_Auboxing;

public class StatischeMethodenBeispiele {
    public static void main(String[] args) {
        // Verwendung der sum-Methode
        int sum = Integer.sum(1, 2);  // 3
        System.out.println("Summe von 1 und 2: " + sum);

        // Verwendung der max-Methode
        int max = Integer.max(1, 2);  // 2
        System.out.println("Maximum von 1 und 2: " + max);

        // Verwendung der min-Methode
        int min = Integer.min(1, 2);  // 1
        System.out.println("Minimum von 1 und 2: " + min);
    }
}
