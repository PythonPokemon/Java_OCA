/*
* In Java haben Operatoren Prioritäten, ähnlich wie in der Mathematik, wo beispielsweise Multiplikation vor Addition ausgeführt wird.
* Im speziellen Fall deines Codes hat der Operator != eine höhere Priorität als der Operator +.
* Das bedeutet, dass der Compiler zuerst versucht, den Ausdruck 10 != 5 zu evaluieren und dann das Ergebnis mit dem String "output is:" + 10 zu kombinieren.
*
* Da der Operator != für eine Ungleichheitsprüfung verwendet wird, ergibt 10 != 5 true, was als Ergebnis des Vergleichs zurückgegeben wird.
* Danach versucht der Compiler, "output is:" + true zu kombinieren.
* Dies führt zu einem Fehler, da der + Operator für die Verkettung von Strings und anderen Werten vorgesehen ist, nicht aber für boolesche Werte wie true.
* */

package JACA_OCA_Test_1.Aufgaben_20_bis_29;

// Compiler fehler | zum Testen auskommentieren
// Compiler fehler, weil der Operator != eine höhere Priorität als der String-Konkatenationsoperator + hat.
//public class test23 {
//    public static void main(String[] args) {
//        System.out.println("output is:" + 10 != 5);   // <-- hier ist der fehler ("output is:" + 10 != 5);
//    }
//}

//----------------------------------------------------------------------------------------------------------------------

/*
* Um dieses Problem zu lösen und sicherzustellen, dass "output is:" mit dem Ergebnis von 10 != 5 verknüpft wird, musst du den Teil 10 != 5 in Klammern setzen.
* Dadurch wird sichergestellt, dass dieser Ausdruck zuerst ausgewertet wird, bevor die Verknüpfung mit dem String erfolgt.
* So sieht der korrigierte Code aus:
* */

public class test22 {
    public static void main(String[] args) {
        System.out.println("output is:" + (10 != 5));   // <-- korrektur: ("output is:" + (10 != 5));
    }
}

/*
* Durch die Klammern wird der Ausdruck 10 != 5 zuerst ausgewertet, und das Ergebnis (true oder false) wird dann mit dem String "output is:" verknüpft.
* So erhältst du die erwartete Ausgabe.
* */