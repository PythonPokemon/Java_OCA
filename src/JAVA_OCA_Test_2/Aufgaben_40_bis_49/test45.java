/*
 * ArrayIndexOutOfBoundsException is thrown at runtime
 *
 * Gesamterklärung
Innerhalb der erweiterten for-Schleife, System.out.println(arr[i]); wird anstelle von System.out.println(i) verwendet;

Wenn die Schleife zum 1. Mal ausgeführt wird, speichert i das erste Array-Element, das 3 ist,
* aber die System.out.println-Anweisung gibt arr[3] aus, und dies führt dazu,
* dass die Java-Laufzeit die Instanz von ArrayIndexOutOfBoundsException auslöst.
 * */
package JAVA_OCA_Test_2.Aufgaben_40_bis_49;

public class test45 {
    public static void main(String[] args) {
        int [] arr = {3, 2, 1};
        for(int i : arr) {
            System.out.println(arr[i]);
        }
    }
}
