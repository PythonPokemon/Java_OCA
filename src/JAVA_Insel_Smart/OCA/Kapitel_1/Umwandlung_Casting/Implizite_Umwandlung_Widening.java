/*
Dieser Code deckt alle möglichen impliziten (Widening) Typumwandlungen in Java ab:

byte zu short, int, long, float, double
short zu int, long, float, double
char zu int, long, float, double
int zu long, float, double
long zu float, double
float zu double
------------------------------------------------------------------------------------------------------------------------
also kann man implizit gar nicht ein int zum char machen nur explizit!
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
        double d3 = i;  // implizite Umwandlung von int zu double
        System.out.println("int zu long: " + l);
        System.out.println("int zu double: " + d3);
//----------------------------------------------------------------------------------------------------------------------
        float f = l;  // implizite Umwandlung von long zu float
        double d4 = l;  // implizite Umwandlung von long zu double
        System.out.println("long zu float: " + f);
        System.out.println("long zu double: " + d4);
//----------------------------------------------------------------------------------------------------------------------
        double d = f;  // implizite Umwandlung von float zu double
        System.out.println("float zu double: " + d);
//----------------------------------------------------------------------------------------------------------------------
        char c = 'A'; // 62 weil Char 'A' ASCI / UNI-Code den Platz 65 entspricht

        int i2 = c;  // implizite Umwandlung von char zu int
        long l2 = c;  // implizite Umwandlung von char zu long
        float f2 = c;  // implizite Umwandlung von char zu float
        double d2 = c;  // implizite Umwandlung von char zu double
        System.out.println("char zu int: " + i2);
        System.out.println("char zu long: " + l2);
        System.out.println("char zu float: " + f2);
        System.out.println("char zu double: " + d2);
    }
}
