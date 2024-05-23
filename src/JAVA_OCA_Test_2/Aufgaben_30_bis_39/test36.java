/*
Gesamterklärung
Boolescher Klassencode verwendet die Methode equalsIgnoreCase, um den übergebenen String zu validieren,
wenn also übergebener String "true" ist ('t', 'r', 'u' und 'e' können in jedem Fall sein),
dann ist der im Booleschen Objekt gespeicherte boolesche Wert true andernfalls false.

In dieser Frage übergeben String ist "ture" und nicht "true" und deshalb wird false auf die Konsole gedruckt.
false
 * */
package JAVA_OCA_Test_2.Aufgaben_30_bis_39;

public class test36 {
    public static void main(String[] args) {
        System.out.println(new Boolean("ture"));
    }
}
