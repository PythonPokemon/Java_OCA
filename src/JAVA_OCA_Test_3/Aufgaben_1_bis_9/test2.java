/*
4
Anfänglich bezieht sich arr1 auf ein int-Array-Objekt mit 3 Elementen.

Und arr2 bezieht sich auf ein int-Array-Objekt mit 2 Elementen [char-Typ ist kompatibel mit int-Typ]

Wenn die Anweisung 'arr1 = arr2;' ausgeführt wird, kopiert die Variable arr1 den Inhalt von arr2,
der die Adresse des Array-Objekts mit 2 Elementen ist. Daher verweist arr1 auch auf dasselbe Array-Objekt. arr1.length = 2 und arr2.length = 2.

Daher ist die Ausgabe: 4

 * */
package JAVA_OCA_Test_3.Aufgaben_1_bis_9;

public class test2 {
    public static void main(String[] args) {
        int [] arr1 = {5, 10, 15};
        int [] arr2 = {'A', 'B'};
        arr1 = arr2;
        System.out.println(arr1.length + arr2.length);
    }
}
