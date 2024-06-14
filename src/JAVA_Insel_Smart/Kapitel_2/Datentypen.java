/*
Primitive Datentypen im Überblick

Java unterstützt acht primitive Datentypen:

byte: 8-Bit-Ganzzahl
short: 16-Bit-Ganzzahl
int: 32-Bit-Ganzzahl
long: 64-Bit-Ganzzahl
float: 32-Bit-Gleitkommazahl
double: 64-Bit-Gleitkommazahl
char: 16-Bit-Unicode-Zeichen
boolean: Wahrheitswert (true oder false)
------------------------------------------------------------------------------------------------------------------------
2.3.2 Variablendeklarationen

Variablen in Java müssen deklariert werden, bevor sie verwendet werden können.
Eine Variablendeklaration umfasst den Datentyp und den Namen der Variablen:
int zahl;
------------------------------------------------------------------------------------------------------------------------
Variablen können bei der Deklaration initialisiert werden:
int zahl = 5;
------------------------------------------------------------------------------------------------------------------------
2.3.3 Automatisches Feststellen der Typen mit var

Seit Java 10 können lokale Variablen mit dem Schlüsselwort var deklariert werden, das den Typ automatisch ableitet:
var zahl = 5; // Typ wird als int abgeleitet
* */
package JAVA_Insel_Smart.Kapitel_2;

public class Datentypen {
    public static void main(String[] args) {
// Datentyp | Bezeichner | Wert
        int zahl0;      // Dieser Ausdruck wurde nur deklariert, aber nicht initialisiert
        int zahl1 = 1;  // Dieser Ausdruck wurde deklariert & initialisiert, indem der wert 1 dem bezeichner zugewiesen wurde
        var zahl2 = 2;  // var stellt automatisch den Datentyp feste den man mit var deklariert und initialisiert
        var zahl3 = 3.123;
//  Fließkommazahlen mit den Datentypen
        float f = 3.14f;
        double d = 3.14;
// Ganzzahlige Datentypen
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 10000000000L;
// Wahrheitswerte
        boolean wahr = true;
        boolean falsch = false;
// Unterstriche in Zahlen
        int zahl = 1_000_000;
//Alphanumerische Zeichen
        char zeichen = 'A';
// Gute Namen, schlechte Namen
        int anzahlDerTeilnehmer; // Gut
        int a; // Schlecht

// Überladene Methode
        System.out.println(zahl1);
        System.out.println(zahl2);  // deswegen wird hier eine 'Ganzzahl' ausgegeben
        System.out.println(zahl3);  // deswegen wird hier eine 'Gleitkommazahl' ausgegeben
    }
}
