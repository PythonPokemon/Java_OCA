package ImperativeSprachkonstrukte;

/**
 * Die Datentypen in Java zerfallen in zwei Kategorien
 * <p>
 * -Primitive Typen
 * Die primitiven (einfachen) Typen sind fest in der Sprache Java eingebaute
 * Datentypen für Zahlen, Unicode-Zeichen und Wahrheitswerte.
 * <p>
 * -Referenztypen:
 * Mit diesem Datentyp lassen sich Objektweise etwa auf Zeichenketten,
 * Datenstrukturen oder Zwergpinscher verwalten.
 * <p>
 * In Java gibt es zwei Arten eingebauter primitiver Datentypen:
 * <p>
 * -arythmetische Typen
 * 1. Gazte Zahlen, 2. Fließkommazahlen, 3. Unicode-Zeichen
 * <p>
 * -Wahrheitswerte
 * für die Zustände wahr und Falsch
 */

public class Types {
    public static void main(String[] args) {
        // Primitive Datentypen
        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L;
        float floatValue = 3.4028235E38f;
        double doubleValue = 1.7976931348623157E308;
        char charValue = 'A';
        boolean booleanValue = true;

        // Referenztypen
        String stringValue = "Hallo Welt";

        // Arithmetische Typen
        System.out.println("Arithmetische Typen:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);

        // Wahrheitswerte
        System.out.println("\nWahrheitswerte:");
        System.out.println("boolean: " + booleanValue);

        // Referenztypen
        System.out.println("\nReferenztypen:");
        System.out.println("String: " + stringValue);
    }
}
