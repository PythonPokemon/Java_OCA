/*
Von char in int: vom Zeichen zur Zahl
Die Character-Klasse bietet Methoden zur Umwandlung von Zeichen in ihren numerischen Wert und umgekehrt.
------------------------------------------------------------------------------------------------------------------------
Erklärung des Codes
1.Umwandlung eines Zeichens in einen numerischen Wert:

int num = Character.digit('3', 10); // 3
Character.digit('3', 10) konvertiert das Zeichen '3' in den entsprechenden numerischen Wert in der Basis 10 (dezimal).
Das Ergebnis ist 3.
------------------------------------------------------------------------------------------------------------------------
2.Umwandlung einer Zahl in ein Zeichen:

char ch = Character.forDigit(12, 16); // 'c'
Character.forDigit(12, 16) konvertiert die Zahl 12 in das entsprechende Zeichen in der Basis 16 (hexadezimal).
Das Ergebnis ist 'c', da 12 in hexadezimal c entspricht.
------------------------------------------------------------------------------------------------------------------------
3.Umwandlung eines Zeichenarrays in eine Zahl:

char[] chars = { '3', '4', '0' };
int result = 0;
for (char c : chars) {
    result = result * 10 + Character.digit(c, 10);
    System.out.println(result);
}

Das Zeichenarray chars enthält die Zeichen '3', '4' und '0'.
Der for-Loop iteriert über jedes Zeichen im Array und konvertiert es in seine entsprechende Zahl in der Basis 10,
die dann zu result addiert wird, wobei result vorher mit 10 multipliziert wird,
um die richtige Dezimalstelle zu berücksichtigen.
Die Zwischenergebnisse werden nach jeder Iteration ausgegeben.
------------------------------------------------------------------------------------------------------------------------
Ausgabe der Zwischenergebnisse
Erste Iteration (c = '3'):

result = result * 10 + Character.digit('3', 10);
result = 0 * 10 + 3;
result = 3;
System.out.println(result); // Ausgabe: 3

Zweite Iteration (c = '4'):

result = result * 10 + Character.digit('4', 10);
result = 3 * 10 + 4;
result = 34;
System.out.println(result); // Ausgabe: 34

Dritte Iteration (c = '0'):

result = result * 10 + Character.digit('0', 10);
result = 34 * 10 + 0;
result = 340;
System.out.println(result); // Ausgabe: 340

Gesamtergebnis
Die endgültige Ausgabe des Codes ist:

3
34
340
------------------------------------------------------------------------------------------------------------------------
Fazit
Character.digit(char ch, int radix): Diese Methode konvertiert ein Zeichen in den entsprechenden numerischen Wert
gemäß der angegebenen Basis (Radix).
Character.forDigit(int digit, int radix): Diese Methode konvertiert eine Zahl in das entsprechende Zeichen gemäß
der angegebenen Basis (Radix).
Multiplikation und Addition: Die Schleife multipliziert result jedes Mal mit 10 und addiert die konvertierte Ziffer,
um die Zeichenfolge als ganze Zahl zu konstruieren.
Dieses Beispiel zeigt, wie man Zeichen in numerische Werte umwandeln und diese Werte dann verwenden kann,
um eine Zahl zu konstruieren, und es verdeutlicht die Funktionsweise der Character-Klasse in Java.
* */

package JAVA_Insel_Smart.Kapitel_5;

public class Zeichen_zur_Zahl_Konvertieren {
    public static void main(String[] args) {
        // Einzelne Konvertierungen

        // Konvertieren eines Zeichens in einen numerischen Wert:
        // Diese Zeile zeigt, wie das Zeichen '3' in den entsprechenden numerischen Wert
        // in der Basis 10 (dezimal) konvertiert wird.
        int num = Character.digit('3', 10); // 3 entspricht dezimal

        // Konvertieren einer Zahl in ein Zeichen:
        // Diese Zeile zeigt, wie die Zahl 12 in das entsprechende Zeichen in der Basis 16 (hexadezimal) konvertiert wird.
        // Das Ergebnis ist 'c', weil 12 in hexadezimal c entspricht.
        char ch = Character.forDigit(12, 16); // 'c' entspricht hex 12
//----------------------------------------------------------------------------------------------------------------------
        // Verarbeitung eines Zeichenarrays in einer Schleife
        char[] chars = { '3', '4', '0' }; // Array Objekt | datentyp Char, mit 3 Elementen
        int result = 0;

        for (char bezeichner : chars) {
            result = result * 10 + Character.digit(bezeichner, 10);
            System.out.println(result);
        }
        // Ausgabe: 3, 34, 340

    }
}
