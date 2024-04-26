package LF11aV2_LZK_JAVA;

/* Code Beschreibung.
 * Das Java-Programm definiert eine Schleife, die unendlich oft ausgeführt wird und Einsen ausgibt, solange bestimmte Bedingungen erfüllt sind.
 * Die Variable "i" wird auf den Wert 1 initialisiert.
 * Die do-while-Schleife wird gestartet und führt die folgenden Schritte aus:
 * Zuerst wird überprüft, ob "i" durch 2 teilbar ist (dh ob "i" gerade ist).
 * Wenn ja, wird die "continue"-Anweisung ausgeführt, die bewirkt, dass der Rest der Schleife übersprungen wird und die nächste Iteration beginnt.
 * Wenn "i" nicht durch 2 teilbar ist, wird überprüft, ob "i" den Wert 5 erreicht hat.
 * Wenn ja, wird die "break"-Anweisung ausgeführt, die die Schleife beendet.
 * Wenn weder "continue" noch "break" ausgeführt wird, wird "i" ausgegeben.
 * Da die Schleife mit "true" bedingt ist, wird sie unendlich oft ausgeführt.
 * Das bedeutet, dass in jeder Iteration der Schleife "i" ausgegeben wird, es sei denn, "i" ist gerade oder hat den Wert 5 erreicht.
 * Da keine Anweisung die Schleife beendet, wird sie unendlich oft ausgeführt und unendlich viele Einsen ausgeben.
 * .
 * Die Ausgabe dieses Programms wird also eine endlose Folge von Einsen sein.
 */
public class LZK12 {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 2 == 0) continue;
            if (i == 5) break;
            System.out.print(i + "");
        } while (true);
    }
}