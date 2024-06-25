/*
Erklärung
Die Division wird innerhalb eines try-catch-Blocks durchgeführt.
Wenn eine ArithmeticException ausgelöst wird, wird sie im catch-Block abgefangen.
Eine Fehlermeldung wird ausgegeben, anstatt dass das Programm abstürzt.
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Unchecked_Exceptions_Runtime_Exceptions.ArithmeticException;

public class ArithmeticExceptionBehandeln {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int ergebnis = a / b;
            System.out.println("Ergebnis: " + ergebnis);
        } catch (ArithmeticException e) {
            System.out.println("Fehler: Division durch null ist nicht erlaubt.");
        }
    }
}
