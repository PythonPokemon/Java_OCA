/*
Dieser Code deckt alle möglichen impliziten (Widening) Typumwandlungen in Java ab:

byte zu short, int, long, float, double
short zu int, long, float, double
char zu int, long, float, double
int zu long, float, double
long zu float, double
float zu double
* */
package JAVA_Insel_Smart.OCA.Kapitel_1.Umwandlung_Casting;

public class Implizite_Umwandlung_Widening {
    public static void main(String[] args) {
        // Beispiel für implizite Umwandlung (Widening)
//----------------------------------------------------------------------------------------------------------------------
        byte b = 42;
        short s = b;  // implizite Umwandlung von byte zu short
        System.out.println("byte zu short: " + s);
//----------------------------------------------------------------------------------------------------------------------
        int i = s;  // implizite Umwandlung von short zu int
        System.out.println("short zu int: " + i);
//----------------------------------------------------------------------------------------------------------------------
        long l = i;  // implizite Umwandlung von int zu long
        System.out.println("int zu long: " + l);
//----------------------------------------------------------------------------------------------------------------------
        float f = l;  // implizite Umwandlung von long zu float
        System.out.println("long zu float: " + f);
//----------------------------------------------------------------------------------------------------------------------
        double d = f;  // implizite Umwandlung von float zu double
        System.out.println("float zu double: " + d);
//----------------------------------------------------------------------------------------------------------------------
        char charValue = 'A';
        int intFromChar = charValue;  // implizite Umwandlung von char zu int
        System.out.println("char zu int: " + intFromChar);
//----------------------------------------------------------------------------------------------------------------------
        long longFromChar = charValue;  // implizite Umwandlung von char zu long
        System.out.println("char zu long: " + longFromChar);
//----------------------------------------------------------------------------------------------------------------------
        float floatFromChar = charValue;  // implizite Umwandlung von char zu float
        System.out.println("char zu float: " + floatFromChar);
//----------------------------------------------------------------------------------------------------------------------
        double doubleFromChar = charValue;  // implizite Umwandlung von char zu double
        System.out.println("char zu double: " + doubleFromChar);
//----------------------------------------------------------------------------------------------------------------------
        // Zusätzliche Umwandlungen für Vollständigkeit
        double anotherDoubleValue = i;  // implizite Umwandlung von int zu double
        System.out.println("int zu double: " + anotherDoubleValue);
//----------------------------------------------------------------------------------------------------------------------
        double anotherDoubleValueFromLong = l;  // implizite Umwandlung von long zu double
        System.out.println("long zu double: " + anotherDoubleValueFromLong);
    }
}
