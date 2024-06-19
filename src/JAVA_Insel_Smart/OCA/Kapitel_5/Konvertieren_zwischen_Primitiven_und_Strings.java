/*
Unterschiedliche Typen in String-Repräsentationen konvertieren
Primitive Datentypen können in String-Repräsentationen konvertiert werden und umgekehrt.
------------------------------------------------------------------------------------------------------------------------
Erklärung
Konvertierung in String:
Verwenden der jeweiligen toString-Methode der Wrapper-Klassen (Integer.toString(), Double.toString(), etc.),
um primitive Datentypen in String-Repräsentationen zu konvertieren.

Konvertierung von String zu primitiven Datentypen:
Verwenden der jeweiligen parse-Methoden der Wrapper-Klassen (Integer.parseInt(), Double.parseDouble(), etc.),
um String-Repräsentationen in primitive Datentypen zu konvertieren.
Diese Beispiele zeigen, wie man primitive Datentypen in Strings konvertiert und umgekehrt,
und verdeutlichen die Flexibilität der Java-Wrapper-Klassen für diese Aufgaben.
* */
package JAVA_Insel_Smart.OCA.Kapitel_5;

public class Konvertieren_zwischen_Primitiven_und_Strings {
    public static void main(String[] args) {

        byte b = 100;
        String byteString = Byte.toString(b); //Byte zu String: "100"
        byte parsedByte = Byte.parseByte(byteString); //String zu Byte: 100

        System.out.println("Byte zu String: " + byteString);
        System.out.println("String zu Byte: " + parsedByte);
//----------------------------------------------------------------------------------------------------------------------
        short s = 1000;
        String shortString = Short.toString(s); //Short zu String: "1000"
        short parsedShort = Short.parseShort(shortString); //String zu Short: 1000

        System.out.println("Short zu String: " + shortString);
        System.out.println("String zu Short: " + parsedShort);
//----------------------------------------------------------------------------------------------------------------------
        int i = 42;
        String intString = Integer.toString(i); //Int zu String: "42"
        int parsedInt = Integer.parseInt(intString); //String zu Int: 42

        System.out.println("Int zu String: " + intString);
        System.out.println("String zu Int: " + parsedInt);
//----------------------------------------------------------------------------------------------------------------------
        long l = 123456789L;
        String longString = Long.toString(l); //Long zu String: "123456789"
        long parsedLong = Long.parseLong(longString); //String zu Long: 123456789

        System.out.println("Long zu String: " + longString);
        System.out.println("String zu Long: " + parsedLong);
//----------------------------------------------------------------------------------------------------------------------
        float f = 3.14f;
        String floatString = Float.toString(f); //Float zu String: "3.14"
        float parsedFloat = Float.parseFloat(floatString); //String zu Float: 3.14

        System.out.println("Float zu String: " + floatString);
        System.out.println("String zu Float: " + parsedFloat);
//----------------------------------------------------------------------------------------------------------------------
        double d = 3.14159;
        String doubleString = Double.toString(d); //Double zu String: "3.14159"
        double parsedDouble = Double.parseDouble(doubleString); //String zu Double: 3.14159

        System.out.println("Double zu String: " + doubleString);
        System.out.println("String zu Double: " + parsedDouble);
//----------------------------------------------------------------------------------------------------------------------
        char c = 'A';
        String charString = Character.toString(c); //Char zu String: "A"
        char parsedChar = charString.charAt(0); //String zu Char: 'A'

        System.out.println("Char zu String: " + charString); // "A"
        System.out.println("String zu Char: " + parsedChar); // 'A'
//----------------------------------------------------------------------------------------------------------------------
        boolean bool = true;
        String booleanString = Boolean.toString(bool); //Boolean zu String: "true"
        boolean parsedBoolean = Boolean.parseBoolean(booleanString); //String zu Boolean true

        System.out.println("Boolean zu String: " + booleanString);// true
        System.out.println("String zu Boolean: " + parsedBoolean);// true
    }
}
