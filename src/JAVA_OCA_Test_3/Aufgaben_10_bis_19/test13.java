/*
Import der Predicate-Schnittstelle:

import java.util.function.Predicate;
Diese Zeile importiert die Predicate-Schnittstelle aus dem Paket java.util.function.
Ein Predicate ist eine funktionale Schnittstelle, die eine Methode test hat,
die einen Wert akzeptiert und einen boolean zurückgibt.
------------------------------------------------------------------------------------------------------------------------
Hauptmethode:

public static void main(String[] args) {
    printNumbers(i -> i % 2 != 0);
}

In der main-Methode wird die Methode printNumbers mit einem Lambda-Ausdruck als Argument aufgerufen.
Der Lambda-Ausdruck i -> i % 2 != 0 ist eine Implementierung des Predicate-Interfaces,
die prüft, ob eine Zahl ungerade ist. i % 2 != 0 gibt true zurück, wenn i ungerade ist, und false, wenn i gerade ist.
------------------------------------------------------------------------------------------------------------------------
Die printNumbers-Methode:

private static void printNumbers(Predicate<Integer> predicate) {
    for(int i = 1; i <= 10; i++) {
        if(predicate.test(i)) {
            System.out.print(i);
        }
    }
}
Die Methode printNumbers nimmt ein Predicate<Integer> als Parameter.
Sie durchläuft eine Schleife von 1 bis 10 und testet jede Zahl i mit dem gegebenen Prädikat.
Wenn predicate.test(i) true ergibt, wird die Zahl i ausgegeben.
------------------------------------------------------------------------------------------------------------------------
Funktionsweise und Ausgabe
Lambda-Ausdruck:

i -> i % 2 != 0
Dieser Ausdruck prüft, ob i ungerade ist (i % 2 != 0).

Schleife in printNumbers:

for(int i = 1; i <= 10; i++) {
    if(predicate.test(i)) {
        System.out.print(i);
    }
}

Die Schleife läuft von 1 bis 10. Für jede Zahl i wird predicate.test(i) aufgerufen:

Wenn i ungerade ist (i % 2 != 0), gibt predicate.test(i) true zurück, und die Zahl i wird ausgegeben.
Wenn i gerade ist, gibt predicate.test(i) false zurück, und die Zahl wird nicht ausgegeben.
------------------------------------------------------------------------------------------------------------------------
Ergebnis
Die ungeraden Zahlen zwischen 1 und 10 sind 1, 3, 5, 7 und 9.
Daher gibt der Code diese Zahlen ohne Leerzeichen oder Kommas dazwischen aus:


13579
Fazit
Der Code verwendet ein Prädikat, um ungerade Zahlen zu filtern und gibt diese innerhalb des Bereichs von 1 bis 10 aus.
Dies führt zur Ausgabe 13579, da der Lambda-Ausdruck sicherstellt, dass nur ungerade Zahlen gedruckt werden.
* */
package JAVA_OCA_Test_3.Aufgaben_10_bis_19;
import java.util.function.Predicate;

public class test13 {
    public static void main(String[] args) {
        printNumbers(i -> i % 2 != 0);
    }

    private static void printNumbers(Predicate<Integer> predicate) {
        for(int i = 1; i <= 10; i++) {
            if(predicate.test(i)) {
                System.out.print(i);
            }
        }
    }
}
