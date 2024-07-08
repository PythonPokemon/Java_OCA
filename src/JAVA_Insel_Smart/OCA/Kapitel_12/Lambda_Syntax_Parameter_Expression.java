/*
Syntax (parameters) -> expression:
------------------------------------------------------------------------------------------------------------------------
Wird verwendet, wenn die Lambda-Funktion nur einen Ausdruck enthält.
Der Ausdruck wird automatisch zurückgegeben.
Beispiel: (a, b) -> a * b

Multiplier multiplier = (a, b) -> a * b;:

Lambda-Ausdruck, der zwei Parameter (a, b) nimmt und das Produkt zurückgibt.
* */

package JAVA_Insel_Smart.OCA.Kapitel_12;

// Funktionales Interface für Multiplikation
@FunctionalInterface
interface Multiplizierer {
    int multipliziert(int a, int b);
}

public class Lambda_Syntax_Parameter_Expression {
    public static void main(String[] args) {

        // Aufruf des Interfaces und dessen methode
        // Lambda-Ausdruck, der zwei Zahlen multipliziert und der methode 'multiplizierer' zuweist
        Multiplizierer multiplizierer = (a, b) -> a * b;

        // Verwenden des Lambda-Ausdrucks
        int ergebnis = multiplizierer.multipliziert(4, 5);
        System.out.println("Ergebnis der Multiplikation: " + ergebnis);
    }
}
