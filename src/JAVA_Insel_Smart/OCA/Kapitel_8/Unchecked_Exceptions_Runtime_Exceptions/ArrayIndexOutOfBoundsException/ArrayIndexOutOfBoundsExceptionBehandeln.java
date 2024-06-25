/*
Erklärung
Der Zugriff auf das Array-Element wird innerhalb eines try-catch-Blocks platziert.
Wenn eine ArrayIndexOutOfBoundsException ausgelöst wird, wird sie im catch-Block abgefangen.
Eine Fehlermeldung wird ausgegeben, anstatt dass das Programm abstürzt.
* */
package JAVA_Insel_Smart.OCA.Kapitel_8.Unchecked_Exceptions_Runtime_Exceptions.ArrayIndexOutOfBoundsException;

public class ArrayIndexOutOfBoundsExceptionBehandeln {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        try {
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fehler: Ungültiger Array-Index.");
        }

    }
}
