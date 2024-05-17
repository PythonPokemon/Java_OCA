/*
Derzeit lautet die Ausgabe bei der Ausführung der Testklasse: [-1000, 539, 0].
Und die folgenden Blöcke:
------------------------------------------------------------------------------------------------------------------------
1.
for(Zähler ctr : arr) {
    ctr.count = 100;
}
------------------------------------------------------------------------------------------------------------------------
2.
for (Zähler ctr : arr) {
    int x = ctr.getCount();
    x = 100;
}
------------------------------------------------------------------------------------------------------------------------
3.
for (Zähler ctr : arr) {
    ctr.getCount() = 100;
}
------------------------------------------------------------------------------------------------------------------------
4.
for(Zähler ctr : arr) {
    ctr.increase(100 - ctr.count);
}
------------------------------------------------------------------------------------------------------------------------
5.
for (Zähler ctr : arr) {
    ctr.increase(100 - ctr.getCount());
}
------------------------------------------------------------------------------------------------------------------------
6.
for(Zähler ctr : arr) {
    ctr.increase(-ctr.getCount() + 100);
}
------------------------------------------------------------------------------------------------------------------------
7.
for(Zähler ctr : arr) {
    ctr.increase(-ctr.count + 100);
}
------------------------------------------------------------------------------------------------------------------------
Wie viele Blöcke können *INSERT* ersetzen,
so dass die Ausgabe [100, 100, 100] lautet?
=
Nur fünf Blöcke
------------------------------------------------------------------------------------------------------------------------
-------------------------------------------------------ERKLÄRUNG--------------------------------------------------------
Gesamterklärung
Es gibt 2 Möglichkeiten, den Wert der count-Variablen der Counter-Klasse zu ändern:

1. Da der Zugriffsmodifikator der count-Variablen öffentlich ist,
kann er leicht von anderen Klassen aus mit der Instanz der Counter-Klasse aufgerufen werden, z. B. 'new Counter().count'
oder 'obj.count' (wobei obj eine Referenzvariable vom Typ Counter ist, die sich auf die Instanz der Counter-Variablen bezieht)
2. Durch Aufrufen der Methode increase(int) der Counter-Klasse.
Schauen wir uns nun alle Blöcke nacheinander an:
------------------------------------------------------------------------------------------------------------------------
1.
for(Counter ctr : arr) {
    ctr.count = 100;
}
✓ Es wird 100 zugewiesen, um Variablen von drei Instanzen der Counter-Klasse zu zählen.
------------------------------------------------------------------------------------------------------------------------
2.
for (Counter ctr : arr) {
    int x = ctr.getCount();
    x = 100;
}
✗ x ist eine lokale Variable und eine Kopie von ctr.count. Daher hat die Zuweisung von 100 zu
x keinen Einfluss auf den Wert von ctr.count.
------------------------------------------------------------------------------------------------------------------------
3.
for (Counter ctr : arr) {
    ctr.getCount() = 100;
}
✗ ctr.getCount() gibt den int-Wert und keine Variable zurück und kann daher nicht auf der linken Seite
des Zuweisungsoperators verwendet werden.
Dies führt zu einem Kompilierungsfehler.
------------------------------------------------------------------------------------------------------------------------
4.
for(Counter ctr : arr) {
    ctr.increase(100 - ctr.count);
}
✓ Sie müssen bemerkt haben, dass der Wert der Zählvariablen von 3 Array-Elementen lautet: -1000, 539, 0.
Wie ändern Sie alle 3 Werte mit demselben Ausdruck in 100? Es ist durch Addieren von 100 und Subtrahieren des aktuellen Wertes.
Zum Beispiel

-1000 + 100 -(-1000) = 100
oder
539 + 100 - 539 = 100
oder
0 + 100 - 0 = 100
Und dasselbe geschieht durch Ausführen der Anweisung 'ctr.increase(100 - ctr.count);'.
------------------------------------------------------------------------------------------------------------------------
5.
for (Counter ctr : arr) {
    ctr.increase(100 - ctr.getCount());
}
✓ Wie Block Nr. 4. Der einzige Unterschied besteht darin, dass ctr.getCount() anstelle von ctr.count verwendet wird.
------------------------------------------------------------------------------------------------------------------------
6.
for(Counter ctr : arr) {
    ctr.increase(-ctr.getCount() + 100);
}
✓ Wie Block Nr. 5.
------------------------------------------------------------------------------------------------------------------------
7.
for(Counter ctr : arr) {
    ctr.increase(-ctr.count + 100);
}
✓ Wie Block Nr. 4.
------------------------------------------------------------------------------------------------------------------------
Daher geben Ihnen 5 von 7 Blöcken die erwartete Leistung.
 * */
package JAVA_OCA_Test_3.Aufgaben_40_bis_49;
import java.util.Arrays;
import JAVA_OCA_Test_3.Aufgaben_40_bis_49.Counter;

public class test47 {
    public static void main(String[] args) {
        Counter[] arr = new Counter[] { new Counter(-1000), new Counter(539), new Counter(0) };

        for(Counter ctr : arr) {
            ctr.count = 100;
        }

        System.out.println(Arrays.toString(arr));
    }
}
