/*
* Welche der folgenden Optionen kann *INSERT* so ersetzen, dass beim Ausführen der Testklasse alle Array-Elemente in der Ausgabe angezeigt werden? Wählen Sie ALLE zutreffenden aus.
* */
package JAVA_OCA_Test_2.Aufgaben_40_bis_49;
import java.util.function.Predicate;
public class test40 {
    public static void main(String[] args) {
        String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

        processStringArray(arr, p -> true);
    }

    private static void processStringArray(String [] arr,
                                           Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
//Richtige Auswahl
//p -> true
//
//Richtige Auswahl
//p -> p.length() < 10
//
//Richtige Auswahl
//p -> p.length() >= 1
//
//Richtige Auswahl
//p -> !false