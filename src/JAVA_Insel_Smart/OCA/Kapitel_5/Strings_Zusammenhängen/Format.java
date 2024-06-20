package JAVA_Insel_Smart.OCA.Kapitel_5.Strings_Zusammenhängen;

public class Format {
    public static void main(String[] args) {
        String part1 = "Hello";
        String part2 = "World";
        String result = String.format("%s %s", part1, part2);
        System.out.println("Mit String.format(): " + result); // Ausgabe: "Hello World"
    }
}
