/*
 Klonen kann sich lohnen – Arrays vermehren
Arrays lassen sich mit der Methode clone() kopieren:
------------------------------------------------------------------------------------------------------------------------
Das Klonen eines Arrays erzeugt eine flache Kopie.
Für ein Array von Objekten bedeutet dies, dass die Elemente selbst nicht geklont werden,
sondern die Referenzen auf dieselben Objekte wie im Original-Array zeigen.
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung
Die equals-Methode für Arrays vergleicht die Referenzen der Array-Objekte, nicht deren Inhalte.
Um den Inhalt der Arrays zu vergleichen, verwenden Sie die Methode Arrays.equals(),
die die Elemente der Arrays vergleicht und true zurückgibt, wenn die Arrays denselben Inhalt haben.
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung
== Operator: Vergleicht die Referenzen der Arrays.
equals Methode: Vergleicht ebenfalls die Referenzen der Arrays.
Arrays.equals Methode: Vergleicht die Inhalte der Arrays.
* */

package JAVA_Insel_Smart.Kapitel_4;

import java.util.Arrays;

public class ArrayReferenz_Clonen {
    public static void main(String[] args) {
        int[] original = {1, 2, 3}; // Array mit 3 elementen
        int[] copy = original.clone();
        int[] originaleNachmache = {1, 2, 3};

        System.out.println(original);       // gibt die Speicheradresse aus: [I@6acbcfc0
        System.out.println(original[0]);    // gibt index 0 aus, ds dass Element 1 beinhaltet

        System.out.println(copy);           // gibt die Speicheradresse aus: [I@5f184fc6

        //== Operator: Vergleicht die Referenzen der Arrays.
        System.out.println(original == copy); // false weil, zwei unterschiedliche Objekte mit eigener speicheradresse

        System.out.println(original.equals(copy)); // false, weil nur die referenz kopiert wird, nicht die elemente

        System.out.println(originaleNachmache); // gibt die Speicheradresse aus: [I@3feba861

        // equals Methode: Vergleicht ebenfalls die Referenzen der Arrays.
        System.out.println(original.equals(originaleNachmache));

        // Arrays.equals Methode: Vergleicht die Inhalte der Arrays.
        System.out.println(Arrays.equals(original, copy)); // Vergleich der Inhalte (true)
        System.out.println(Arrays.equals(original, originaleNachmache)); // Vergleich der Inhalte (true)
    }
}
