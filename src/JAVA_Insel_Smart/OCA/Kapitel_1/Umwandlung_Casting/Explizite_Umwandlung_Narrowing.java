/*
Dieser Code deckt alle möglichen expliziten (Narrowing) Typumwandlungen in Java ab:

double zu float, long, int, short, byte
float zu long, int, short, byte
long zu int, short, byte
int zu char, short, byte
short zu byte
* */

package JAVA_Insel_Smart.OCA.Kapitel_1.Umwandlung_Casting;

public class Explizite_Umwandlung_Narrowing {
    public static void main(String[] args) {
// Beispiel für explizite Umwandlung (Narrowing) | das was gewünscht wird, wird in klammern gesetzt
        double d = 100.04;
        float f = (float) d;  // explizite Umwandlung von double zu float | von rechts nach links
        System.out.println("double to float: " + f);

        long l = (long) d;  // explizite Umwandlung von double zu long
        System.out.println("double to long: " + l);

        int i = (int) d;  // explizite Umwandlung von double zu int
        System.out.println("double to int: " + i);

        short s = (short) d;  // explizite Umwandlung von double zu short
        System.out.println("double to short: " + s);

        byte b = (byte) d;  // explizite Umwandlung von double zu byte
        System.out.println("double to byte: " + b);

        float f_Wert_F = 10.5F;
        long longFromFloat = (long) f_Wert_F;  // explizite Umwandlung von float zu long
        System.out.println("float to long: " + longFromFloat);

        int intFromFloat = (int) f_Wert_F;  // explizite Umwandlung von float zu int
        System.out.println("float to int: " + intFromFloat);

        short shortFromFloat = (short) f_Wert_F;  // explizite Umwandlung von float_F zu short
        System.out.println("float to short: " + shortFromFloat);

        byte byteFromFloat = (byte) f_Wert_F;  // explizite Umwandlung von float zu byte
        System.out.println("float to byte: " + byteFromFloat);

        long l2 = 100000L;
        int intFromLong = (int) l2;  // explizite Umwandlung von long zu int
        System.out.println("long to int: " + intFromLong);

        short shortFromLong = (short) l2;  // explizite Umwandlung von long zu short
        System.out.println("long to short: " + shortFromLong);

        byte byteFromLong = (byte) l2;  // explizite Umwandlung von long zu byte
        System.out.println("long to byte: " + byteFromLong);

        int i2 = 65;
        char charValue = (char) i2;  // explizite Umwandlung von int zu char
        System.out.println("int to char: " + charValue);

        short s2 = 100;
        byte byteFromShort = (byte) s2;  // explizite Umwandlung von short zu byte
        System.out.println("short to byte: " + byteFromShort);

        // Es müssen erst datentypen vorhanden sein damit man auf diese zugreifen und umwandeln kann
        int i3 = 300;
        float f3 = (float) i3; // Explizite umwandlung von int zu float
        System.out.println(f3);
    }
}
