/*
* Variante 1
* gibt es einen Compiler fehler, weil sb.append(null) nicht eindeutig ist.
* Der Compiler kann nicht entscheiden, welche append()-Methode von StringBuilder aufgerufen werden soll.
*
* StringBuilder hat verschiedene Überladungen der append()-Methode, darunter eine für String, eine für CharSequence, eine für Object, usw.
* Wenn null übergeben wird, kann der Compiler nicht bestimmen, welche dieser Überladungen aufgerufen werden soll, da null für alle diese Typen gültig ist.
*
* Um diesen Fehler zu beheben, können Sie entweder einen expliziten Cast verwenden, um dem Compiler zu helfen,
* die richtige Methode auszuwählen, oder sicherstellen, dass der Wert, den Sie an append() übergeben, nicht null ist.
* */

package JACA_OCA_Test_1.Aufgaben_50_bis_59.Aufgaben_50_bis_59;

public class test56 {

//    // Variante 1 | Compiler fehler | zum Testen auskommentieren
//    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        System.out.println(sb.append(null).length());
//    }
//----------------------------------------------------------------------------------------------------------------------
/*
* Variante 2
* Um den Compiler fehler zu beheben, können Sie eine explizite Typumwandlung durchführen, um dem Compiler zu helfen, die richtige append()-Methode auszuwählen.
* Da null für alle Typen gültig ist, müssen Sie dem Compiler mitteilen, welchen Typ Sie erwarten.
*
* Hier ist eine mögliche Lösung:
*
* Indem Sie (String) vor null hinzufügen, teilen Sie dem Compiler mit, dass Sie erwarten, dass null als String behandelt wird.
* */
    // Variante 2 | Korrekt | zum Testen auskommentieren
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append((String) null).length());  // <-- was kommt raus?
    }
//----------------------------------------------------------------------------------------------------------------------
}
