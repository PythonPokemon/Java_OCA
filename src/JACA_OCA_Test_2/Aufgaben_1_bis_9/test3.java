/*
 *Gesamterklärung
Die LocalDate.parse(CharSequence)-Methode akzeptiert String nur im Format "9999-99-99". Einstellige Monats- und Tageswerte werden mit 0 aufgefüllt, um sie in 2 Ziffern umzuwandeln.

Um den 9. Juni 2018 darzustellen, muss das Format String "2018-06-09" lauten.

Wenn nicht die richtige Formatzeichenfolge übergeben wird, wird eine Instanz von java.time.format.DateTimeParseException ausgelöst.
 * */

package JACA_OCA_Test_2.Aufgaben_1_bis_9;
import java.time.LocalDate;

public class test3 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("2018-1-01");
        System.out.println(date);
    }
}
