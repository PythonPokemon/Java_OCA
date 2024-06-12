/*
Der Code führt zu einer UnsupportedTemporalTypeException, weil versucht wird, ein LocalDate-Objekt
mit einem DateTimeFormatter zu formatieren, der Zeitinformationen erfordert.
------------------------------------------------------------------------------------------------------------------------
Erklärung der Ausnahme:

1.Erstellen eines LocalDate-Objekts:
LocalDate date = LocalDate.of(1987, 9, 1);
Dies erstellt ein LocalDate-Objekt, das das Datum "1987-09-01" repräsentiert.
LocalDate enthält nur Datumsinformationen ohne Zeitinformationen.

2.Verwendung von DateTimeFormatter.ISO_DATE_TIME:
String str = date.format(DateTimeFormatter.ISO_DATE_TIME);
DateTimeFormatter.ISO_DATE_TIME ist ein vordefinierter Formatter,
der sowohl Datums- als auch Zeitinformationen erfordert, im Format YYYY-MM-DDTHH:MM:SS.

3.UnsupportedTemporalTypeException:
LocalDate enthält keine Zeitinformationen (Stunden, Minuten, Sekunden),
daher kann es nicht mit einem Formatter formatiert werden, der Zeitinformationen erwartet.

Der Versuch, LocalDate mit DateTimeFormatter.ISO_DATE_TIME zu formatieren, führt zur UnsupportedTemporalTypeException,
weil die erforderlichen Zeitinformationen fehlen.

 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_30_bis_39;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//<---  UnsupportedTemporalTypeException
//public class test31 {
//    public static void main(String [] args) {
//        LocalDate date = LocalDate.of(1987, 9, 1);
//        String str = date.format(DateTimeFormatter.ISO_DATE_TIME);  //<--- geht nicht, Datum in Zeit zu konvertieren
//        System.out.println("Date is: " + str);
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
/*
Lösung
Um das Datum korrekt zu formatieren, sollten wir einen Formatter verwenden,
der nur das Datum ohne Zeitinformationen formatiert.
Zum Beispiel DateTimeFormatter.ISO_LOCAL_DATE:
* */
public class test31 {
    public static void main(String [] args) {
        LocalDate date = LocalDate.of(1987, 9, 1);
        String str = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Date is: " + str);
    }
}
/*
Erklärung der Lösung
1.Verwendung von DateTimeFormatter.ISO_LOCAL_DATE:
DateTimeFormatter.ISO_LOCAL_DATE ist ein vordefinierter Formatter, der nur das Datum formatiert, ohne Zeitinformationen.

2.Korrekte Ausgabe:
String str = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
Formatiert das LocalDate-Objekt korrekt als 1987-09-01.
System.out.println("Date is: " + str);
Gibt "Date is: 1987-09-01" aus.

Fazit
Der Fehler tritt auf, weil LocalDate keine Zeitinformationen enthält und daher nicht mit einem Formatter
formatiert werden kann, der Zeitinformationen erwartet.
Durch die Verwendung eines geeigneten Formatters, der nur Datumsinformationen verarbeitet, kann der Fehler behoben werden.
* */