/*
*
Hier ist eine Erklärung des Codes:

Was passiert im Code?
Paketdeklaration:

Organisiert den Code im Paket JACA_OCA_Test_1.Aufgaben_1_bis_9.
Klassendeklaration:

Definiert eine neue Klasse namens test2.
Hauptmethode (main):

Der Startpunkt des Programms. Alles in den geschweiften Klammern {} wird ausgeführt, wenn das Programm startet.
Erstellung von Arrays:

int[] arr3[] = new int[8][];

Erstellt ein Array von Arrays mit 8 Zeilen, aber die Anzahl der Spalten ist noch nicht festgelegt.
Gibt den Speicherort des Arrays arr3 aus.
int[] arr1 = new int[8];

Erstellt ein eindimensionales Array mit 8 Elementen.
Gibt den Speicherort des Arrays arr1 aus.
int[][] arr2 = new int[8][8];

Erstellt ein zweidimensionales Array mit 8 Zeilen(untereinander) und 8 Spalten(nebeneinander).
Gibt den Speicherort des Arrays arr2 aus.
*
* Die Ausgabe besteht aus den Speicherorten der erstellten Arrays:
* [[I@3cd1a2f1
* [I@2f0e140b
* [[I@7440e464
* */

package JAVA_OCA_Test_1.Aufgaben_1_bis_9;

public class test2 {
    public static void main(String[] args) {
        int [] arr3 [] = new int[8][];
        System.out.println(arr3);

        int [] arr1 = new int[8];
        System.out.println(arr1);

        int [][] arr2 = new int[8][8];
        System.out.println(arr2);


        // falsche deklaration
//        int arr4 [][] = new int[][8]; // error
//        System.out.println(arr4);     // error
    }
}
