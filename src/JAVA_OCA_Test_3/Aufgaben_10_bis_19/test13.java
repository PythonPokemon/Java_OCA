/*
13579

Gesamterklärung
Im booleschen Ausdruck (predicate.test(i)): i ist vom primitiven int-Typ, aber die Auto-Boxing-Funktion konvertiert ihn in den Integer-Wrapper-Typ.

Die Methode test(Integer) von Predicate gibt true zurück, wenn die übergebene Zahl eine ungerade Zahl ist,
so dass die angegebene Schleife nur ungerade Zahlen ausgibt. for-Schleifen funktionieren für die Zahlen von 1 bis 10.
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
