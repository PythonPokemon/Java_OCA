/*
Die Klasse Arrays zum Vergleichen, Füllen, Suchen, Sortieren nutzen
Die Klasse java.util.Arrays bietet zahlreiche nützliche Methoden zum Arbeiten mit Arrays,
darunter Methoden zum Vergleichen, Füllen, Suchen und Sortieren:
* */
package JAVA_Insel_Smart.Kapitel_4;
import java.util.Arrays;

public class Arrays_Vergleichen_Füllen_Suchen_Sortieren {
    public static void main(String[] args) {
        // Initialisieren und Sortieren eines Arrays
        int[] numbers = {5, 3, 2, 8};
        Arrays.sort(numbers);
        System.out.println("Sortiertes Array: " + Arrays.toString(numbers)); // Ausgabe: [2, 3, 5, 8]

        // Füllen eines Arrays mit einem bestimmten Wert
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Gefülltes Array: " + Arrays.toString(filledArray)); // Ausgabe: [7, 7, 7, 7, 7]

        // Suchen in einem sortierten Array
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("Index von 5: " + index); // Ausgabe: 2 (Index des Werts 5 im sortierten Array)

        // Vergleichen von Arrays
        int[] numbersCopy = {2, 3, 5, 8};
        boolean areEqual = Arrays.equals(numbers, numbersCopy);
        System.out.println("Arrays sind gleich: " + areEqual); // Ausgabe: true

        // Sortieren eines Arrays von Zeichenketten
        String[] names = {"Charlie", "Alice", "Bob"};
        Arrays.sort(names);
        System.out.println("Sortiertes String-Array: " + Arrays.toString(names)); // Ausgabe: [Alice, Bob, Charlie]

        // Kopieren eines Arrays
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Kopiertes Array: " + Arrays.toString(copiedArray)); // Ausgabe: [2, 3, 5, 8]

        // Teilweise Kopie eines Arrays
        int[] partialArray = Arrays.copyOfRange(numbers, 1, 3);
        System.out.println("Teilweise kopiertes Array: " + Arrays.toString(partialArray)); // Ausgabe: [3, 5]

        // Vergleichen von Arrays lexikographisch
        int comparisonResult = Arrays.compare(numbers, numbersCopy);
        System.out.println("Vergleichsergebnis: " + comparisonResult); // Ausgabe: 0 (weil sie gleich sind)

        // Mismatch-Methode, um den ersten Unterschied zu finden
        int mismatchIndex = Arrays.mismatch(numbers, new int[]{2, 3, 6, 8});
        System.out.println("Mismatch Index: " + mismatchIndex); // Ausgabe: 2 (weil 5 != 6)
    }
}
