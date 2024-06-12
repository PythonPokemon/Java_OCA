/*  Code beschreibung
*Allgemeines
* In Java muss die Größe eines Java_Anfänger_zum_Profi.Arrays entweder bei der Deklaration oder bei der Initialisierung angegeben werden. Es ist wichtig, Java_Anfänger_zum_Profi.Arrays vor dem Zugriff zu initialisieren, um NullPointerExceptions zu vermeiden.
*
* Details zu den einzelnen Zeilen:
* Deklaration und Initialisierung von Java_Anfänger_zum_Profi.Arrays:
*
* short arr[] = new short[2];:
* Diese Zeile deklariert und initialisiert ein short-Array mit 2 Elementen. Die Größe des Java_Anfänger_zum_Profi.Arrays wird korrekt angegeben. Allerdings würde ein Versuch, auf ein Element außerhalb des Bereichs (arr[2] oder höher) zuzugreifen, eine ArrayIndexOutOfBoundsException verursachen.
*
* byte[] arr = new byte[10];:
* Dies ist korrekt. Es deklariert ein byte-Array mit 10 Elementen.
*
* short[] arr; arr = new short[3];:
* Auch dies ist korrekt. Das short-Array wird in zwei Schritten deklariert und initialisiert.
*
* short[2] arr;:
* Dies führt zu einem Compiler-Fehler. In Java kann die Größe eines Java_Anfänger_zum_Profi.Arrays nicht bei der Deklaration angegeben werden. Die richtige Syntax wäre short[] arr = new short[2];.

* short[3] arr;:
* Ebenso wie oben, führt dies zu einem Compiler-Fehler aus demselben Grund.

* int[] arr = new int[]{100, 100};:
* Diese Zeile deklariert und initialisiert ein int-Array mit zwei Elementen (100 und 100).
* Wenn man jedoch versucht, auf ein Element außerhalb des Bereichs zuzugreifen, würde dies eine ArrayIndexOutOfBoundsException verursachen.

* int[] arr = new int[]{0, 0, 0, 0};:
* Dies ist korrekt. Es deklariert und initialisiert ein int-Array mit vier Elementen, die alle auf 0 gesetzt sind.

* short[] arr = {};:
* Diese Zeile deklariert ein leeres short-Array. Der Versuch, auf Elemente dieses Java_Anfänger_zum_Profi.Arrays zuzugreifen,
* führt zu einer ArrayIndexOutOfBoundsException, da keine Elemente vorhanden sind.
*
* short[] arr = new short[2]{5, 10};:
* Dies führt zu einem Compiler-Fehler, da die Größenangabe und die Initialisierung nicht kombiniert werden können.
* Die richtige Syntax wäre short[] arr = {5, 10}; oder short[] arr = new short[]{5, 10};.
 * */

package JAVA_OCA_Simulation.JAVA_OCA_Test_1.Aufgaben_20_bis_29;

public class test25 {
    public static void main(String[] args) {
        /* zum Testen auskommentieren */

//       short arr[] = new short[2];           // .ArrayIndexOutOfBoundsException
//       byte []arr = new byte[10];            // <--- richtig
//       short[] arr; arr = new short[3];       // <--- richtig
//       short[2] arr;                         // compiler fehler | Die Größe des Java_Anfänger_zum_Profi.Arrays kann nicht bei der Deklaration festgelegt werden. Es muss bei der Initialisierung geschehen.
//       short[3] arr;                         // compiler fehler | Die Größe des Java_Anfänger_zum_Profi.Arrays kann nicht bei der Deklaration festgelegt werden. Es muss bei der Initialisierung geschehen.
//       int[] arr = new int[]{100, 100};      // .ArrayIndexOutOfBoundsException
       int[] arr = new int[]{0, 0, 0, 0};    // <--- richtig
//       short[] arr = {};                     // .ArrayIndexOutOfBoundsException | versuch auf ein leeres Array zuzugreifen. Das Array enthält keine Elemente, also gibt es nichts, auf das zugreifbar ist.
//       short[]arr = new short[2]{5, 10};     // compiler fehler

        arr[1] = 5;
        arr[2] = 10;
        System.out.println("[" + arr[1] + ", " + arr[2] + "]");
    }
}
/*-------------------------------------------ACHTUNG WICHTIG------------------------------------------------------------
*
*----------------------Array mit geschweiften Klammern: int[] arr = new int[]{0, 0, 0, 0};------------------------------
* Initialisiert das Array sofort mit den angegebenen Werten.
* Syntax erfordert new und geschweifte Klammern {} mit den Werten.
*
*--------------------------Array ohne geschweifte Klammern: byte[] arr = new byte[10];----------------------------------
* Initialisiert das Array mit einer festen Größe.
* Syntax erfordert nur new und die Größe des Java_Anfänger_zum_Profi.Arrays in eckigen Klammern [].
*
* Beide Varianten haben ihre spezifischen Anwendungsfälle, und die Wahl hängt davon ab,
* ob die Werte zum Zeitpunkt der Deklaration bekannt sind oder nicht.
* */