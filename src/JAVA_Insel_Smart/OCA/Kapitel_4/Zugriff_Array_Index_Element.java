/*
Zugriff auf die Elemente über den Index
Der Zugriff auf die Elemente eines Arrays erfolgt über den Index, der nullbasiert ist.
Das bedeutet, das erste Element hat den Index 0, das zweite den Index 1 usw.
* */
package JAVA_Insel_Smart.OCA.Kapitel_4;

public class Zugriff_Array_Index_Element {
    public static void main(String[] args) {
        int[] primes = { 2, 3, 5, 7, 11, 13 };
        System.out.println(primes[0]); // Ausgabe: 2

        primes[0] = 17; // index 0 also element 2 wird der wert 17 zugewiesen
        System.out.println(primes[0]); // Ausgabe: 17

    }
}
