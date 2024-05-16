/*
 * In deinem Code erstellst du ein Period-Objekt mit der Methode Period.of(0, 0, 0), was bedeutet, dass es ein Zeitraum von 0 Jahren, 0 Monaten und 0 Tagen ist.
 * Wenn du dieses Objekt mit System.out.println() ausgibst, ruft Java automatisch die toString()-Methode des Period-Objekts auf, um eine lesbare Darstellung des Zeitraums zu erhalten.
 *
 * Die Standardimplementierung der toString()-Methode der Period-Klasse gibt den Zeitraum in einem ISO-8601-ähnlichen Format zurück.
 *
 * Zum Beispiel wird der Zeitraum von 0 Tagen als "P0D" dargestellt, wobei "P" für "Period" steht und "D" für "Days" (Tage).
 * Diese Darstellung ist standardisiert und ermöglicht eine einfache Verarbeitung und Interpretation von Zeiträumen in Anwendungen.
 * */

package JAVA_OCA_Test_1.Aufgaben_10_bis_19;
import java.time.Period;

public class test18 {
    public static void main(String[] args) {

        // Variante 1
        Period period = Period.of(0, 0, 0);
        System.out.println(period); //<-- POD

        // Variante 2
        Period period1 = Period.of(1,3,7);
        System.out.println(period1);//<-- P1Y3M7D
    }
}
