/*
 * ArrayIndexOutOfBoundsException is thrown at runtime
 *
 * Gesamterklärung
Innerhalb der erweiterten for-Schleife, System.out.println(arr[i]); wird anstelle von System.out.println(i) verwendet;

Wenn die Schleife zum 1. Mal ausgeführt wird, speichert i das erste Array-Element, das 3 ist,
* aber die System.out.println-Anweisung gibt arr[3] aus, und dies führt dazu,
* dass die Java-Laufzeit die Instanz von ArrayIndexOutOfBoundsException auslöst.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_40_bis_49;

public class test45 {
    public static void main(String[] args) {
        int [] arr = {3, 2, 1}; // 3 ist Index [0], 2 ist Index [1], 1ist Index [3]
        for(int i : arr) {
            // compiler error, weil versucht auf das [i] im array Index zu zugreifen, es gibt aber nur diese elemente 3, 2, 1 Index 0, 1, 2
//            System.out.println(arr[i]);
//            System.out.println(arr);           // gibt die speicheradresse an: [I@6acbcfc0
//            System.out.println(i);             // gibt die Elemente des Datentyps int aus 3, 2, 1 untereinander
            System.out.println(arr[0]);        // Expliziter ausdruck der elemente im array der sich im Index 0, 1, 2 befindet! | durchläuft das array nach der anzahl der indexe!

        }
    }
}
//----------------------------------------------------------------------------------------------------------------------

