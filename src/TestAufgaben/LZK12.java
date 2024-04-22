package TestAufgaben;
/**
 * Es werden unendlich oft einsen ausgegeben
 * Es wird zuerst überprüft, ob i den Wert 5 erreicht hatund die Schleife wird beendet, falls dies der Fall ist.
 * Dann wird überprüft, ob i eine gerade Zahl ist.
 * Wenn ja, wird die continue Anweisung ausgeführt und der Rest der Schleife übersprungen.
 * Andernfalls wird die aktuelle Zahl ausgegeben. = also unendlich 1
 *  */
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