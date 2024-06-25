/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
1.Spezifische Ausnahme (ArithmeticException):

Der erste catch-Block fängt die ArithmeticException ab, die auftritt, wenn a durch b (welches 0 ist) geteilt wird.
Eine spezifische Fehlermeldung wird ausgegeben: "Fehler: Division durch null ist nicht erlaubt."
------------------------------------------------------------------------------------------------------------------------
2.Allgemeine Ausnahme (Exception):

Der zweite catch-Block fängt jede andere Exception ab, die möglicherweise auftritt.
Eine allgemeine Fehlermeldung wird ausgegeben: "Allgemeiner Fehler: [Fehlermeldung]."
------------------------------------------------------------------------------------------------------------------------
3.finally-Block:

Der finally-Block wird immer ausgeführt, unabhängig davon, ob eine Ausnahme aufgetreten ist oder nicht.
Dies ist nützlich für Aufräumarbeiten oder das Freigeben von Ressourcen.
In diesem Beispiel wird eine Nachricht ausgegeben:
"Dieser Block wird immer ausgeführt, unabhängig davon, ob eine Ausnahme aufgetreten ist oder nicht."
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Unchecked_Exceptions_Runtime_Exceptions.ArithmeticException;

public class ArithmeticExceptionMitFinally {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int ergebnis = a / b;
            System.out.println("Ergebnis: " + ergebnis);
        } catch (ArithmeticException e) {
            System.out.println("Fehler: Division durch null ist nicht erlaubt.");
        } catch (Exception e) {
            System.out.println("Allgemeiner Fehler: " + e.getMessage());
        } finally {
            System.out.println("Dieser Block wird immer ausgeführt, unabhängig davon, ob eine Ausnahme aufgetreten ist oder nicht.");
        }
    }
}