/*
Die Methode contains in Java wird verwendet, um zu überprüfen, ob eine bestimmte Zeichenfolge (Substring)
innerhalb einer anderen Zeichenfolge (String) enthalten ist.

Sie gibt einen boolean-Wert zurück: true, wenn die Zeichenfolge das Substring enthält, und false, wenn nicht.
* */

package JAVA_Insel_Smart.OCA.Kapitel_12.Lmbda_Basics;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Lambda_Predicate {
    public static void main(String[] args) {
        ArrayList<String> vornamen = new ArrayList<>();
        vornamen.add("Jens");
        vornamen.add("Tim");
        vornamen.add("Kim");
        vornamen.add("Harry");

        // Lambda ausführliche schreibweise mit Typ, klammern und return und semikolon.
        Predicate<String> p = (String b) -> {return b.contains("T");};// wenn true wird der wert an 'b' übergeben

        // for schleife mit einer geschachtelten If Boolean anweisung
        for (String str : vornamen) {
            if (p.test(str) != true) {  // wenn == true "Tim" | wenn != untrue/false "alle andren aus der ArrayListe"
                System.out.println(str);   // gibt nur die aus, die den Substring 'T' nicht enthalten: Jens, Kim, Harry
            }
        }

    }
}
