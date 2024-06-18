/*
Die Wahrheit über die Array-Initialisierung
Standardmäßig wird jedes Element eines Arrays mit dem Standardwert des entsprechenden Typs initialisiert:

Für elementare Datentypen wie int ist dies 0.
Für Referenztypen wie String ist dies null.
* */
package JAVA_Insel_Smart.Kapitel_4;

public class Nichtrechteckige_Arrays {
    public static void main(String[] args) {
        int[][] A = new int[3][];
        A[0] = new int[2];
        A[1] = new int[3];
        A[2] = new int[4];

        // Aufruf der Methode | System.out.println(); | die bezeichner werden der Methode als Argument übergeben
        System.out.println(A); // Speicheradresse des Array-objektes

        System.out.println(A[0]);   // Speicheradresse des ArrayObjekt, Index
        System.out.println(A[1]);   //                  ''
        System.out.println(A[2]);   //                  ''
    }
}
