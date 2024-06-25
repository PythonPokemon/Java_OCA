/*
Erklärung
Ausnahmebehandlung mit throws in der Methodensignatur:

Die Methode dividiere deklariert throws ArithmeticException in ihrer Signatur und behandelt die Ausnahme nicht direkt.
Die Ausnahme wird an die aufrufende Methode (main) weitergeleitet.
Die main-Methode enthält einen try-catch-Block, um die ArithmeticException zu behandeln,
wenn eine Division durch Null erfolgt.
------------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Checked_Exceptions.IOException;

public class DivisionMitThrows {
    public static void main(String[] args) {
        try {
            int ergebnis = dividiere(10, 0);
            System.out.println("Ergebnis: " + ergebnis);
        } catch (ArithmeticException e) {
            System.out.println("Fehler: Division durch Null.");
        }
    }

    public static int dividiere(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
