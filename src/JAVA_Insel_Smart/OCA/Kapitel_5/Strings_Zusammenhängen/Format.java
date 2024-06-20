/*
Vorteile:
Sehr lesbar und flexibel.
Gut geeignet für komplexere String-Formatierungen.
------------------------------------------------------------------------------------------------------------------------
Nachteile:
Kann etwas langsamer sein als andere Methoden.
------------------------------------------------------------------------------------------------------------------------
Anwendungsfall:
Ideal, wenn Sie Strings mit spezifischen Formatierungen zusammenfügen müssen (z.B. Zahlen mit Dezimalstellen).
* */
package JAVA_Insel_Smart.OCA.Kapitel_5.Strings_Zusammenhängen;

public class Format {
    public static void main(String[] args) {
        String part1 = "Hello";
        String part2 = "World";
        String result = String.format("%s %s", part1, part2);
        System.out.println("Mit String.format(): " + result); // Ausgabe: "Hello World"
    }
}
