/*
 * 3
 *
 * Gesamterklärung
Die StringBuilder-Klasse überschreibt die equals(Object)-Methode nicht und daher gibt days.contains(new StringBuilder("Sunday")) false zurück.

Code im if-Block wird nicht ausgeführt und days.size() gibt 3 zurück.
 * */
package JAVA_OCA_Test_2.Aufgaben_50_bis_59;
import java.util.ArrayList;
import java.util.List;

public class test59 {
    public static void main(String[] args) {
        List<StringBuilder> days = new ArrayList<>();
        days.add(new StringBuilder("Sunday"));
        days.add(new StringBuilder("Monday"));
        days.add(new StringBuilder("Tuesday"));

        if(days.contains(new StringBuilder("Sunday"))) {
            days.add(new StringBuilder("Wednesday"));
        }

        System.out.println(days.size());
    }
}
