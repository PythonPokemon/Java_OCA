/*
 * Gesamterklärung
int kann in double konvertiert werden, aber der Integer-Typ kann nicht in den Double-Typ konvertiert werden,
* da Integer und Double Geschwister sind (beide reichen von der Number-Klasse aus) und können daher nicht ineinander umgewandelt werden.



add(10.0, new Integer(10)); => 1. Parameter ist mit double primitive type gekennzeichnet und der
* 2. Parameter wird in int konvertiert und ist ebenfalls mit double primitive type gekennzeichnet.
* Also, add(double, double); -Methode aufgerufen wird.
* double version: 20.0
 * */

package JACA_OCA_Test_2.Aufgaben_1_bis_9;

public class test4 {
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }

    public static void main(String[] args) {
        add(10.0, new Integer(10));
    }
}
