/*
Die Basisklasse Number für numerische Wrapper-Objekte
Die Klasse Number ist die Superklasse für alle numerischen Wrapper-Klassen in Java,
wie Integer, Double, Float, Long, Byte, und Short. Diese Klasse bietet allgemeine Methoden,
um den Wert in verschiedene numerische Typen zu konvertieren.
------------------------------------------------------------------------------------------------------------------------
Erklärung
------------------------------------------------------------------------------------------------------------------------
1.Erzeugen eines Integer-Wrapper-Objekts:
Wir verwenden die valueOf-Methode,
um ein Integer-Objekt zu erstellen und weisen es einer Number-Referenz zu.

Number n = Integer.valueOf(42);
------------------------------------------------------------------------------------------------------------------------
2.Konvertierung in verschiedene primitive Typen:
Die Number-Klasse bietet Methoden wie intValue() und doubleValue(),
um den Wert in verschiedene primitive Typen zu konvertieren.

int i = n.intValue();
double d = n.doubleValue();
------------------------------------------------------------------------------------------------------------------------
3.Ausgabe der konvertierten Werte:
Wir geben die konvertierten Werte aus.

System.out.println("Integer-Wert: " + i);
System.out.println("Double-Wert: " + d);
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Wrapper_Klassen_und_Auboxing;

public class NumberBeispiele {
    public static void main(String[] args) {
        // Erzeugen eines Integer-Wrapper-Objekts und Zuweisung zu einer Number-Referenz
        Number n = Integer.valueOf(42);

        // Konvertierung in verschiedene primitive Typen
        int i = n.intValue();       // Konvertierung zu int
        double d = n.doubleValue(); // Konvertierung zu double

        // Ausgabe der konvertierten Werte
        System.out.println("Integer-Wert: " + i); // 42
        System.out.println("Double-Wert: " + d);  // 42.0
    }
}
