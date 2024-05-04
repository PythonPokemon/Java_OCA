/*  Code Beschreibung
* Deklaration des Arrays:
* Sie beginnen mit dem Typ des Arrays (z.B. int, String, etc.), gefolgt von eckigen Klammern [], gefolgt vom Array-Namen.
* Die Größe des Arrays wird entweder bei der Deklaration angegeben,
* z.B. int[] numbers = new int[5]; oder später mit new zugewiesen, z.B. int[] numbers; numbers = new int[5];
*
* Zugriff auf Array-Elemente:
* Die Indizes beginnen bei 0 und gehen bis zur Größe des Arrays minus eins.
*
* In unserem Beispiel hat das Array numbers fünf Elemente, die Indizes gehen also von 0 bis 4.
* Sie setzen Werte in das Array, indem Sie den Index angeben, z.B. numbers[0] = 10;, und Sie greifen auf die Werte zu, indem Sie ebenfalls den Index angeben,
*
* z.B. System.out.println(numbers[2]);.Array-Länge: Sie können auf die Länge des Arrays mit der Eigenschaft length zugreifen, z.B. numbers.length.
* Beachten Sie, dass length eine Eigenschaft ist und keine Methode, also keine Klammern hat.
*
* Array-Initialisierung:
* Sie können ein Array bei der Erstellung direkt mit Werten initialisieren, z.B. int[] numbers = {10, 20, 30, 40, 50};
* in diesem Fall wird die Größe des Arrays automatisch festgelegt und Sie brauchen sie nicht anzugeben.
*
Array-Typen: In Java können Arrays nicht nur für primitive Datentypen wie int, double, usw. verwendet werden, sondern auch für Objekte wie String.
* */

package Arrays;

import java.util.Arrays;

public class ArrayExample {

    // zum Testen auskommentieren---------------------------------------------------------------------------------------
//    public static void main(String[] args) {
//        // Array erstellen mit einer bestimmten Größe
//        int[] numbers = new int[5];
//
//        // Werte in das Array setzen
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;
//        numbers[3] = 40;
//        numbers[4] = 50;
//
//        // Auf die Werte im Array zugreifen und ausgeben
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Element " + i + ": " + numbers[i]);
//        }
//
////        System.out.println(numbers[4]); // gibt exact die 50  aus dem Array -->   numbers[4] = 50;
//    }

//-------gibt den string mit den Arrays nicht aus?----------------------------------------------------------------------

//    static void test(String[] args) {
//        int[] numbers2 = {10, 20, 30, 40, 50};
//        String textOutput = "Werte aus dem index ";
//        System.out.println(textOutput + numbers2);                        // <-- falsch, aber kein compiler fehler
//    }

            // Variante wie man eine zeichenkette in die arrays integriert
//    public static void main(String[] args) {
//        int[] numbers3 = {11, 22, 33};
//        String textOutput = "Test anzeige der Arrays";
//        System.out.println(textOutput + Arrays.toString(numbers3));       // <-- Korrektur zum obigen beispiel
//    }

//-------------kombinierte Arrays | int und string |--------------------------------------------------------------------
            // Variante 1 überladen | zum Testen auskommentieren
//    public static void main(String[] args) {
//        int[] numbers3 = {11, 22, 33};
//        int[] number4 = {44, 55, 66};
//        String textOutput1 = "Test anzeige des ersten Arrays ";
//        String textOutput2 = "Test anzeige des zweiten Arrays ";
//        System.out.println(textOutput1 + Arrays.toString(numbers3));
//        System.out.println(textOutput2 + Arrays.toString(number4));
//    }

/*
* Um die Elemente beider Arrays in einem neuen Array zu kombinieren, muss man entweder eine Schleife verwenden, um sie zu durchlaufen, wie im obersten beispiel.
* oder die Arrays.copyOf()-Methode verwenden, um ein neues Array zu erstellen und die Elemente der beiden Arrays in dieses neue Array zu kopieren.
* */

    // Variante 2 kombiniert
/*
* diese Methode erstellt ein neues Array combinedArray, das groß genug ist, um alle Elemente von numbers3 und number4 aufzunehmen.
* Dann werden die Elemente beider Arrays in das kombinierte Array kopiert. Schließlich wird das kombinierte Array ausgegeben.
* */

    public static void main(String[] args) {
        int[] numbers3 = {11, 22, 33};
        int[] number4 = {44, 55, 66};

        // Ein neues Array erstellen, das groß genug ist, um beide Arrays zu halten
        int[] combinedArray = new int[numbers3.length + number4.length];

        // Die Elemente von numbers3 in das kombinierte Array kopieren
        System.arraycopy(numbers3, 0, combinedArray, 0, numbers3.length);

        // Die Elemente von number4 in das kombinierte Array kopieren, beginnend ab dem Ende von numbers3
        System.arraycopy(number4, 0, combinedArray, numbers3.length, number4.length);

        // Das kombinierte Array ausgeben
        System.out.println(Arrays.toString(combinedArray));
    }
}