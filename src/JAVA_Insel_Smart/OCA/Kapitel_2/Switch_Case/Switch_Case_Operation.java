/*
Operationen innerhalb einer switch-Anweisung
------------------------------------------------------------------------------------------------------------------------
Innerhalb einer switch-Anweisung können verschiedene Operationen durchgeführt werden,
abhängig vom Wert der Schaltervariable:
------------------------------------------------------------------------------------------------------------------------
Ausgabe von Text: Mit System.out.println() können Nachrichten ausgegeben werden (wie in deinen Beispielen).
Berechnungen: Mathematische Operationen können ausgeführt werden.
Methodenaufrufe: Es können Methoden aufgerufen werden.
Änderung von Variablenwerten: Variablen können geändert werden.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_2.Switch_Case;

public class Switch_Case_Operation {
    public static void main(String[] args) {
        int operation = 2;
        int a = 5, b = 10;
        int result = 0;

        switch (operation) {
            case 1:
                result = a + b;
                System.out.println("Addition: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Subtraktion: " + result); // gibt case 2 aus, weil 5 - 10 = 0 ist, nachdem gesucht wird
                break;
            case 3:
                result = a * b;
                System.out.println("Multiplikation: " + result);
                break;
            case 4:
                result = a / b;
                System.out.println("Division: " + result);
                break;
            default:
                System.out.println("Ungültige Operation");
                break;
        }
    }
}
