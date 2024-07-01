/*
Die Boolean-Klasse
------------------------------------------------------------------------------------------------------------------------
Die Klasse Boolean in Java bietet verschiedene Methoden zur Arbeit mit booleschen Werten.
Diese Methoden helfen bei der Durchführung von Operationen wie Vergleichen und Konvertieren von Boolean-Werten.
------------------------------------------------------------------------------------------------------------------------
Erklärung
------------------------------------------------------------------------------------------------------------------------
Verwendung der Boolean.TRUE-Konstanten:

Diese Konstante repräsentiert den booleschen Wert true.
Beispiel: Boolean bool = Boolean.TRUE;
------------------------------------------------------------------------------------------------------------------------
Konvertierung in primitiven boolean-Wert:

Die Methode booleanValue() konvertiert ein Boolean-Objekt in den entsprechenden primitiven boolean-Wert.
Beispiel: boolean b = bool.booleanValue(); ergibt true.
------------------------------------------------------------------------------------------------------------------------
Vergleich von boolean-Werten mit Boolean.compare:

Diese Methode vergleicht zwei boolean-Werte.
Beispiel: int compareResult = Boolean.compare(true, false); ergibt 1, da true größer als false ist.
------------------------------------------------------------------------------------------------------------------------
Verwendung der parseBoolean-Methode:

Diese Methode konvertiert eine String-Repräsentation eines booleschen Wertes in einen primitiven boolean-Wert.
Beispiel: boolean parsedBoolean = Boolean.parseBoolean("true"); ergibt true.
------------------------------------------------------------------------------------------------------------------------
Verwendung der toString-Methode:

Diese Methode konvertiert einen boolean-Wert in seine String-Repräsentation.
Beispiel: String boolString = Boolean.toString(false); ergibt "false".
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Wrapper_Klassen_und_Auboxing;

public class BooleanMethodenBeispiele {
    public static void main(String[] args) {
        // Verwendung der Boolean.TRUE-Konstanten
        Boolean bool = Boolean.TRUE;

        // Konvertierung in primitiven boolean-Wert
        boolean b = bool.booleanValue();  // true
        System.out.println("Boolean-Wert von Boolean.TRUE: " + b);

        // Vergleich von zwei boolean-Werten
        int compareResult = Boolean.compare(true, false);  // > 0
        System.out.println("Vergleich von true und false: " + compareResult);  // 1

        // Verwendung der parseBoolean-Methode
        boolean parsedBoolean = Boolean.parseBoolean("true");  // true
        System.out.println("Geparster boolean-Wert von \"true\": " + parsedBoolean);

        // Verwendung der toString-Methode
        String boolString = Boolean.toString(false);  // "false"
        System.out.println("String-Repräsentation von false: " + boolString);
    }
}
