package JAVA_Insel_Smart.OCA.Kapitel_5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Datum_und_Zeit_formatieren {
    public static void main(String[] args) {
        Date date = new Date();

        //                     Wochentag: | Monat: | Monatstag: | Jahr
        String s = String.format("%tA, %<tB %<td, %<tY", date); // ausgabe des aktuellen Datums:
        System.out.println(s);  // Ausgabe: Samstag, Januar 1, 2022 (abhängig vom aktuellen Datum)

    }
}
