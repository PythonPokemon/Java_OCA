/*
Vorteile:
Sehr effizient für viele und/oder lange Strings.
StringBuffer ist synchronisiert und damit thread-sicher; StringBuilder ist schneller, aber nicht thread-sicher.
------------------------------------------------------------------------------------------------------------------------
Nachteile:
Etwas umständlicher zu verwenden als der Plus-Operator oder concat.
------------------------------------------------------------------------------------------------------------------------
Anwendungsfall:
Ideal für viele Verkettungsoperationen oder in Schleifen.
Verwenden Sie StringBuilder für Single-Threaded-Kontexte und StringBuffer für Multi-Threaded-Kontexte.
* */

package JAVA_Insel_Smart.OCA.Kapitel_5.Strings_Zusammenhängen;

public class StringBuilder_und_StringBuffer {
    public static void main(String[] args) {
        String part1 = "Hello";
        String part2 = "World";

        // Verwendung von StringBuilder
        StringBuilder sb = new StringBuilder("Objekt: ");
        sb.append(part1).append(" ").append(part2);
        System.out.println("Mit StringBuilder: " + sb.toString()); // Ausgabe: "Hello World"

        // Verwendung von StringBuffer
        StringBuffer sbuf = new StringBuffer();
        sbuf.append(part1).append(" ").append(part2);
        System.out.println("Mit StringBuffer: " + sbuf.toString()); // Ausgabe: "Hello World"
    }
}
