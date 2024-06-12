/*
 *Gesamterklärung
Die LocalDate.parse(CharSequence)-Methode akzeptiert String nur im Format "9999-99-99".
* Einstellige Monats- und Tageswerte werden mit 0 aufgefüllt, um sie in 2 Ziffern umzuwandeln.

Um den 9. Juni 2018 darzustellen, muss das Format String "2018-06-09" lauten.

Wenn nicht die richtige Formatzeichenfolge übergeben wird, wird eine Instanz von java.time.format.DateTimeParseException ausgelöst.
 * */

package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_1_bis_9;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//public class test3 {
//    public static void main(String [] args) {
//        LocalDate date = LocalDate.parse("2018-1-01"); //<--  ISO-8601-Format (YYYY-MM-DD) ist hier falsch
//        System.out.println(date);
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
// Variante 1 | RichtigD ie LocalDate.parse-Methode erwartet, dass der String im ISO-8601-Format (YYYY-MM-DD) vorliegt.
//
//public class test3 {
//    public static void main(String [] args) {
//        LocalDate date = LocalDate.parse("2018-01-01"); //<-- String im ISO-8601-Format (YYYY-MM-DD)
//        System.out.println(date);
//    }
//}
//----------------------------------------------------------------------------------------------------------------------

// Variante 2 | DateTimeFormatter
/*
* Zusätzliche Informationen:
Falls du Daten parsen musst, die nicht im Standardformat sind, kannst du die DateTimeFormatter-Klasse verwenden, um ein benutzerdefiniertes Format zu definieren.

Beispiel mit DateTimeFormatter:
Falls du ein Datum im Format YYYY-M-D parsen musst (mit optional einstelligem Monat und Tag), könntest du das folgende Beispiel verwenden:
* */

public class test3 {
    public static void main(String [] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        LocalDate date = LocalDate.parse("2018-1-1", formatter);
        System.out.println(date);
    }
}
