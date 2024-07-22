/*
Format Muster / Pattern
------------------------------------------------------------------------------------------------------------------------
beim Umformatieren von Datumsangaben mit DateTimeFormatter in Java können Sie das Formatmuster (Pattern) frei bestimmen
und dabei entscheiden, ob Sie mit dem Tag, Monat oder Jahr beginnen.

Der DateTimeFormatter erlaubt es Ihnen, verschiedene Muster zu definieren,
um das Datum entsprechend Ihren Anforderungen darzustellen.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Datum_und_Zeitwerte.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatBeispiele {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2023, 12, 25, 15, 30, 0);

        // Verschiedene Muster /Pattern
        // Datum: Signatur entweder mit Bindestrich '-' oder Querstrich '/' zwischen den literalen
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");//25/12/2023
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");//12/25/2023
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");//2023-12-25
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd MMM yyyy");//25 Dez. 2023
        // Zeit
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("HH:mm:ss");//15:30:00
        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("hh:mm a");//03:30 PM
        DateTimeFormatter formatter7 = DateTimeFormatter.ofPattern("yyyy.MM.dd G 'at' HH:mm:ss z");// ------|
        DateTimeFormatter formatter8 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");//25/12/2023 15:30:00
        DateTimeFormatter formatter9 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");//2023-12-25T15:30:00.000Z

        // Formatieren
        System.out.println("Pattern 1: " + dateTime.format(formatter1));
        System.out.println("Pattern 2: " + dateTime.format(formatter2));
        System.out.println("Pattern 3: " + dateTime.format(formatter3));
        System.out.println("Pattern 4: " + dateTime.format(formatter4));
        System.out.println("Pattern 5: " + dateTime.format(formatter5));
        System.out.println("Pattern 6: " + dateTime.format(formatter6));
        // Zeitzonen müssen in der Regel separat behandelt werden, da LocalDateTime keine Zeitzoneninformationen enthält.
        // System.out.println("Pattern 7: " + dateTime.format(formatter7)); // Dies wird nicht korrekt funktionieren ohne Zeitzoneninformationen
        System.out.println("Pattern 8: " + dateTime.format(formatter8));
        System.out.println("Pattern 9: " + dateTime.format(formatter9));
    }
}
