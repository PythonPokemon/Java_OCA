/*
Notizen:

@FunctionalInterface: Ein Interface mit genau einer abstrakten Methode.
Adder adder = (a, b) -> a + b;: Lambda-Ausdruck, der zwei Parameter (a und b) nimmt und deren Summe zurückgibt.
* */
package JAVA_Insel_Smart.OCA.Kapitel_12;

// Funktionales Interface mit einer Methode, die zwei Zahlen addiert
@FunctionalInterface
interface Adder {
    int add(int a, int b);
}

public class Lambda_Addition {
    public static void main(String[] args) {
        // Lambda-Ausdruck, der die abstrakte Methode des funktionalen Interfaces implementiert
        Adder adder = (a, b) -> a + b;

        // Verwenden des Lambda-Ausdrucks
        int result = adder.add(5, 3);
        System.out.println("Ergebnis der Addition: " + result);
    }
}
