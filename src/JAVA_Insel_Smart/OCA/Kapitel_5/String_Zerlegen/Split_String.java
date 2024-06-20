package JAVA_Insel_Smart.OCA.Kapitel_5.String_Zerlegen;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Split_String {
    public static void main(String[] args) {
        String path = "www.tutego.com";
        String[] segs = path.split(Pattern.quote("."));
        System.out.println(Arrays.toString(segs)); // Ausgabe: [www, tutego, com]

        String sentence = "Hört es euch an, denn das ist mein Gedudel!";
        int nrOfWords = sentence.split("(\\s|\\p{Punct})+").length;
        System.out.println("Anzahl der Wörter: " + nrOfWords); // Ausgabe: 9
    }
}
