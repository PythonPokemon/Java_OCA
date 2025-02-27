/*
* Die NullPointerException tritt auf, weil du versuchst, auf die Elemente des Double-Java_Anfänger_zum_Profi.Arrays zuzugreifen, ohne sie vorher zu initialisieren.
* In Java werden Java_Anfänger_zum_Profi.Arrays automatisch mit null initialisiert, wenn sie erstellt werden.
* Da du aber versuchst, die beiden Elemente des Java_Anfänger_zum_Profi.Arrays zu addieren, ohne sie vorher mit Werten zu füllen, resultiert dies in einem NullPointerException.
* Um diesen Fehler zu vermeiden, musst du sicherstellen, dass die Array-Elemente initialisiert sind, bevor du auf sie zugreifst.
* Zum Beispiel könntest du jedem Element des Java_Anfänger_zum_Profi.Arrays einen Wert zuweisen, bevor du versuchst, sie zu verwenden.
* */

package JAVA_OCA_Simulation.JAVA_OCA_Test_1.Aufgaben_40_bis_49;

// Variante 1 | zum Testen auskommentieren
//public class test43 {
//    public static void main(String[] args) {
//        Double [] arr = new Double[2];
//        System.out.println(arr[0] + arr[1]);    // <-- .NullPointerException
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
/*
* Um die NullPointerException zu vermeiden und die erwartete Ausgabe zu erhalten, könntest du die Elemente des Java_Anfänger_zum_Profi.Arrays initialisieren,
* bevor du versuchst, sie zu verwenden.
* Hier ist eine korrigierte Version des Codes:
* */

// Variante 2 | zum Testen auskommentieren
public class test43 {
    public static void main(String[] args) {
        Double[] arr = new Double[2];
        arr[0] = 0.0; // Initialisiere das erste Element
        arr[1] = 0.0; // Initialisiere das zweite Element
        System.out.println(arr[0] + arr[1]); // Ausgabe: 0.0
    }
}

// Durch die Initialisierung der Array-Elemente mit einem Wert (hier 0.0) vermeidest du die NullPointerException, und die Ausgabe wird wie erwartet sein.