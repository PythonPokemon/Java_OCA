/*
 * Welche Optionen für den Klassentest, wenn sie *INSERT* ersetzen, drucken TEN auf die Konsole? Wählen Sie 4 Optionen.
 * */

package JAVA_OCA_Test_2.Aufgaben_20_bis_29;

public class test29 {
    public static void main(String[] args) {

        /*INSERT*/
//        double var = 10;  // error
//
//        long var = 10;    // error

//        //Richtige Auswahl
//        byte var = 10;
//
//        //Richtige Auswahl
//        Short var = 10;
//
//        //Richtige Auswahl
//        char var = 10;

        //Richtige Auswahl
        Integer var = 10;
        switch(var) {
            case 10:
                System.out.println("TEN");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}
