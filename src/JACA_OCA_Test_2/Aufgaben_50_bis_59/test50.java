/*
* Gesamterklärung
Aus Zeile 5 geht hervor, dass der Methodenname process sein sollte,
es sollte eine statische Methode sein, sie sollte 3 Parameter (int[], int, int) akzeptieren und ihr Rückgabetyp muss String sein.
* */
package JACA_OCA_Test_2.Aufgaben_50_bis_59;

public class test50 {
    public static void main(String [] args) {
        int [] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String str = process(arr, 3, 8); //Line 5
        System.out.println(str);
    }
    /*INSERT*/
    private static String process(int [] arr, int start, int end) {
        return null;
    }
}
//----------------------------------------------------------------------------------------------------------------------
// fehlerhafte varianten, finde den fehler im code:-)
//----------------------------------------------------------------------------------------------------------------------
//private static int[] process(int [] arr, int start, int end) {
//    return null;
//}

//private static String[] process(int [] arr, int start, int end) {
//    return null;
//}

//private static int process(int [] arr, int start, int end) {
//    return null;
//}