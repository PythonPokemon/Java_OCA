/*
* In Java sind die Case-Konstanten im Switch-Statement normalerweise Ganzzahlen, Enums oder Zeichen.
* Der Datentyp des Ausdrucks, der dem Switch übergeben wird, muss kompatibel sein mit dem Datentyp der Case-Konstanten.
* In Ihrem Fall ist var vom Typ byte, aber die Case-Konstanten sind Ganzzahlen-Literale_OCA, die standardmäßig als int interpretiert werden.
*
* Das bedeutet, dass der Compiler einen Fehler meldet, weil byte und int inkompatible Typen sind,
* und es besteht die Möglichkeit, dass der Wert von var nicht mit einem der Case-Werte übereinstimmt,
* da byte einen kleineren Wertebereich hat als int.*/

package JAVA_OCA_Test_1.Aufgaben_30_bis_39;

public class test30 {
    public static void main(String[] args) {

        // Variante 1 | zum Testen auskommentieren | <--- Compiler fehler, warum?
//        byte var = 100;       //<-- byte !
//        switch (var) {
//            case 100:         //<-- int !
//                System.out.println("var is 100");
//                break;
//            case 200:
//                System.out.println("var is 200");
//                break;
//            default:
//                System.out.println("in default");
//        }

/*----------------------------------------------------------------------------------------------------------------------
* Um diesen Fehler zu beheben, können Sie entweder die Case-Werte in byte umwandeln oder den Typ von var in int ändern.
* Hier sind beide Ansätze:
* */

        // Variante 2 | Case-Werte in byte umwandeln:
        byte var2 = 100;        //<--
        switch (var2) {
            case (byte) 100:    //<-- explizite byte deklaration notwendig, weil int standart ist
                System.out.println("var2 is 100");
                break;
            case (byte) 200:
                System.out.println("var2 is 200");
                break;
            default:
                System.out.println("in default");
        }

//----------------------------------------------------------------------------------------------------------------------

        // Variante 3 | Datentyp von var in int ändern:
        int var3 = 100;
        switch (var3) {
            case 100:
                System.out.println("var3 is 100");
                break;
            case 200:
                System.out.println("var is 200");
                break;
            default:
                System.out.println("in default");
        }

    }
}
