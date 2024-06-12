/*
Welche der folgenden Optionen kann *INSERT* so ersetzen,
dass beim Ausführen der Testklasse alle Array-Elemente in der Ausgabe angezeigt werden?
Wählen Sie ALLE zutreffenden aus.
------------------------------------------------------------------------------------------------------------------------
In diesem Code wird die Predicate-Schnittstelle verwendet,
um eine Bedingung für das Drucken von Zeichenfolgen in einem Array festzulegen.
Die Methode processStringArray durchläuft das Array und druckt die Zeichenfolgen,
die die Bedingung des Prädikats erfüllen.
------------------------------------------------------------------------------------------------------------------------
Funktionsweise des Codes:
------------------------------------------------------------------------------------------------------------------------
1.Array-Deklaration und Initialisierung:

String[] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};
Ein Array von Zeichenfolgen wird erstellt und mit den Werten {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"}
initialisiert.
------------------------------------------------------------------------------------------------------------------------
2.Aufruf der processStringArray-Methode:

processStringArray(arr, p -> true);
Die Methode processStringArray wird mit dem Array arr und einem Prädikat p -> true aufgerufen.
Dieses Prädikat gibt immer true zurück, was bedeutet, dass alle Zeichenfolgen im Array gedruckt werden.
------------------------------------------------------------------------------------------------------------------------
3.Definition der processStringArray-Methode:

private static void processStringArray(String[] arr, Predicate<String> predicate) {
    for (String str : arr) {
        if (predicate.test(str)) {
            System.out.println(str);
        }
    }
}

Diese Methode durchläuft das Array arr. Für jede Zeichenfolge str im Array wird das Prädikat predicate aufgerufen.
Wenn das Prädikat true zurückgibt, wird die Zeichenfolge str gedruckt.
------------------------------------------------------------------------------------------------------------------------
Erklärung der Auswahlmöglichkeiten:
Alle angegebenen Prädikate erfüllen die Bedingung und drucken alle oder fast alle Elemente des Java_Anfänger_zum_Profi.Arrays.
------------------------------------------------------------------------------------------------------------------------
Hier ist die Erklärung jeder Auswahl:

p -> true:
Dies ist das einfachste Prädikat. Es gibt immer true zurück, sodass jede Zeichenfolge im Array gedruckt wird.
Ausgabe: A ab bab Aa bb baba aba Abab

p -> p.length() < 10:
Dieses Prädikat gibt true zurück, wenn die Länge der Zeichenfolge kleiner als 10 ist.
Da alle Zeichenfolgen im Array kürzer als 10 Zeichen sind, werden alle gedruckt.
Ausgabe: A ab bab Aa bb baba aba Abab

p -> p.length() >= 1:
Dieses Prädikat gibt true zurück, wenn die Länge der Zeichenfolge größer oder gleich 1 ist.
Da alle Zeichenfolgen im Array mindestens 1 Zeichen lang sind, werden alle gedruckt.
Ausgabe: A ab bab Aa bb baba aba Abab

p -> !false:
Dies ist äquivalent zu p -> true. Es gibt immer true zurück, sodass jede Zeichenfolge im Array gedruckt wird.
Ausgabe: A ab bab Aa bb baba aba Abab

Zusammenfassung:
Der Code druckt alle Elemente des Java_Anfänger_zum_Profi.Arrays arr, da jedes der angegebenen Prädikate so definiert ist,
dass es für alle Elemente true zurückgibt.
Die verschiedenen Prädikate geben alle true zurück, wodurch alle Zeichenfolgen gedruckt werden.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_40_bis_49;

import java.util.function.Predicate;

public class test40 {
    public static void main(String[] args) {
        String[] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};
                                /*INSERT*/
                            //     \/
        processStringArray(arr, p -> true);
    }

    private static void processStringArray(String[] arr, Predicate<String> predicate) {
        for (String str : arr) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
//Richtige Auswahl
//p -> true
//----------------------------------------------------------------------------------------------------------------------
//Richtige Auswahl
//p -> p.length() < 10
//----------------------------------------------------------------------------------------------------------------------
//Richtige Auswahl
//p -> p.length() >= 1
//----------------------------------------------------------------------------------------------------------------------
//Richtige Auswahl
//p -> !false
//----------------------------------------------------------------------------------------------------------------------