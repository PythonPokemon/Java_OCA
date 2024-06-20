/*
Vorteile:
Einfach und intuitiv zu verwenden.
Gut für wenige und kleine Strings.
------------------------------------------------------------------------------------------------------------------------
Nachteile:
Unperformant bei vielen oder langen Strings,
da für jede Verkettung ein neuer String erstellt wird (Immutabilität von Strings).
------------------------------------------------------------------------------------------------------------------------
Anwendungsfall:
Geeignet für einfache und kurze String-Verkettungen.
* */

package JAVA_Insel_Smart.OCA.Kapitel_5.Strings_Zusammenhängen;

public class Plus_Operator {
    public static void main(String[] args) {
        String part1 = "Hello";
        String part2 = "World";
        String result = part1 + " " + part2;// addiert String Elemente
        System.out.println("Mit Plus-Operator: " + result); // Ausgabe: "Hello World"
    }
}
