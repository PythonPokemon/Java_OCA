package JAVA_Insel_Smart.OCA.Kapitel_5.Strings_Zusammenhängen;

public class Concat {
    public static void main(String[] args) {
        String part1 = "Hello";
        String part2 = "World";
        String result = part1.concat(" ").concat(part2); // verbindet Strings
        System.out.println("Mit concat(): " + result); // Ausgabe: "Hello World"
    }
}
