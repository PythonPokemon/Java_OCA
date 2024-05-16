package JAVA_OCA_Test_1.Aufgaben_50_bis_59.Aufgaben_30_bis_39;
import java.time.LocalDateTime;

public class test35 {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println("Tageszeit angaben");
        System.out.println(obj);                // <-- Aktuelle angaben zum | Jahr,- Monat,- Tag,- Stunden,- Minuten,- Sekunden,-
        System.out.println(obj.getHour());      // <-- was kommt raus? | stunden
        System.out.println(obj.getMinute());    // <-- was kommt raus? | minuten
        System.out.println(obj.getSecond());    // <-- was kommt raus? | eine sekundenangabe zwischen 0 bis 59

        System.out.println("Jahres-, Monats-, Wochenzeit angaben");
        System.out.println(obj.getDayOfYear()); // <-- gibt den Jahrestag aus
        System.out.println(obj.getDayOfMonth());// <-- gibt den Monatstag aus
        System.out.println(obj.getDayOfWeek()); // <-- gibt den Wochentag aus

    }
}
