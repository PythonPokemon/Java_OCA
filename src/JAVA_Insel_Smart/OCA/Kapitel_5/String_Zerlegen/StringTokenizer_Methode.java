/*
Ja, in der Regel verwendet man für die Tokenisierung entweder eine Schleife oder eine bedingte Anweisung wie if-else
oder switch-case, um die einzelnen Tokens nacheinander zu extrahieren und zu verarbeiten.
Hier ist ein Beispiel, das eine einfache if-else-Anweisung verwendet,
um die ersten zwei Tokens aus einem String zu extrahieren:
* */

package JAVA_Insel_Smart.OCA.Kapitel_5.String_Zerlegen;
import java.util.StringTokenizer;

public class StringTokenizer_Methode {
    public static void main(String[] args) {
        String bezeichner = "Das ist ein Test.";
        StringTokenizer textAufteiler = new StringTokenizer(bezeichner);

        while (textAufteiler.hasMoreTokens()) {
            System.out.println(textAufteiler.nextToken());
        }
        // Ausgabe:
        // Das
        // ist
        // ein
        // Test.
    }
//----------------------------------------------------------------------------------------------------------------------
    // als IF_Else Methode
//public class StringTokenizer_Methode {
//    public static void main(String[] args) {
//        String bezeichner = "Das ist ein Test.";
//        StringTokenizer textAufteiler = new StringTokenizer(bezeichner);
//
//        // Beispiel mit if-else-Anweisung
//        String firstToken = getNextToken(textAufteiler);
//        String secondToken = getNextToken(textAufteiler);
//
//        System.out.println("Erstes Token: " + firstToken); // Ausgabe: "Das"
//        System.out.println("Zweites Token: " + secondToken); // Ausgabe: "ist"
//    }
//
//    // Methode, die das nächste Token zurückgibt
//    public static String getNextToken(StringTokenizer tokenizer) {
//        if (tokenizer.hasMoreTokens()) {
//            return tokenizer.nextToken();
//        } else {
//            return null; // oder eine geeignete Ausnahmebehandlung
//        }
//    }
//----------------------------------------------------------------------------------------------------------------------
    // als Switch_Case Methode
//public class StringTokenizer_Switch {
//    public static void main(String[] args) {
//        String bezeichner = "Das ist ein Test.";
//        StringTokenizer textAufteiler = new StringTokenizer(bezeichner);
//
//        for (int i = 0; i < 4; i++) {
//            String token = getNextToken(textAufteiler, i);
//            System.out.println("Token " + (i + 1) + ": " + token);
//        }
//    }
//
//    public static String getNextToken(StringTokenizer tokenizer, int tokenIndex) {
//        switch (tokenIndex) {
//            case 0:
//                return tokenizer.hasMoreTokens() ? tokenizer.nextToken() : null;
//            case 1:
//                return tokenizer.hasMoreTokens() ? tokenizer.nextToken() : null;
//            case 2:
//                return tokenizer.hasMoreTokens() ? tokenizer.nextToken() : null;
//            case 3:
//                return tokenizer.hasMoreTokens() ? tokenizer.nextToken() : null;
//            default:
//                return null;
//        }
//    }
}
