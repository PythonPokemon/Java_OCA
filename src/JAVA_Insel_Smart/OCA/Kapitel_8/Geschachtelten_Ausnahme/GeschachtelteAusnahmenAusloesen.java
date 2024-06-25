/*
Erklärung
In diesem Beispiel wird in der Methode berechne versucht, eine Division durch null durchzuführen,
was eine ArithmeticException auslöst.
Diese ArithmeticException wird im catch-Block abgefangen und eine neue RuntimeException wird mit der ursprünglichen
Ausnahme als geschachtelte Ausnahme geworfen.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Geschachtelten_Ausnahme;

public class GeschachtelteAusnahmenAusloesen {
    public static void main(String[] args) {

        try {
            int result = berechne(10, 0);
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public static int berechne(int a, int b) {

        try {
            return a / b;  // Dies löst eine ArithmeticException aus
        } catch (ArithmeticException e) {
            throw new RuntimeException("Fehler bei der Berechnung", e);
        }

    }
}
