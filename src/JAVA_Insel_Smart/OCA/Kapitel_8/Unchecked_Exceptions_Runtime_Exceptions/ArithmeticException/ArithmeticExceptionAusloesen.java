/*
Erklärung
In diesem Beispiel ist b auf 0 gesetzt.
Der Versuch, a durch b zu dividieren (10 / 0), führt zu einer ArithmeticException.
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Unchecked_Exceptions_Runtime_Exceptions.ArithmeticException;

public class ArithmeticExceptionAusloesen {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int ergebnis = a / b;  // Dies löst eine ArithmeticException aus
        System.out.println("Ergebnis: " + ergebnis);
    }
}
