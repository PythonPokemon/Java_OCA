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
package JAVA_Insel_Smart.Kapitel_1;

public class HalloWelt {
// public | öffentlich, bedeutet für alle zugänglich, muss sie auch, das dass die main methode ist um das Hauptprogramm
// zu starten.

// static | bedeutet statisch, alle aufrufe aus dieser Hauptmethode bleiben gleich.
// void | bedeutet es soll nur etwas aktualisiert oder protokolliert werden, man bekommt keinen rückgabewert zurück
// String | ist die Oberklasse der String Objekte und methoden die darin implementiert sind.
// args | sind variablen
    public static void main(String[] args) {
        System.out.println("Hallo Welt");
    }
}
