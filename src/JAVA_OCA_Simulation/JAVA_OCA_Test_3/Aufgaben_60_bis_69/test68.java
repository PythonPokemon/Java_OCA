/*
null

Line 5 is giving compilation error as process method is not found.
Which of the following method definitions, if used to replace *INSERT*, will resolve the compilation error?
Select 3 options.

Zeile 5 gibt einen Kompilierungsfehler aus, da die Prozessmethode nicht gefunden wurde.
Welche der folgenden Methodendefinitionen behebt den Kompilierungsfehler, wenn sie zum Ersetzen von *INSERT* verwendet wird?
Wählen Sie 3 Optionen.
------------------------------------------------------------------------------------------------------------------------
Correct selection
private static int[] process(int [] arr, int start, int end) {
    return null;
}
------------------------------------------------------------------------------------------------------------------------
private static int process(int [] arr, int start, int end) {
    return null;
}
------------------------------------------------------------------------------------------------------------------------
Correct selection
private static String process(int [] arr, int start, int end) {
    return null;
}
------------------------------------------------------------------------------------------------------------------------
Correct selection
private static String[] process(int [] arr, int start, int end) {
    return null;
}
------------------------------------------------------------------------------------------------------------------------
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_60_bis_69;

public class test68 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(process(arr, 3, 8)); //Line 5
    }
    /*INSERT*/
    private static int[] process(int[] arr, int start, int end) {
        return null;
    }
}
