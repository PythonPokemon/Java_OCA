package TestAufgaben;
/* Code Beschreibung.
* Das Programm überprüft, ob der Wert "Tom" im Array "cartoons" vorkommt, und inkrementiert den Zähler "counter", wenn "Tom" gefunden wird.
* Es prüft nacheinander die Elemente des Arrays und inkrementiert den Zähler nur einmal, selbst wenn "Tom" mehrmals vorkommt.
* Da "Tom" am Anfang des Arrays gefunden wird, wird der Zähler auf 1 erhöht.
* Danach werden keine weiteren Überprüfungen durchgeführt, da die Bedingungen der if-Abfragen sequenziell sind und nach der ersten Übereinstimmung keine weiteren Überprüfungen stattfinden.
* Deshalb wird die Ausgabe des Programms "1" sein.
* */
public class LZK4 {
    public static void main(String[] args) {
        String[] cartoons = {"Tom", "Jerry", "Micky", "Tom"};
        int counter = 0;

        if ("Tom".equals(cartoons[0])) {
            counter++;
        } else if ("Tom".equals(cartoons[1])){
            counter++;
        } else if ("Tom".equals(cartoons[2])){
            counter++;
        } else if ("Tom".equals(cartoons[3])){
            counter++;
        }
        System.out.println(counter);
    }
}
