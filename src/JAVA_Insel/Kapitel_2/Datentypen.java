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
package JAVA_Insel.Kapitel_2;

public class Datentypen {
    public static void main(String[] args) {
        int zahl0;      // Dieser Ausdruck wurde nur deklariert, aber nicht initialisiert
        int zahl1 = 1;  // Dieser Ausdruck wurde deklariert & initialisiert, indem der wert 1 dem bezeichner zugewiesen wurde
        var zahl2 = 2;  // var stellt automatisch den Datentyp feste den man mit var deklariert und initialisiert
        var zahl3 = 3.123;

        System.out.println(zahl1);
        System.out.println(zahl2);  // deswegen wird hier eine 'Ganzzahl' ausgegeben
        System.out.println(zahl3);  // deswegen wird hier eine 'Gleitkommazahl' ausgegeben
    }
}
