/*
* Der Code erstellt ein Array von Zeichenfolgen arr und definiert eine Predicate-Funktion p, die prüft,
* ob die erste Buchstabe einer Zeichenfolge großgeschrieben ist und mit "A" übereinstimmt.
*
* Die Predicate-Funktion p wird dann mit der Methode processStringArray aufgerufen, die jedes Element des Arrays arr überprüft
*  und diejenigen ausgibt, die das Prädikat erfüllen, d.h. deren erste Buchstabe großgeschrieben und gleich "A" ist.
*
* Hier ist eine Schritt-für-Schritt-Erklärung des Codes:
*
* Das Array arr enthält folgende Zeichenfolgen: {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"}.
* Das Prädikat p wird definiert.
* Es verwendet eine Lambda-Ausdruck, um eine Predicate-Funktion zu erstellen, die folgende Schritte ausführt:
* Wandelt die Eingabezeichenfolge in Großbuchstaben um.
* Extrahiert den ersten Buchstaben der Zeichenfolge.
* Überprüft, ob dieser Buchstabe gleich "A" ist.
*
* Die Methode processStringArray wird aufgerufen und iteriert über jedes Element des Arrays arr.
* Für jedes Element wird das Prädikat predicate angewendet. Wenn das Prädikat wahr ist, wird die Zeichenfolge ausgegeben.
* Die Ausgabe des Codes sind die Zeichenfolgen im Array arr, deren erster Buchstabe großgeschrieben und gleich "A" ist.
* In diesem Fall sind das "A", "ab", "Aa", "aba" und "Abab".
* */

package JACA_OCA_Test_1.Aufgaben_50_bis_59.Aufgaben_40_bis_49;
import java.util.function.Predicate;

public class test40 {
    public static void main(String[] args) {
        String[] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

        Predicate<String> p = s -> s.toUpperCase().substring(0,1).equals("A"); // Lambda Methode die alle Strings beginnend mit A. ob groß oder klein ausgibt

        processStringArray(arr, p);
    }

    private static void processStringArray (String[] arr, Predicate<String>predicate){
        for(String str : arr){  // ein Schleifen durchlauf durch den array, deren Methode von Lambda unterliegt
            if(predicate.test(str)){
                System.out.println(str);
            }
        }
    }
}
