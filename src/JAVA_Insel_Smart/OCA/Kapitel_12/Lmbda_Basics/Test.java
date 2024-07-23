package JAVA_Insel_Smart.OCA.Kapitel_12.Lmbda_Basics;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> vornamen = new ArrayList<>();
        vornamen.add("Jens");
        vornamen.add("Tim");
        vornamen.add("Kim");
        vornamen.add("Harry");

        // Alle vornamen entfernen, die ein „T" enthalten
//        vornamen.removeIf( b -> b.contains("T"));

        // oder alternativ:
//        vornamen.removeIf( (String b) -> b.contains("T")    );

        // oder alternativ:
//        vornamen.removeIf(    (String b) -> {  return b.contains("T");  }       );

//        System.out.println(vornamen);
        // [Jens, Kim, Harry]
//----------------------------------------------------------------------------------------------------------------------

    }
}