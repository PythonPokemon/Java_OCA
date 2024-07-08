/*
Generische Methoden:
Du kannst auch Methoden innerhalb und außerhalb generischer Klassen generisch machen.
* */

package JAVA_Insel_Smart.OCA.Kapitel_11;

// Generics_Methode
class Utils {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class Generics_Methode {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"A", "B", "C", "D"};

        Utils.printArray(intArray);
        Utils.printArray(stringArray);
    }
}
