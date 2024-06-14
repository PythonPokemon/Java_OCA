/*
Der Einstiegspunkt eines Java-Programms ist die main-Methode.
Diese Methode hat die Signatur public static void main(String[] args) und wird von der JVM aufgerufen,
um das Programm zu starten.

print(…), println(…) und printf(…) für Bildschirmausgaben
------------------------------------------------------------------------------------------------------------------------
Ausdrucksanweisung

Eine Ausdrucksanweisung ist ein Ausdruck, der in eine Anweisung umgewandelt wird,
indem ein Semikolon (;) hinzugefügt wird. Beispiel:

int summe = 1 + 2;
------------------------------------------------------------------------------------------------------------------------
Modifizierer

Modifizierer sind Schlüsselwörter, die die Sichtbarkeit und das Verhalten von Klassen, Methoden und Variablen ändern.
Beispiele für Modifizierer sind: public, private, protected und static.
* */
package JAVA_Insel.Kapitel_2;

public class HalloWelt {
    public static void main(String[] args) {
        System.out.println("Hallo Welt");
    }
}
