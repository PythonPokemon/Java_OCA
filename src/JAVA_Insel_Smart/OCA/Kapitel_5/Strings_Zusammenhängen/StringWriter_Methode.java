/*
Vorteile:
Nützlich, wenn Sie String-Manipulationen in Verbindung mit anderen IO-Operationen durchführen möchten.
------------------------------------------------------------------------------------------------------------------------
Nachteile:
Weniger gebräuchlich für einfache String-Verkettungen.
------------------------------------------------------------------------------------------------------------------------
Anwendungsfall:
Geeignet, wenn Sie Strings zusammenhängen und gleichzeitig andere IO-Operationen ausführen.
------------------------------------------------------------------------------------------------------------------------
* */
package JAVA_Insel_Smart.OCA.Kapitel_5.Strings_Zusammenhängen;

import java.io.StringWriter;

public class StringWriter_Methode {
    public static void main(String[] args) {
        String part1 = "Hello";
        String part2 = "World";
        StringWriter writer = new StringWriter(); // Verwenden des StringWriter aus der Standardbibliothek

        writer.append(part1).append(" ").append(part2);
        writer.write("!");

        System.out.println("Mit StringWriter: " + writer.toString()); // Ausgabe: "Hello World!"
    }
}
