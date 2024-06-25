/*
Erklärung
In diesem Beispiel enthält die Variable zahlAlsText den Wert "abc", der keine gültige Zahl ist.
Der Versuch, diese Zeichenkette mit Integer.parseInt in eine Ganzzahl zu konvertieren,
führt zu einer NumberFormatException.
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Unchecked_Exceptions_Runtime_Exceptions.NumberFormatException;

public class NumberFormatExceptionAusloesen {
    public static void main(String[] args) {
        String zahlAlsText = "abc";
        int zahl = Integer.parseInt(zahlAlsText);  // Dies löst eine NumberFormatException aus
    }
}
