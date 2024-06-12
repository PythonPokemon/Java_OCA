/*
 * Der Code führt zu einer Ausnahme zur Laufzeit, da der Tag "31" für den Monat September nicht gültig ist.
 * In Java wird der Tag normalerweise von 1 bis 28, 29, 30 oder 31 (abhängig vom Monat und vom Schaltjahr) unterstützt.
 *
 * In diesem Fall ist der Monat September, der normalerweise nur 30 Tage hat.
 * Wenn Sie jedoch versuchen, den 31. September zu erstellen, wird eine java.time.DateTimeException ausgelöst,
 * da der 31. September nicht existiert.
 *
 *-----------------------------------------------------------------------------------------------------------------------
 * !!! Zusatzinfo WICHTIG !!!.
 * Die LocalDateTime.of()-Methode erwartet als Argumente: Jahr, Monat, Tag, Stunde, Minute und Sekunde.
 *-----------------------------------------------------------------------------------------------------------------------
 *
 * Da der Monat September 30 Tage hat, daher ist der 31.September ungültig.
 * Sie sollten also den Tag auf einen gültigen Wert ändern.
 * */

package JAVA_OCA_Simulation.JAVA_OCA_Test_1.Aufgaben_30_bis_39;

import java.time.LocalDateTime;

// Variante 1 | java.time.DateTimeException | zum Testen auskommentieren

//public class test36 {
//    public static void main(String[] args) {
//        LocalDateTime date = LocalDateTime.of(2020, 9, 21);
//        System.out.println(date);                             // <- was kommt raus?
//    }
//}
//----------------------------------------------------------------------------------------------------------------------

// Variante 2 | LocalDateTime.of()-Methode erwartet als Argumente: Jahr, Monat, Tag, Stunde, Minute und Sekunde.

public class test36 {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(2020, 9, 30, 0, 0);

        System.out.println(date);                               // <- was kommt raus?
    }
}
