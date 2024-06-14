/*
Zuweisungsoperator =

Der einfachste und am häufigsten verwendete Operator ist der Zuweisungsoperator =,
der einen Wert einer Variablen zuweist:
int zahl0 = 10;
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
------------------------------------------------------------------------------------------------------------------------
Präfix- oder Postfix-Inkrement und -Dekrement

Die Inkrement- und Dekrement-Operatoren erhöhen oder verringern den Wert einer Variablen um eins.
Sie können in Präfix- (++var, --var) oder Postfix- (var++, var--) Form verwendet werden:
int x = 5;
int y = ++x; // y ist 6, x ist 6 (Präfix)
int z = x--; // z ist 6, x ist 5 (Postfix)
------------------------------------------------------------------------------------------------------------------------
Zuweisung mit Operation (Verbundoperator)

Verbundoperatoren kombinieren eine arithmetische Operation mit einer Zuweisung: +=, -=, *=, /=, %=:
int zahl1 = 5;
zahl1 += 3; // zahl ist jetzt 8
zahl1 *= 2; // zahl ist jetzt 16
------------------------------------------------------------------------------------------------------------------------
Die relationalen Operatoren und die Gleichheitsoperatoren

Relationale Operatoren vergleichen zwei Werte:
== (gleich), != (ungleich), < (kleiner), > (größer), <= (kleiner oder gleich), >= (größer oder gleich):

boolean gleich = (5 == 5); // true
boolean ungleich = (5 != 3); // true
boolean kleiner = (3 < 5); // true
boolean größer = (5 > 3); // true
boolean kleinerGleich = (5 <= 5); // true
boolean größerGleich = (5 >= 3); // true
------------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------------------------------
* */
package JAVA_Insel_Smart.Kapitel_2;

public class Ausdrücke_Operanden_Operatoren {
    public static void main(String[] args) {

// Zuweisungsoperator: '='
        int zahl0 = 10; // // Deklaration und Initialisierung einer lokalen Variablen
        System.out.println(zahl0);  // methode zum Ausgeben der lokalen variable, aus der Konsole
//----------------------------------------------------------------------------------------------------------------------
//  Arithmetische Operatoren:  + (Addition), - (Subtraktion), * (Multiplikation), / (Division) und % (Modulus):
        int summe = 5 + 3;      // 8
        int differenz = 5 - 3;  // 2
        int produkt = 5 * 3;    // 15
        int quotient = 5 / 3;   // 1
        int rest = 5 % 3;       // 2
        System.out.println(summe);
        System.out.println(differenz);
        System.out.println(produkt);
        System.out.println(quotient);
        System.out.println(rest);
//----------------------------------------------------------------------------------------------------------------------
// Unäres Minus und Plus  - und +
        int positiv = +5;   // 5
        int negativ = -5;   // -5
//----------------------------------------------------------------------------------------------------------------------
// Präfix- oder Postfix-Inkrement und -Dekrement
        int x = 5;
        int y = ++x;    // y ist 6, x ist 6 (Präfix)
        int z = x--;    // z ist 6, x ist 5 (Postfix)
//----------------------------------------------------------------------------------------------------------------------
// Zuweisung mit Operation (Verbundoperator): : +=, -=, *=, /=, %=:
        int zahl1 = 5;
        zahl1 += 3; // zahl ist jetzt 8
        zahl1 *= 2; // zahl ist jetzt 16
        System.out.println(zahl1);
//----------------------------------------------------------------------------------------------------------------------
// Die relationalen Operatoren und die Gleichheitsoperatoren:
//  == (gleich), != (ungleich), < (kleiner), > (größer), <= (kleiner oder gleich), >= (größer oder gleich):
         boolean gleich = (5 == 5);

//----------------------------------------------------------------------------------------------------------------------


    }
}
