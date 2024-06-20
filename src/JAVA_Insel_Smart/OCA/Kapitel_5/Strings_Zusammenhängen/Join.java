package JAVA_Insel_Smart.OCA.Kapitel_5.Strings_Zusammenhängen;
import java.util.StringJoiner;

public class Join {
    public static void main(String[] args) {
        String part1 = "Hello";
        String part2 = "World";

        // Verwendung von String.join()
        String result = String.join(" ", part1, part2);
        System.out.println("Mit String.join(): " + result); // Ausgabe: "Hello World"

        // Verwendung von StringJoiner
        StringJoiner joiner = new StringJoiner(" ");
        joiner.add(part1).add(part2);
        System.out.println("Mit StringJoiner: " + joiner.toString()); // Ausgabe: "Hello World"
    }
}
