/*
Die Methode contains in Java wird verwendet, um zu überprüfen, ob eine bestimmte Zeichenfolge (Substring)
innerhalb einer anderen Zeichenfolge (String) enthalten ist.

Sie gibt einen boolean-Wert zurück: true, wenn die Zeichenfolge das Substring enthält, und false, wenn nicht.
------------------------------------------------------------------------------------------------------------------------
bedeutet das, wenn ich das richtig verstanden habe, dass 'b' Lambda als Platzhalter übergeben wird
um darin das Objekt String "Tim" aus der Arraylist zu übergeben, wenn der substring aus der liste "T"
durch die contains methode true ergibt? JA
------------------------------------------------------------------------------------------------------------------------
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
        // Definiere ein Predicate, das prüft, ob ein String das Zeichen "T" enthält
        Predicate<String> p = (String b) -> {return b.contains("T");};// wenn true wird der wert an 'b' übergeben

        // for schleife mit einer geschachtelten If Boolean anweisung
        // Iteriere über die Liste und teste jedes Element mit dem Predicate
        for (String str : vornamen) {
            if (p.test(str) != true) {  // wenn == true "Tim" | wenn != untrue/false "alle andren aus der ArrayListe"
                System.out.println(str);   // gibt nur die aus, die den Substring 'T' nicht enthalten: Jens, Kim, Harry
            }
        }

    }
}
