package JAVA_Insel_Smart.OCA.Kapitel_5.String_Zerlegen;
import java.util.stream.Stream;

public class Lines_von_String {
    public static void main(String[] args) {
        String text = "Erste Zeile\nZweite Zeile\nDritte Zeile";
        Stream<String> lines = text.lines();
        lines.forEach(System.out::println);
        // Ausgabe:
        // Erste Zeile
        // Zweite Zeile
        // Dritte Zeile
    }
}
