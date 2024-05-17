/*
.UnsupportedTemporalTypeException

Gesamterklärung
Das LocalDate-Objekt enthält keinen Zeitteil, aber ISO_DATE_TIME sucht nach dem Zeitteil und löst zur Laufzeit eine Ausnahme aus.

Für die OCA-Prüfung können Sie die folgenden DateTimeFormatter-Typen überprüfen:
BASIC_ISO_DATE, ISO_DATE,
ISO_LOCAL_DATE, ISO_TIME,
ISO_LOCAL_TIME,
ISO_DATE_TIME ISO_LOCAL_DATE_TIME.
 * */
package JAVA_OCA_Test_3.Aufgaben_30_bis_39;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class test31 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.of(1987, 9, 1);
        String str = date.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date is: " + str);
    }
}
