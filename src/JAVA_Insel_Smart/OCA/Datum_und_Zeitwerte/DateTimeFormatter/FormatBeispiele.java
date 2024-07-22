/*
Datums-Muster
------------------------------------------------------------------------------------------------------------------------
"dd/MM/yyyy": Tag/Monat/Jahr (z.B. 25/12/2023)
"MM/dd/yyyy": Monat/Tag/Jahr (z.B. 12/25/2023)
"yyyy/MM/dd": Jahr/Monat/Tag (z.B. 2023/12/25)
"dd-MM-yyyy": Tag-Monat-Jahr (z.B. 25-12-2023)
"yyyy-MM-dd": ISO-Standardformat (z.B. 2023-12-25)
"dd MMM yyyy": Tag Monat Jahr (z.B. 25 Dez 2023)
"MMM dd, yyyy": Monat Tag, Jahr (z.B. Dez 25, 2023)
"EEEE, MMM dd, yyyy": Wochentag, Monat Tag, Jahr (z.B. Montag, Dez 25, 2023)
"yyyy.MM.dd G 'at' HH:mm

z": Jahr.Monat.Tag Ära 'um' Stunde:Minute

Zeitzone (z.B. 2023.12.25 AD um 15:30:00 PST)
"EEE, dd MMM yyyy HH:mm

z": Wochentag, Tag Monat Jahr Stunde:Minute
Zeitzone (z.B. Mon, 25 Dec 2023 15:30:00 PST)
------------------------------------------------------------------------------------------------------------------------
Zeit-Muster

"HH:mm
": Stunde:Minute
im 24-Stunden-Format (z.B. 15:30:00)

"hh:mm
a": Stunde:Minute
im 12-Stunden-Format mit AM/PM (z.B. 03:30:00 PM)

"HH
": Stunde
im 24-Stunden-Format (z.B. 15:30)

"hh
a": Stunde
im 12-Stunden-Format mit AM/PM (z.B. 03:30 PM)

"HH:mm
.SSS": Stunde:Minute
.Millisekunden (z.B. 15:30:00.123)

"HH:mm
.SSSSSS": Stunde:Minute
.Mikrosekunden (z.B. 15:30:00.123456)
------------------------------------------------------------------------------------------------------------------------
Datums- und Zeitmuster kombinieren
"dd/MM/yyyy HH:mm
": Datum und Zeit im 24-Stunden-Format (z.B. 25/12/2023 15:30:00)

"dd-MM-yyyy hh
a": Datum und Zeit im 12-Stunden-Format mit AM/PM (z.B. 25-12-2023 03:30 PM)

"yyyy-MM-dd'T'HH:mm
.SSS'Z'": ISO 8601 Datums- und Zeitformat (z.B. 2023-12-25T15:30:00.123Z)
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Datum_und_Zeitwerte.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatBeispiele {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2023, 12, 25, 15, 30, 0);

        // Verschiedene Muster /Pattern
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd MMM yyyy");
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("hh:mm a");
        DateTimeFormatter formatter7 = DateTimeFormatter.ofPattern("yyyy.MM.dd G 'at' HH:mm:ss z");
        DateTimeFormatter formatter8 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter formatter9 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

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
