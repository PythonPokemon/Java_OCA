package JAVA_Insel_Smart.Kapitel_4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.awt.Point;

// Arrays sind dynamische Objekte
public class ArrayObjekteErzeugen {
    public static void main(String[] args) {
        //Deklariere eine Array-Variable und initialisiere sie:
        int[] numbers;  // Objekt 1
        numbers = new int[0];
        //Das Array numbers hat nun Platz für zehn Integer-Werte.

        int[] numbers2; // Objekt 2
        numbers2 = new int[0];

        long[] langeZahl;   // Objekt 3
        langeZahl = new long[0];

        System.out.println(numbers);    // Speicher adresse Objekt 1 | [I@6acbcfc0
        System.out.println(numbers2);   // Speicher adresse Objekt 2 | [I@5f184fc6
        System.out.println(langeZahl);  // Speicher adresse Objekt 3 | [J@3feba861

        // vergleich zweier Objekte, false, weil jeder seine eigene speicheradresse hat
        System.out.println(numbers == numbers2);    // Objekt 1 | [I@6acbcfc0 & Objekt 2 | [I@5f184fc6

        // vergleich der elemente in den arrays
        System.out.println(numbers .equals(numbers2)); // false
        System.out.println(Arrays.equals(numbers, numbers2));

//        System.out.println(numbers == langeZahl); //int und longungleiche typen error

    }
}
