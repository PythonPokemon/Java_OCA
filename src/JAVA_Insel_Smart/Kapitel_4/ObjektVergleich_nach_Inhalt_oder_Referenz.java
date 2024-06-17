/*
Referenzvergleich mit numbers.equals(numbers2)
Referenzen: numbers und numbers2 sind Referenzvariablen, die auf zwei verschiedene Array-Objekte zeigen,
auch wenn diese Arrays denselben Inhalt (oder keine Inhalte) haben.

Verwendung der equals Methode: Wenn Sie numbers.equals(numbers2) aufrufen,
wird die Methode equals der Klasse Object verwendet, da Arrays die equals Methode nicht überschreiben.

Vergleich: Object.equals vergleicht die Speicheradressen (Referenzen) der beiden Arrays.
Da numbers und numbers2 auf unterschiedliche Speicheradressen verweisen, gibt der Vergleich false zurück.

int[] numbers = new int[0];
int[] numbers2 = new int[0];
System.out.println(numbers.equals(numbers2)); // false
------------------------------------------------------------------------------------------------------------------------
Elementweiser Vergleich mit Arrays.equals(numbers, numbers2)
Verwendung von Arrays.equals: Die statische Methode Arrays.equals aus der Klasse java.util.Arrays vergleicht
die Inhalte der Arrays elementweise.

Vergleich: Diese Methode überprüft, ob beide Arrays dieselbe Länge haben und ob alle entsprechenden Elemente gleich sind.
Da beide Arrays numbers und numbers2 leer sind (Länge 0), sind sie inhaltlich gleich.

Ergebnis: Der elementweise Vergleich ergibt true, da beide Arrays inhaltlich identisch sind.

System.out.println(Arrays.equals(numbers, numbers2)); // true
Zusammengefasst:
Referenzvergleich (numbers.equals(numbers2)):

Vergleicht die Speicheradressen der Arrays.
Gibt false zurück, weil numbers und numbers2 auf verschiedene Objekte verweisen.
Elementweiser Vergleich (Arrays.equals(numbers, numbers2)):

Vergleicht die Inhalte der Arrays.
Gibt true zurück, weil beide Arrays die gleichen Elemente (keine) haben und dieselbe Länge (0) haben.
------------------------------------------------------------------------------------------------------------------------
In Java müssen Sie Arrays.equals(numbers1, numbers2) explizit angeben, um die Inhalte der Arrays zu vergleichen,
weil die equals Methode der Object Klasse und damit auch die equals Methode der Array-Klasse,
standardmäßig nur die Referenzen der Objekte vergleicht.
* */
package JAVA_Insel_Smart.Kapitel_4;

import java.util.Arrays;

public class ObjektVergleich_nach_Inhalt_oder_Referenz {
    public static void main(String[] args) {
        int[] numbers1 = new int[0];
        int[] numbers2 = new int[0];

        // Vergleich der Referenzen der Arrays
        System.out.println(numbers1.equals(numbers2)); // false, weil beide referenzen nicht auf das selbe objekt vereisen

        // Vergleich der Inhalte der Arrays | Spezifische Methode Arrays.equals:
        System.out.println(Arrays.equals(numbers1, numbers2));  // true, da die inhalte der referenzen gleich sind
    }
}
