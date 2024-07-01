/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
Parsen von Strings in primitive Typen:

Integer.parseInt("42") konvertiert den String "42" in den int-Wert 42.
Double.parseDouble("3.14") konvertiert den String "3.14" in den double-Wert 3.14.
Boolean.parseBoolean("true") konvertiert den String "true" in den boolean-Wert true.
------------------------------------------------------------------------------------------------------------------------
Ausgabe der geparsten Werte:

System.out.println("Geparster int-Wert: " + i);
System.out.println("Geparster double-Wert: " + d);
System.out.println("Geparster boolean-Wert: " + b);
------------------------------------------------------------------------------------------------------------------------
* */
package JAVA_Insel_Smart.OCA.Kapitel_10.Wrapper_Klassen_und_Auboxing;

public class StringParsingBeispiele {
    public static void main(String[] args) {
        // Parsen von String in primitive Typen
        int i = Integer.parseInt("42");
        double d = Double.parseDouble("3.14");
        boolean b = Boolean.parseBoolean("true");

        // Ausgabe der geparsten Werte
        System.out.println("Geparster int-Wert: " + i); // 42
        System.out.println("Geparster double-Wert: " + d); // 3.14
        System.out.println("Geparster boolean-Wert: " + b); // true
    }
}
