/*
Mehrdimensionale Arrays
Java realisiert mehrdimensionale Arrays durch Arrays von Arrays.
Sie können etwa für die Darstellung von mathematischen Matrizen oder Rasterbildern Verwendung finden.
Dieser Abschnitt lehrt, wie Objekte für mehrdimensionale Arrays initialisiert, aufgebaut und abgegrast werden.

Mehrdimensionale Array-Objekte mit new aufbauen:
Die folgende Zeile deklariert ein zweidimensionales Array mit Platz für insgesamt 32 Zellen,
die in vier Zeilen und acht Spalten angeordnet sind:
* */

package JAVA_Insel_Smart.Kapitel_4;
import java.util.ArrayList;

public class Mehrdimensionale_Arrays {
    public static void main(String[] args) {

        // Mehrdimensionale Array-Objekte mit new aufbauen:
        int[][] A = new int[4][8];  // erstellung eines Array Objektes, mit Platz für insgesamt 32 Zellen
                                    // vier Zeilen und acht Spalten angeordnet sind:
        System.out.println(A);      // ausgabe der Speicheradresse, des Array-Objektes
//----------------------------------------------------------------------------------------------------------------------
        // Initialisierung mehrdimensionaler Arrays:
        int[][] B = {
                {1, 2, 3, 4},       // Zeile 0
                {5, 6, 7, 8},       // Zeile 1
                {9, 10, 11, 12},    // Zeile 2
                {13, 14, 15, 16}    // Zeile 3
        };
// Spalte       0 | 1 | 2 | 3 | 4

        // Zugriff auf mehrdimensionale Arrays:
        System.out.println(B);
        System.out.println(B[1][2]); // erste zelle Spalte[], zweite Zelle Zeile[]
    }
}
