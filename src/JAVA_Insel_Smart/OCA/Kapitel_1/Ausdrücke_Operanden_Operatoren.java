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
Logische Operatoren: Nicht, Und, Oder, XOR

Logische Operatoren werden verwendet, um Wahrheitswerte zu kombinieren: ! (Nicht), && (Und), || (Oder), ^ (XOR):
boolean nicht = !(5 == 5); // false
boolean und = (5 == 5) && (3 < 5); // true
boolean oder = (5 == 5) || (3 > 5); // true
boolean xor = (5 == 5) ^ (3 > 5); // true
------------------------------------------------------------------------------------------------------------------------
Kurzschluss-Operatoren

Die logischen Operatoren && und || sind Kurzschluss-Operatoren, was bedeutet,
dass der zweite Operand nicht ausgewertet wird, wenn das Ergebnis bereits durch den ersten Operand feststeht:

boolean kurzschluss = (5 > 3) || (5 / 0 == 0); // true, keine Division durch 0
------------------------------------------------------------------------------------------------------------------------
Der Rang der Operatoren in der Auswertungsreihenfolge

Java hat eine festgelegte Rangordnung der Operatoren, die bestimmt,
in welcher Reihenfolge die Ausdrücke ausgewertet werden.
Zum Beispiel haben Multiplikation und Division einen höheren Rang als Addition und Subtraktion:

int ergebnis = 5 + 3 * 2; // ergebnis ist 11, da Multiplikation vor Addition
------------------------------------------------------------------------------------------------------------------------
Die Typumwandlung (das Casting)

In Java können Sie den Typ eines Ausdrucks explizit ändern (casten).
Dies ist besonders nützlich, wenn Sie mit verschiedenen numerischen Typen arbeiten:

int zahl = (int) 3.14; // zahl ist 3
------------------------------------------------------------------------------------------------------------------------
Überladenes Plus für Strings

Der +-Operator ist in Java überladen, um Zeichenketten zu verketten:
String text = "Hallo" + " Welt"; // "Hallo Welt"
------------------------------------------------------------------------------------------------------------------------
Operator vermisst

Falls ein bestimmter Operator in Java fehlt, kann dies durch eine Methode ersetzt werden.
Beispielsweise kann die Potenzfunktion durch die Methode Math.pow() realisiert werden:

double ergebnis = Math.pow(2, 3); // ergebnis ist 8.0
------------------------------------------------------------------------------------------------------------------------
* */
package JAVA_Insel_Smart.OCA.Kapitel_1;

public class Ausdrücke_Operanden_Operatoren {
    public static void main(String[] args) {

// Zuweisungsoperator: '='
        int zahl0 = 10; // // Deklaration und Initialisierung einer lokalen Variablen
//        System.out.println(zahl0);  // methode zum Ausgeben der lokalen variable, aus der Konsole
//----------------------------------------------------------------------------------------------------------------------
//  Arithmetische Operatoren:  + (Addition), - (Subtraktion), * (Multiplikation), / (Division) und % (Modulus):
        int summe = 5 + 3;      // 8
        int differenz = 5 - 3;  // 2
        int produkt = 5 * 3;    // 15
        int quotient = 5 / 3;   // 1
        int rest = 5 % 4;       // 1 | modules gibt den rest an
//        System.out.println(summe);
//        System.out.println(differenz);
//        System.out.println(produkt);
//        System.out.println(quotient);
//        System.out.println(rest);
//----------------------------------------------------------------------------------------------------------------------
// Unäres Minus und Plus  - und +
        int positiv = +5;   // 5
        int negativ = -5;   // -5
//        System.out.println(positiv);
//        System.out.println(negativ);
//----------------------------------------------------------------------------------------------------------------------
// Präfix- oder Postfix-Inkrement und -Dekrement
        int x = 5;
        int y = ++x;    // y ist 6, x ist 6 (Präfix) |
        int z = x--;    // z ist 6, x ist 5 (Postfix)
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//----------------------------------------------------------------------------------------------------------------------
// Zuweisung mit Operation (Verbundoperator): : +=, -=, *=, /=, %=:
        // der bezeichner, bsp: 'zahl1' auf dem die werte referenziert sind, speichert immer den zuletzt
        // initialisierten wert und benutzt diesen zur weiteren berechnung
        int zahl1 = 5;
        zahl1 += 3; // zahl ist jetzt 8
        zahl1 *= 2; // zahl ist jetzt 16
//        System.out.println(zahl1);//16

        // wenn der neue variable, bsp: 'zahl2' eine zuweisung, der alten variable 'zahl1 mit dem element (16)' erhält,
        // wird die neue variable den zuletzt gespeicherten wert der anderen variable zugewiesen.
        int zahl2;
        zahl2 = zahl1;
//        System.out.println(zahl2); // also erhält 'zahl2' nun den Datentyp int mit dem wert 16

        int zahl3 = 4; //               4       16      16
        int ergebnisVerbundoperator = zahl3 + zahl2 + zahl1;
//        System.out.println(ergebnisVerbundoperator);// 36
//----------------------------------------------------------------------------------------------------------------------
// Die relationalen Operatoren und die Gleichheitsoperatoren:
//  == (gleich), != (ungleich), < (kleiner), > (größer), <= (kleiner oder gleich), >= (größer oder gleich):
        boolean gleich = (5 == 5); // 5 ist 5 | true
        boolean ungleich = (5 != 3); // 5 ist ungleich 3 | true
        boolean kleiner = (3 < 5); // 3 ist kleiner als 5 | true
        boolean größer = (5 > 3); // 5 ist größer als 3 |true
        boolean kleinerGleich = (5 <= 5); // 5 ist kleiner oder gleich 5 true
        boolean größerGleich = (3 >= 3); // 3 ist größer oder gleich 3 | true
//        System.out.println(gleich);
//        System.out.println(ungleich);
//        System.out.println(kleiner);
//        System.out.println(größer);
//        System.out.println(kleinerGleich);
//        System.out.println(größerGleich);
//----------------------------------------------------------------------------------------------------------------------
// Logische Operatoren: Nicht, Und, Oder, XOR
        boolean nicht = !(5 == 5); // negierte aussage, bedeutet, wenn 5 der 5 entspricht ist es falsch/false
        boolean und = (5 == 5) && (3 < 5); // beide operationen müssen true sein: 5 ist 5 true & 3 ist kleiner 5 true
        boolean oder = (5 == 5) || (3 > 5); // eine von beiden muss true sein: 5 ist 5 true | 3 ist größer als 5 false
        boolean xor = (5 == 5) ^ (3 > 5); // true, wenn eine von beiden false ist: 5 ist 5 true | 3 größer 5 false
//        System.out.println(nicht);
//        System.out.println(und);
//        System.out.println(oder);
//        System.out.println(xor);
//----------------------------------------------------------------------------------------------------------------------
// Kurzschluss-Operatoren  && und ||
        boolean kurzschluss1 = (5 > 3) || (5 / 0 == 0); // true, keine Division durch 0
        boolean kurzschluss2 = (5 <= 5 && 1 > 3 || 5 == 5); // true | UND Operation false || ODER true 5 entspricht 5
        boolean testKO1 = ((1 + 3) == 4 && 5 == 5); // true
        boolean testKO2 = (((100 - 65) == 35) || ((1 + 1) == 2));// true

        boolean ergebnisOP;
        ergebnisOP = testKO1 == testKO2;

//        System.out.println(kurzschluss1);
//        System.out.println(kurzschluss2);
//        System.out.println(testKO1);
//        System.out.println(testKO2);
//        System.out.println(ergebnisOP);
//----------------------------------------------------------------------------------------------------------------------
// Der Rang der Operatoren in der Auswertungsreihenfolge
        int ergebnis_1 = 5 + 3 * 2; // ergebnis ist 11, da Multiplikation vor Addition
        float ergebnis_2 = 2 + 4 / 2;
        double ergebnis_3 = 2.1 + 2.2;

        // WrapperKlasse Integer
        Integer berechnungLang = ((1 + 2 + 3 + 4) * 2 * (10 *2) );// 10 * 2 = 20 * 40 = 400
//        System.out.println(ergebnis_1);
//        System.out.println(ergebnis_2);
//        System.out.println(ergebnis_3);
//        System.out.println(berechnungLang);
//----------------------------------------------------------------------------------------------------------------------
// Die Typumwandlung (das Casting)
// Syntax: Datentyp | Bezeichner | zuweisungsoperator = | Gewünschter Datentyp | Variablenwert
        double gleitkommaZahl = 3.14;
        int zahlCast1 = (int) gleitkommaZahl;// wandelt die gleitkommazahl in eine ganzzahl um | man kann bezeichner nehmen
        float zahlCast2 = (float) 2;    // wandelt die Ganzzahl in eine Gleitkommazahl um | oder man nimmt, eine zahl
        System.out.println(zahlCast1);
        System.out.println(zahlCast2);

        // Deklaration von datentypen und initialisierung
        int ganzZahl1 = 1;
        long langeZahl = 9_999_999;
        float gleitKomma1 = 2.123f;

        // Umwandlung von Datentypen
        int komma_zu_ganzZahl = (int) gleitKomma1;
        float ganzzahlZuKomma = (float) ganzZahl1;
        double großeKommaZahl = (double) langeZahl;

        // ausgabe nach der Umwandlung
//        System.out.println(komma_zu_ganzZahl);
//        System.out.println(ganzzahlZuKomma);
//        System.out.println(großeKommaZahl);
//----------------------------------------------------------------------------------------------------------------------
// Überladenes Plus für Strings, um Zeichenketten zu verketten:
        String verkettungsFrage = "Hallo " + "Welt " + "wie geht " + "es dir heute?";
        String gesamtAntwort = "Mir geht es gut, danke der nachfrage :-)";
//        System.out.println(verkettungsFrage);
//        System.out.println(gesamtAntwort);
//----------------------------------------------------------------------------------------------------------------------
// Operator vermisst | kann durch die  Math.pow() methode ergänzt werden.
// Verwendung der Math.pow() Methode zur Berechnung der Potenz
        double basis = 2.0;
        double exponent = 3.0;
        double ergebnis = Math.pow(basis, exponent);    // 2.0 * 2.0 * 2.0 = 8.0
//        System.out.println(basis + " hoch " + exponent + " ist " + ergebnis);
    }
}
