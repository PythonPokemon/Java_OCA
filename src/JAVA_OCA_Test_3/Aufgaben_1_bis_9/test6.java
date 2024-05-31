/*
a = 18
var = 363
------------------------------------------------------------------------------------------------------------------------
Reihenfolge der Operationen:
------------------------------------------------------------------------------------------------------------------------
1.Initialer Wert von a:

int a = 20;
------------------------------------------------------------------------------------------------------------------------
2.Erste Operation - Prä-Dekrement (--a):

--a;
Wert von a wird um 1 verringert, bevor er verwendet wird.
a wird 19.
Ausdruck wird 19.
------------------------------------------------------------------------------------------------------------------------
3.Zweite Operation - Post-Inkrement (a++):

a++;
Wert von a wird verwendet und danach um 1 erhöht.
Ausdruck verwendet 19.
a wird 20 (nach der Operation).
------------------------------------------------------------------------------------------------------------------------
4.Dritte Operation - Post-Dekrement (a--):

a--;
Wert von a wird verwendet und danach um 1 verringert.
Ausdruck verwendet 20.
a wird 19 (nach der Operation).
------------------------------------------------------------------------------------------------------------------------
5.Vierte Operation - Prä-Dekrement (--a):

--a;
Wert von a wird um 1 verringert, bevor er verwendet wird.
a wird 18.
Ausdruck wird 18.
------------------------------------------------------------------------------------------------------------------------
Berechnung von var:
Setzen wir die Werte aus den einzelnen Schritten in den Ausdruck ein:

int var = --a * a++ + a-- - --a;
           19  * 19  + 20  - 18;
------------------------------------------------------------------------------------------------------------------------
Schritt für Schritt Berechnung:
------------------------------------------------------------------------------------------------------------------------
Multiplikation:
19 * 19 = 361

Addition:
361 + 20 = 381

Subtraktion:
381 - 18 = 363
------------------------------------------------------------------------------------------------------------------------
Endgültige Werte:
------------------------------------------------------------------------------------------------------------------------
Wert von a:
a = 18;
Nach all den Operationen bleibt a bei 18.

Wert von var:
var = 363;
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung:
Der Wert von a nach allen Operationen ist 18.
Der Wert von var nach der Berechnung ist 363.
 * */
package JAVA_OCA_Test_3.Aufgaben_1_bis_9;

public class test6 {
    public static void main(String[] args) {
        int a = 20;
        int var = --a * a++ + a-- - --a;
        System.out.println("a = " + a);
        System.out.println("var = " + var);
    }
}
