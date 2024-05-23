/*
Gesamterklärung
Die Methoden "parse" und "of" erstellen neue Instanzen, sodass Sie in diesem Fall 4 verschiedene Instanzen
von LocalDate erhalten, die an 4 verschiedenen Speicheradressen gespeichert sind.

false:false:false
 * */
package JAVA_OCA_Test_2.Aufgaben_30_bis_39;
import java.time.LocalDate;

public class test33 {
    public static void main(String [] args) {
        LocalDate d1 = LocalDate.parse("1999-09-09");
        LocalDate d2 = LocalDate.parse("1999-09-09");
        LocalDate d3 = LocalDate.of(1999, 9, 9);
        LocalDate d4 = LocalDate.of(1999, 9, 9);
        System.out.println((d1 == d2) + ":" + (d2 == d3) + ":" + (d3 == d4));
    }
}
