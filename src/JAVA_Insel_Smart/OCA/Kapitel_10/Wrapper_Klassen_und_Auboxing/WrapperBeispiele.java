/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
Erzeugen von Wrapper-Objekten: Wir verwenden die valueOf-Methode der Wrapper-Klassen, um Wrapper-Objekte zu erstellen.

Integer i = Integer.valueOf(42);
Double d = Double.valueOf(3.14);
Boolean b = Boolean.valueOf(true);
Ausgabe der Wrapper-Objekte: Wir geben die Wrapper-Objekte aus.

System.out.println("Integer-Wert: " + i);
System.out.println("Double-Wert: " + d);
System.out.println("Boolean-Wert: " + b);
------------------------------------------------------------------------------------------------------------------------
Verwendung von Methoden der Wrapper-Klassen: Wir konvertieren die Wrapper-Objekte wieder in primitive Typen.

int intValue = i.intValue();
double doubleValue = d.doubleValue();
boolean booleanValue = b.booleanValue();
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Wrapper_Klassen_und_Auboxing;

public class WrapperBeispiele {
    public static void main(String[] args) {
        // Erzeugen von Wrapper-Objekten
        Integer i = Integer.valueOf(42);
        Double d = Double.valueOf(3.14);
        Boolean b = Boolean.valueOf(true);

        // Ausgabe der Wrapper-Objekte
        System.out.println("Integer-Wert: " + i);
        System.out.println("Double-Wert: " + d);
        System.out.println("Boolean-Wert: " + b);

        // Verwendung von Methoden der Wrapper-Klassen
        int intValue = i.intValue();
        double doubleValue = d.doubleValue();
        boolean booleanValue = b.booleanValue();

        System.out.println("Primitiver int-Wert: " + intValue);
        System.out.println("Primitiver double-Wert: " + doubleValue);
        System.out.println("Primitiver boolean-Wert: " + booleanValue);
    }
}
