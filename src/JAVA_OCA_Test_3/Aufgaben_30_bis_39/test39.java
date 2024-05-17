/*
[true]

Gesamterklärung
list.add(true); => Auto-Boxing konvertiert das boolesche Literal true in eine boolesche Instanz, die true enthält.
Element bei Index 0 steht für true.

Boolescher Klassencode verwendet die Methode equalsIgnoreCase, um den übergebenen String zu validieren,
wenn also übergebener String "true" ist ('t', 'r', 'u' und 'e' können in jedem Fall sein),
dann ist der im Booleschen Objekt gespeicherte boolesche Wert true andernfalls false.

list.add(new Boolean("tRue")); => Element bei Index 1 steht für true.
list.add(new Boolean("abc")); => Element bei Index 2 steht für false.
Die anfängliche Liste enthält also [true, true, false].

Da eine generische Liste verwendet wird, entfernt list.remove(1) die unter Index 1 gespeicherte boolesche Instanz (true)
und gibt sie zurück. Nach diesem Vorgang enthält die Liste [true, false].

Für den booleschen Ausdruck von if-block extrahiert die Java-Laufzeit den gespeicherten booleschen Wert mit der Methode booleanValue(),
die true zurückgibt.
Die Kontrolle geht in den if-Block und führt list.remove(1) aus; Dadurch wird das Element an Index 1 entfernt,
sodass nach diesem Vorgang die Liste [true] enthält und [true] auf der Konsole ausgegeben wird.

 * */
package JAVA_OCA_Test_3.Aufgaben_30_bis_39;
import java.util.ArrayList;
import java.util.List;

public class test39 {
    public static void main(String[] args) {
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(new Boolean("tRue"));
        list.add(new Boolean("abc"));

        if(list.remove(1)) {
            list.remove(1);
        }

        System.out.println(list);
    }
}
