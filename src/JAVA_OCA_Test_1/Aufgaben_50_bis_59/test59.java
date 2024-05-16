/*
* Zuerst wird die main-Methode aufgerufen, wie es typischerweise bei Java-Anwendungen der Fall ist.
* Innerhalb der main-Methode wird die main-Methode erneut aufgerufen. Dies geschieht aufgrund des rekursiven Aufrufs in der try-Blockstruktur.
* Da die main-Methode sich selbst immer wieder aufruft, wiederholt sich dieser Vorgang endlos.
* Jeder Aufruf der main-Methode führt zu einem neuen Aufrufstack im Speicher.
*
* Mit jedem neuen Aufruf wird mehr Speicherplatz auf dem Stack allokiert, was letztendlich zu einem Stackoverflow führt,
* da der verfügbare Stackspeicher aufgebraucht ist.
*
* Da die Exception StackOverflowError ausgelöst wird, wird die Ausführung des Codes unterbrochen,
* da eine Exception aufgetreten ist, die nicht behandelt wurde.
*
* Die Exception wird durch die allgemeine Exception-Klausel im Catch-Block gefangen.
* Das Programm geht zum Catch-Block und druckt "CATCH-".
*
* "OUT" wird nicht gedruckt, da die Ausführung des Programms durch die Exception im Catch-Block nicht fortgesetzt wird.
*
* Insgesamt führt der rekursive Aufruf der main-Methode ohne eine Basisfallbedingung zu einem Stackoverflow-Fehler
* und stoppt die normale Ausführung des Programms.
* */

package JAVA_OCA_Test_1.Aufgaben_50_bis_59;

public class test59 {
    public static void main(String[] args) {
        try {
            main(args);
        } catch (Exception ex) {
            System.out.println("CATCH-");
        }
        System.out.println("OUT");
    }
}
