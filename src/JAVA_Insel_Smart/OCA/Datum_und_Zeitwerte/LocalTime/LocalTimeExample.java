/*
LocalTime
------------------------------------------------------------------------------------------------------------------------
Wichtige Methoden:
now()
of(int hour, int minute)
parse(CharSequence text)
plusHours(long hoursToAdd)
minusHours(long hoursToSubtract)
getHour()
getMinute()
getSecond()
* */

package JAVA_Insel_Smart.OCA.Datum_und_Zeitwerte.LocalTime;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        // Erzeugt die aktuelle Uhrzeit
        LocalTime currentTime = LocalTime.now();
        System.out.println("Aktuelle Uhrzeit: " + currentTime);

        // Erzeugt eine bestimmte Uhrzeit
        LocalTime specificTime = LocalTime.of(14, 30);
        System.out.println("Spezielle Uhrzeit: " + specificTime);

        // Parse eine Uhrzeit von einem String
        LocalTime parsedTime = LocalTime.parse("18:45");
        System.out.println("Geparste Uhrzeit: " + parsedTime);

        // Hinzufügen von Stunden
        LocalTime timePlusHours = currentTime.plusHours(2);
        System.out.println("Uhrzeit plus 2 Stunden: " + timePlusHours);

        // Subtrahieren von Stunden
        LocalTime timeMinusHours = currentTime.minusHours(2);
        System.out.println("Uhrzeit minus 2 Stunden: " + timeMinusHours);

        // Abrufen von Stunden und Minuten
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();
        System.out.println("Stunde: " + hour + ", Minute: " + minute + ", Sekunde: " + second);
    }
}
