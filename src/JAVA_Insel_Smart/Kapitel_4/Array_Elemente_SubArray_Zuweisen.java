/*
Zusammenfassung
Zuweisung von Werten:
Sie können den Elementen eines Sub-Arrays Werte zuweisen, indem Sie die Indizes verwenden, z.B., A[0][0] = 10;.

Ausgabe der Werte:
Sie können die Werte der Elemente eines Sub-Arrays ausgeben, indem Sie die Indizes verwenden,
z.B., System.out.println(A[0][0]);.
Durch diese Schritte können Sie sicherstellen,
dass Sie auf die Elemente der Sub-Arrays zugreifen und sie manipulieren können.
* */

package JAVA_Insel_Smart.Kapitel_4;

public class Array_Elemente_SubArray_Zuweisen {
    public static void main(String[] args) {
        // Initialisierung des nicht rechteckigen Arrays
        int[][] A = new int[3][];   // Array Objekt, mit e Zeilen
        A[0] = new int[2];          // Objekt 1
        A[1] = new int[3];          // Objekt 2
        A[2] = new int[4];          // Objekt 3

        // Zuweisung von Werten zu den 'Sub-Arrays' | diese können Zeilen & Spalten besitzen

        // Objekt 1
        A[0][0] = 10;
        A[0][1] = 20;
//----------------------------------------------------------------------------------------------------------------------
        // Objekt 2
        A[1][0] = 30;
        A[1][1] = 40;
        A[1][2] = 50;
//----------------------------------------------------------------------------------------------------------------------
        // Objekt 3
        A[2][0] = 60;
        A[2][1] = 70;
        A[2][2] = 80;
        A[2][3] = 90;
//----------------------------------------------------------------------------------------------------------------------
        // Ausgabe der Speicheradressen der Sub-Arrays
        System.out.println(A);      // Speicheradresse des Array-Objektes
        System.out.println(A[0]);   // Speicheradresse des Array-Objektes an Index 0
        System.out.println(A[1]);   // Speicheradresse des Array-Objektes an Index 1
        System.out.println(A[2]);   // Speicheradresse des Array-Objektes an Index 2

        // Ausgabe der Elemente der Sub-Arrays
        System.out.println(A[0][0]); // Ausgabe des ersten Elements des ersten Sub-Arrays
        System.out.println(A[0][1]); // Ausgabe des zweiten Elements des ersten Sub-Arrays
        System.out.println(A[1][0]); // Ausgabe des ersten Elements des zweiten Sub-Arrays
        System.out.println(A[1][1]); // Ausgabe des zweiten Elements des zweiten Sub-Arrays
        System.out.println(A[1][2]); // Ausgabe des dritten Elements des zweiten Sub-Arrays
        System.out.println(A[2][0]); // Ausgabe des ersten Elements des dritten Sub-Arrays
        System.out.println(A[2][1]); // Ausgabe des zweiten Elements des dritten Sub-Arrays
        System.out.println(A[2][2]); // Ausgabe des dritten Elements des dritten Sub-Arrays
        System.out.println(A[2][3]); // Ausgabe des vierten Elements des dritten Sub-Arrays
    }
}
