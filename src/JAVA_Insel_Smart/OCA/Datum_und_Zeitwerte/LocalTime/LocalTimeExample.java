/*
LocalTime
------------------------------------------------------------------------------------------------------------------------
Wichtige Methoden:

diese Methoden sind statische Methoden, deswegen muss man auch kein new davor schreiben,
weil methoden direkt aufgerufen werden können, ohne dass eine Instanz der Klasse erstellt werden muss.
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
        LocalTime aktelleUhrzeit = LocalTime.now();
        System.out.println("Aktuelle Uhrzeit: " + aktelleUhrzeit);

        // Erzeugt eine bestimmte Uhrzeit
        LocalTime spezielleUhrzeit = LocalTime.of(14, 30);
        System.out.println("Spezielle Uhrzeit: " + spezielleUhrzeit);

        // Parse eine Uhrzeit von einem String
        LocalTime uhrzeitStringZuInt = LocalTime.parse("18:45");
        System.out.println("Geparste Uhrzeit: " + uhrzeitStringZuInt);

        // Hinzufügen von Stunden
        LocalTime zeitPlusStunden = aktelleUhrzeit.plusHours(2);
        System.out.println("Uhrzeit plus 2 Stunden: " + zeitPlusStunden);

        // Subtrahieren von Stunden
        LocalTime zeitMinusStunden = aktelleUhrzeit.minusHours(2);
        System.out.println("Uhrzeit minus 2 Stunden: " + zeitMinusStunden);

        // Abrufen von Stunden und Minuten
        int stunden = aktelleUhrzeit.getHour();
        int minuten = aktelleUhrzeit.getMinute();
        int sekunden = aktelleUhrzeit.getSecond();
        System.out.println("Stunde: " + stunden + ", Minute: " + minuten + ", Sekunde: " + sekunden);
    }
}
