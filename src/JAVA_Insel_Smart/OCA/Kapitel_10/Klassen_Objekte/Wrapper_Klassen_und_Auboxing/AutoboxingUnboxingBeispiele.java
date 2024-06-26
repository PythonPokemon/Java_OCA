/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
Autoboxing: Primitive Typen werden automatisch in ihre entsprechenden Wrapper-Objekte konvertiert.

Integer i = 42; entspricht Integer i = Integer.valueOf(42);
Double d = 3.14; entspricht Double d = Double.valueOf(3.14);
Boolean b = true; entspricht Boolean b = Boolean.valueOf(true);
------------------------------------------------------------------------------------------------------------------------
Unboxing: Wrapper-Objekte werden automatisch in primitive Typen konvertiert.

int intValue = i; entspricht int intValue = i.intValue();
double doubleValue = d; entspricht double doubleValue = d.doubleValue();
boolean booleanValue = b; entspricht boolean booleanValue = b.booleanValue();
------------------------------------------------------------------------------------------------------------------------
* */
package JAVA_Insel_Smart.OCA.Kapitel_10.Klassen_Objekte.Wrapper_Klassen_und_Auboxing;

public class AutoboxingUnboxingBeispiele {
    public static void main(String[] args) {
        // Autoboxing: primitiver int wird in Integer-Objekt umgewandelt
        Integer i = 42;
        Double d = 3.14;
        Boolean b = true;

        // Unboxing: Integer-Objekt wird in primitiven int umgewandelt
        int intValue = i;
        double doubleValue = d;
        boolean booleanValue = b;

        // Ausgabe der Werte
        System.out.println("Autoboxing - Integer-Wert: " + i);
        System.out.println("Autoboxing - Double-Wert: " + d);
        System.out.println("Autoboxing - Boolean-Wert: " + b);

        System.out.println("Unboxing - Primitiver int-Wert: " + intValue);
        System.out.println("Unboxing - Primitiver double-Wert: " + doubleValue);
        System.out.println("Unboxing - Primitiver boolean-Wert: " + booleanValue);
    }
}
