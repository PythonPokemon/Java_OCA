/*
Array-Inhalte kopieren
Die Klasse System bietet die Methode arraycopy, um Elemente von einem Array in ein anderes zu kopieren:
------------------------------------------------------------------------------------------------------------------------
Erklärung der Methode System.arraycopy
Syntax: System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

src: Das Quellarray.
srcPos: Der Startindex im Quellarray.
dest: Das Zielarray.
destPos: Der Startindex im Zielarray.
length: Die Anzahl der Elemente, die kopiert werden sollen.
* */

package JAVA_Insel_Smart.OCA.Kapitel_4;

public class Array_Inhalte_kopieren {
    public static void main(String[] args) {
        // Initialisierung der Arrays:
        int[] src = {1, 2, 3};      // src wird mit den Werten {1, 2, 3} initialisiert.
        int[] dest = new int[3];    // dest wird als neues Array mit einer Länge von 3 erstellt.

        // Kopieren des Inhalts:
        //System.arraycopy(src, 0, dest, 0, src.length); kopiert die Elemente des src-Arrays
        //ab Index 0 (beginnend bei src[0]) in das dest-Array ab Index 0 (beginnend bei dest[0]).
        //Die Anzahl der zu kopierenden Elemente ist src.length, also 3 Elemente.
        System.arraycopy(src, 0, dest, 0, src.length);

        // zum Testen wird der Index von dest aufgerufen, der die kopierten elemente wiedergibt
        // wenn das Neue Array Objekt noch keine Inhalte initialsiert hat sind die standartwerte 0 == Int oder
        System.out.println(dest[0]); // gibt: Index[0] Element1 aus

        System.out.println(src.length);// src hat 3 elemente | Index[0] Element1 |Index[1] Element2 | Index[2] Element3
        System.out.println(dest.length); // als hat 'dest' jetzt auch die 3 elemente

    }
}
