/*
Zuweisungsoperator =

Der einfachste und am häufigsten verwendete Operator ist der Zuweisungsoperator =,
der einen Wert einer Variablen zuweist:
int zahl = 10;
------------------------------------------------------------------------------------------------------------------------
Arithmetische Operatoren + - * '/'

Java unterstützt die grundlegenden arithmetischen Operatoren:
 + (Addition), - (Subtraktion), * (Multiplikation), / (Division) und % (Modulus):
int summe = 5 + 3; // 8
int differenz = 5 - 3; // 2
int produkt = 5 * 3; // 15
int quotient = 5 / 3; // 1
int rest = 5 % 3; // 2
------------------------------------------------------------------------------------------------------------------------
Unäres Minus und Plus

Die unären Operatoren - und + können verwendet werden, um das Vorzeichen eines Wertes zu ändern oder beizubehalten:
int positiv = +5; // 5
int negativ = -5; // -5

* */
package JAVA_Insel.Kapitel_2;

public class Ausdrücke_Operanden_Operatoren {
    public static void main(String[] args) {

// Zuweisungsoperator: '='
        int zahl = 10;
//----------------------------------------------------------------------------------------------------------------------
//  Arithmetische Operatoren:  + (Addition), - (Subtraktion), * (Multiplikation), / (Division) und % (Modulus):
        int summe = 5 + 3;      // 8
        int differenz = 5 - 3;  // 2
        int produkt = 5 * 3;    // 15
        int quotient = 5 / 3;   // 1
        int rest = 5 % 3;       // 2
//----------------------------------------------------------------------------------------------------------------------
// Unäres Minus und Plus  - und +
        int positiv = +5;   // 5
        int negativ = -5;   // -5
    }
}
