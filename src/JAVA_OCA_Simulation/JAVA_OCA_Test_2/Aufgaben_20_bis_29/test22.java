/*
* false:false

wenn etwas am gleichen datum ist, kann es nicht voher oder nachher sein sondern es ist gleichzeitig!

Gesamterklärung
isAfter und isBefore können wie folgt interpretiert werden:

Kommt der 1. Januar 2018 nach dem 1. Januar 2018? Nein, falsch. Kommt der 1. Januar 2018 vor dem 1. Januar 2018? Nein, falsch.
* */

package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_20_bis_29;
import java.time.LocalDate;

public class test22 {
    public static void main(String [] args) {
        LocalDate newYear = LocalDate.of(2018, 1, 1);
        LocalDate eventDate = LocalDate.of(2018, 1, 1);
        boolean flag1 = newYear.isAfter(eventDate);
        boolean flag2 = newYear.isBefore(eventDate);
        System.out.println(flag1 + ":" + flag2);
    }
}
