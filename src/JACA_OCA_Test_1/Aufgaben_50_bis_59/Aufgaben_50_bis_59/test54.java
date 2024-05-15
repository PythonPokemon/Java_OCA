/*
* Zuerst wird der Wert von fruit, der in diesem Fall "mango" ist, überprüft.
* Da kein spezifisches case-Statement für "mango" vorhanden ist, wird die default-Klausel ausgeführt, die besagt: "ANY FRUIT WILL DO".
* Diese Klausel wird immer dann ausgeführt, wenn kein passendes case-Statement gefunden wird.
* Nachdem die default-Klausel ausgeführt wurde, beginnt die Ausführung von case-Statements von oben nach unten, ohne Unterbrechung.
* Da es kein break-Statement gibt, nachdem "MANGO" ausgegeben wurde, werden auch die folgenden case-Statements ("Banana" und "Apple") ausgeführt,
* unabhängig davon, ob sie mit dem Wert von fruit übereinstimmen oder nicht.
* Das break-Statement am Ende des "Banana"-Blocks wird jedoch erreicht, was dazu führt,
* dass die Switch-Anweisung beendet wird und die Ausführung des Codes daraus heraus erfolgt.
* */

package JACA_OCA_Test_1.Aufgaben_50_bis_59.Aufgaben_50_bis_59;

public class test54 {
    public static void main(String[] args) {
        String fruit = "mango";
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");   //<-- was kommt raus?
            break;
        }
    }
}
