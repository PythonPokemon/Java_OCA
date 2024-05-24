/*
 * ANY FRUIT WILL DO
 *
 * Gesamterklärung
"Mango" unterscheidet sich von "Mango", daher gibt es keine passende Groß-/Kleinschreibung.

Der Standardblock wird ausgeführt und da es sich um den letzten Block im Schalter handelt,
* verlässt die Steuerung nach dem Drucken von "ANY FRUIT WILL DO" den Schalterblock, die Hauptmethode endet und das Programm wird erfolgreich beendet.
 * */
package JAVA_OCA_Test_2.Aufgaben_60_bis_70;

public class test62 {
    public static void main(String[] args) {
        String fruit = "mango";
        switch (fruit) {
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
            default:
                System.out.println("ANY FRUIT WILL DO");    // weil kein cse zutreffend ist wird abgebrochen und standart default ausgegeben
        }
    }
}
