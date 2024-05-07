package JACA_OCA_Test_1.Aufgaben_30_bis_39;
import java.time.LocalDateTime;

public class test35 {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println("Tageszeit angaben");
        System.out.println(obj);                // <-- was kommt raus?
        System.out.println(obj.getHour());      // <-- was kommt raus?
        System.out.println(obj.getMinute());    // <-- was kommt raus?
        System.out.println(obj.getSecond());    // <-- was kommt raus? | eine sekundenangabe zwischen 0 bis 59

        System.out.println("Jahres-, Monats-, Wochenzeit angaben");
        System.out.println(obj.getDayOfYear());
        System.out.println(obj.getDayOfMonth());
        System.out.println(obj.getDayOfWeek());

    }
}
