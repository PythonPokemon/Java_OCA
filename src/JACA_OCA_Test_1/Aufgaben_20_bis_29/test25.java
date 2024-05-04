/*  Code beschreibung
*
* Es ist wichtig zu verstehen, dass in Java die Größe eines Arrays bei der Deklaration oder bei der Initialisierung angegeben werden muss, aber nicht beides.
* Außerdem müssen Arrays vor dem Zugriff initialisiert werden, sonst führt dies zu einer NullPointerException.
*
*
 * */

package JACA_OCA_Test_1.Aufgaben_20_bis_29;

public class test25 {
    public static void main(String[] args) {
        /* zum Testen auskommentieren */

//       short arr[] = new short[2];           // .ArrayIndexOutOfBoundsException
//       byte []arr = new byte[10];            // <--- richtig
//       short[] arr;arr = new short[3];       // <--- richtig
//       short[2] arr;                         // compiler fehler | Die Größe des Arrays kann nicht bei der Deklaration festgelegt werden. Es muss bei der Initialisierung geschehen.
//       short[3] arr;                         // compiler fehler | Die Größe des Arrays kann nicht bei der Deklaration festgelegt werden. Es muss bei der Initialisierung geschehen.
//       int[] arr = new int[]{100, 100};      // .ArrayIndexOutOfBoundsException
       int[] arr = new int[]{0, 0, 0, 0};    // <--- richtig
//       short[] arr = {};                     // .ArrayIndexOutOfBoundsException | versuch auf ein leeres Array zuzugreifen. Das Array enthält keine Elemente, also gibt es nichts, auf das zugreifbar ist.
//       short[]arr = new short[2]{5, 10};     // compiler fehler

        arr[1] = 5;
        arr[2] = 10;
        System.out.println("[" + arr[1] + ", " + arr[2] + "]");
    }
}
