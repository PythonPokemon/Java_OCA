/*
 * Runtime exception
 * */
package JAVA_OCA_Test_2.Aufgaben_30_bis_39;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class test38 {
    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.parse("2018-7-11"));    // Fehler LocalDate Format YYYY-MM-DD ---> 07 | "2018-7-11"
        dates.add(LocalDate.parse("1919-10-25"));
        dates.add(LocalDate.of(2020, 4, 8));
        dates.add(LocalDate.of(1980, Month.DECEMBER, 31));

        dates.removeIf(x -> x.getYear() < 2000);    // entfernt alles was kleiner 2.000 ist

        System.out.println(dates);
    }
}
