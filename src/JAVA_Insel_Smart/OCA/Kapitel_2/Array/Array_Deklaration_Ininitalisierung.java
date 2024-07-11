/*
Ja, beim Erstellen eines Arrays in Java muss die Dimension des Arrays angegeben werden.
Das bedeutet, dass die Anzahl der Elemente im Array entweder explizit durch eine Zahl oder durch eine Liste
von Initialisierungswerten angegeben werden muss.
* */

package JAVA_Insel_Smart.OCA.Kapitel_2.Array;
import java.util.ArrayList;

public class Array_Deklaration_Ininitalisierung {
    public static void main(String[] args) {
//        int [] a = new int[]; // <--- fehlende angabe der Array dimension, während der initialisierung
        // Variante 1
        int [] a = new int[4];

        System.out.println("Gibt die Speicheradresse des Arrays aus---> " + a + " <---das auf die Variable a Referenziert ist!");
        System.out.println("Gibt vom default-Konstruktor das Element " + a[0] + " aus Index 0 aus, da es nicht initialisiert wurde!");
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        // Variante 2
        int [] b = new int[]{1, 2, 3, 4}; // // Ein Array mit 4 Elementen, initialisiert mit den angegebenen Werten

        System.out.println(b);
        System.out.println(b[0]);
    }
}
