/*
Erklärung
In diesem Beispiel wird die geschachtelte Ausnahme im catch-Block der main-Methode behandelt.
Die getCause-Methode wird verwendet, um die ursprüngliche Ausnahme zu erhalten
und deren Nachricht und Stack-Trace auszugeben.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Geschachtelten_Ausnahme;

public class GeschachtelteAusnahmenBehandeln {
    public static void main(String[] args) {
        try {
            int result = berechne(10, 0);
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
            Throwable ursache = e.getCause();
            if (ursache != null) {
                System.out.println("Ursache: " + ursache.getMessage());
                ursache.printStackTrace();
            }
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
