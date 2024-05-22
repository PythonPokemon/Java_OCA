/*
Gesamterklärung
Boolescher Klassencode verwendet die Methode equalsIgnoreCase, um den übergebenen String zu validieren,
wenn also übergebener String "true" ist ('t', 'r', 'u' und 'e' können in jedem Fall sein),
dann ist der im Booleschen Objekt gespeicherte boolesche Wert true andernfalls false.

b1 speichert true, b2 speichert false, b3 speichert false und da b4 vom Referenztyp ist, kann es auch null speichern.

Ausgabe ist: true:false:false:null

= alles was nicht true ist, ist false
oder null wenn mit null initialisiert
 * */

package JAVA_OCA_Test_2.Aufgaben_10_bis_19;

public class test18 {
    public static void main(String[] args) {
        Boolean b1 = new Boolean("tRuE");
        Boolean b2 = new Boolean("fAlSe");
        Boolean b3 = new Boolean("false");
        Boolean b4 = null;
        System.out.println(b1 + ":" + b2 + ":" + b3 + ":" + b4);
    }
}
