/*
* Was passiert im Code?
* Import-Anweisungen:
* Importiert die benötigten Klassen LocalDate, Month, ArrayList und List.
* Erstellung der Liste dates
*
* List<LocalDate> dates = new ArrayList<>();
* Eine ArrayList dates wird erstellt, die LocalDate-Objekte speichert.
*
* Hinzufügen von Datumsobjekten zur Liste:
* dates.add(LocalDate.parse("2018-07-11"));
* dates.add(LocalDate.parse("1919-02-25"));
* dates.add(LocalDate.of(2020, 4, 8));
* dates.add(LocalDate.of(1980, Month.DECEMBER, 31));
*
* Vier LocalDate-Objekte werden der Liste dates hinzugefügt,
* zwei davon werden mit der parse-Methode aus Zeichenfolgen und zwei mit der of-Methode aus explizit angegebenen Werten erstellt.
*
* Entfernen von Daten vor dem Jahr 2000:
* Dates.removeIf(x -> x.getYear() < 2000);
* Die removeIf-Methode wird verwendet, um Elemente aus der Liste zu entfernen, die vor dem Jahr 2000 liegen.
* Die Bedingung x -> x.getYear() < 2000 gibt an, dass jedes Element x, dessen Jahr vor 2000 liegt, entfernt wird.
*
* Ausgabe der Liste:
* System.out.println(dates);
* Die verbleibenden Datumsobjekte in der Liste dates werden auf der Konsole ausgegeben.
*
* Was wird ausgegeben?
* Nachdem die Datumsobjekte entfernt wurden, die vor dem Jahr 2000 liegen, enthält die Liste nur noch die Datumsobjekte für die Jahre 2018 und 2020.
* Daher wird die folgende Ausgabe erzeugt:
* */

package JAVA_OCA_Test_1.Aufgaben_1_bis_9;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class test7 {
    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.parse("2018-07-11"));
        dates.add(LocalDate.parse("1919-02-25"));
        dates.add(LocalDate.of(2020, 4, 8));
        dates.add(LocalDate.of(1980, Month.DECEMBER, 31));

        dates.removeIf(x -> x.getYear() < 2000);

        System.out.println(dates);  // [2018-07-11, 2020-04-08]
    }
}
