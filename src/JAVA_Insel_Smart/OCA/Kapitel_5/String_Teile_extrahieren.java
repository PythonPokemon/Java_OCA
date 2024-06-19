package JAVA_Insel_Smart.OCA.Kapitel_5;

public class String_Teile_extrahieren {
    public static void main(String[] args) {
        // 5.4.8 String-Teile extrahieren
        // die Methoden substring(int beginIndex) und substring(int beginIndex, int endIndex)
        // extrahieren Teile eines Strings.
        String sub = "Hello".substring(1, 4); // "ell"  start 1 und end 4 Index
        System.out.println(sub);
//----------------------------------------------------------------------------------------------------------------------
        // Ursprünglicher String
        String str = "Java Programmierung";

        // Teilstring extrahieren ab einem bestimmten Index
        String teil1 = str.substring(5); // ab Index 5 bis zum Ende des Strings
        System.out.println("Teilstring ab Index 5: " + teil1); // Ausgabe: "Programmierung"

        // Teilstring extrahieren zwischen zwei Indizes
        String teil2 = str.substring(5, 15); // von Index 5 bis (aber ohne) Index 15
        System.out.println("Teilstring von Index 5 bis 15: " + teil2); // Ausgabe: "Programmier"
    }
}
