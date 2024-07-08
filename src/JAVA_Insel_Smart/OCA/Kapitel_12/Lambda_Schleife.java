/*
list.forEach(item -> System.out.println(item));: Lambda-Ausdruck, der jeden Eintrag der Liste list durchläuft und druckt.
* */
package JAVA_Insel_Smart.OCA.Kapitel_12;
import java.util.Arrays;
import java.util.List;

// Iteration über eine Liste und Drucken der Elemente
public class Lambda_Schleife {
    public static void main(String[] args) {
        // Ja, Generics in Java verwenden die spitzen Klammern <> zur Angabe der Typparameter. bsp.: <String> |<Integer>
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");

        // Verwenden einer Lambda-Ausdrucks mit forEach, um jedes Element/item der Liste zu drucken
        list.forEach(itemBezeichner -> System.out.println(itemBezeichner));

        List<Integer> listeMitZahlen = Arrays.asList(1, 2, 3, 4, 5);
        listeMitZahlen.forEach(item -> System.out.println(item));
    }
}
