/*
Vorteile:
Sehr mächtig für komplexe String-Manipulationen, insbesondere mit regulären Ausdrücken.
------------------------------------------------------------------------------------------------------------------------
Nachteile:
Komplexer und schwerer zu lesen.
------------------------------------------------------------------------------------------------------------------------
Anwendungsfall:
Ideal für Textverarbeitung, die reguläre Ausdrücke und komplexe Ersetzungen erfordert.
* */
package JAVA_Insel_Smart.OCA.Kapitel_5.Strings_Zusammenhängen;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Besondere_appendXXX_methode {
    public static void main(String[] args) {
        String input = "Hello 123 World";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, "456"); // zahlen werden gesucht und verändert
        }
        matcher.appendTail(result);

        System.out.println("Mit appendReplacement(): " + result.toString()); // Ausgabe: "Hello 456 World"
    }
}
