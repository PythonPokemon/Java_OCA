package JAVA_Insel_Smart.OCA.Kapitel_4;

public class Riesieges_Array {
    public static void main(String[] args) {
        // Erstellen eines großen Hauptarrays
        int[][] largeArray = new int[10000][]; // Hauptarray mit 10.000 Zeilen

        // Initialisieren der Sub-Arrays mit unterschiedlichen Längen
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = new int[i + 1]; // Jede Zeile hat i+1 Spalten
        }

        // Zuweisung von Werten zu den Sub-Arrays
        for (int i = 0; i < largeArray.length; i++) {
            for (int j = 0; j < largeArray[i].length; j++) {
                largeArray[i][j] = i + j;
            }
        }

        // Ausgabe einiger Werte zur Überprüfung
        System.out.println(largeArray[0][0]); // Ausgabe des ersten Elements
        System.out.println(largeArray[9999][9999]); // Ausgabe des letzten Elements im letzten Sub-Array
    }
}
