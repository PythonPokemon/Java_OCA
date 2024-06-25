/*
Erklärung
In diesem Beispiel hat das Array array eine Länge von 3, mit gültigen Indizes 0, 1 und 2.
Der Versuch, auf array[3] zuzugreifen,
liegt außerhalb des gültigen Bereichs und führt zu einer ArrayIndexOutOfBoundsException.
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Unchecked_Exceptions_Runtime_Exceptions.ArrayIndexOutOfBoundsException;

public class ArrayIndexOutOfBoundsExceptionAusloesen {
    public static void main(String[] args) {
        int[] array = {1, 2, 3}; // weil es nur Index: 0, 1, 2 in diesem beispiel gibt
        System.out.println(array[3]);  // Dies löst eine ArrayIndexOutOfBoundsException aus
    }
}
