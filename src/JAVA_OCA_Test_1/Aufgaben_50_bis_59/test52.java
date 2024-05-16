/*
* Variante 1:
* Die Variante führt zu einem Compilerfehler, da versucht wird, ein int-Array in ein double-Array zu konvertieren, was nicht möglich ist.
*
* Variante 2:
* In dieser Variante wird ein Array arr2 mit 2 Elementen vom Typ int erstellt.
* Wenn ein Array direkt mit System.out.println() ausgegeben wird, wird eine Hashcode-Repräsentation des Arrays ausgegeben, nicht die Elemente selbst.
*
* Variante 3:
* Ein Array arr3 mit 3 Elementen vom Typ double wird erstellt.
* Da arr3 nicht explizit initialisiert wird, enthalten die Elemente standardmäßig den Wert 0.0. Wenn das erste Element von arr3 ausgegeben wird, wird 0.0 angezeigt.
*
* ----------------------------------------------ZUSATZ-WISSEN-----------------------------------------------------------
* Die Zusammensetzung des Hashcodes [I@6acbcfc0 lässt sich folgendermaßen erklären:
*
* [I:
* Dieser Teil gibt den Datentyp des Arrays an. In diesem Fall handelt es sich um ein Array von Ganzzahlen (int).
*
* @:
* Dieses Zeichen trennt den Datentyp des Arrays vom Hashcode.
*
* 6acbcfc0:
* Dies ist der Hashcode selbst.
* Es handelt sich um eine hexadezimale Darstellung der Speicheradresse, an der das Array im Speicher liegt.
* Jedes Objekt in Java hat eine eindeutige Speicheradresse im Speicher, und der Hashcode ist eine Darstellung dieser Adresse.
* */

package JAVA_OCA_Test_1.Aufgaben_50_bis_59;

public class test52 {
    public static void main(String[] args) {

//        // Variante 1 | Compiler fehler
//        double [] arr = new int[1];   /<-- double kann nicht int sein
//        System.out.println(arr[0]);
//----------------------------------------------------------------------------------------------------------------------
        // Variante 2 | Ganzzahl ausgabe
        int[] arr2 = new int[2];
        System.out.println(arr2);
//----------------------------------------------------------------------------------------------------------------------
        // Variante 3 | Gleitkommazahl ausgabe
        double[] arr3 = new double[3];
        System.out.println(arr3[0]);

    }
}
