/*
Typische Array-Fehler
Typische Fehler im Umgang mit Arrays sind:

Zugriff auf ein Element außerhalb der Array-Grenzen (IndexOutOfBoundsException)
Verwechslung von Index und Element
Falsche Initialisierung
------------------------------------------------------------------------------------------------------------------------
Arrays als Methodenparameter
Verweise auf Arrays lassen sich bei Methoden genauso übergeben wie Verweise auf ganz normale Objekte.
In der Deklaration heißt es dann zum Beispiel foo(int[] val) statt foo(String val).
------------------------------------------------------------------------------------------------------------------------
Sollen die Array-Inhalte erst nach der Variablendeklaration initialisiert werden
oder soll das Array auch ohne Variable als Argument genutzt werden, so erlaubt Java dies nicht:

primes = { 2, 5, 7, 11, 13 }; // Compilerfehler
avg({ 1.23, 4.94, 9.33, 3.91, 6.34 }); // Compilerfehler
* */
package JAVA_Insel_Smart.OCA.Kapitel_4;

public class Array_MethodenParameter {
    static double bezeichner(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return sum / array.length;
    }

    public static void main(String[] args) {
        double[] numbers = { 2, 3, 4 };
        System.out.println(bezeichner(numbers)); // Ausgabe: 3.0
    }
}


