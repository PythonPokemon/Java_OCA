package TestAufgaben;

/* Code Beschreibung.
 * Es enthält zwei verschachtelte for-Schleifen.
 * Die äußere Schleife wird dreimal durchlaufen, da der Zähler "i" von 0 bis 2 geht (0, 1, 2).
 * Bei jedem Durchlauf wird der Zähler "count" auf 0 zurückgesetzt.
 * Die innere Schleife wird ebenfalls drei Mal durchlaufen, da der Zähler "j" von 3 bis 1 heruntergezählt wird.
 * In jedem Durchlauf der inneren Schleife wird überprüft, ob "i" gleich "j" ist.
 * Wenn dies der Fall ist, wird die Anweisung "break" ausgeführt, was bedeutet, dass die innere Schleife vorzeitig beendet wird.
 * Dabei wird auch der Zähler "count" um 1 erhöht.
 * In jedem Durchlauf der inneren Schleife wird "count" mit "System.out.print(count)" ausgegeben.
 * Allerdings wird die Anweisung "continue" verwendet, was bedeutet, dass der Rest des Schleifenkörpers übersprungen wird und die Schleife direkt zum nächsten Durchlauf springt.
 * Die Ausgabe dieses Programms wird also sein: "000". Das liegt daran, dass die äußere Schleife drei Mal durchlaufen wird und bei jedem Durchlauf der inneren Schleife "count" (der auf 0 gesetzt ist) dreimal ausgegeben wird, ohne dass sich "count" ändert, da die innere Schleife durch "continue" vorzeitig beendet wird.
 * */
public class LZK1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 3; j > 0; j--) {
                if (i == j) {
                    count++;
                    break;
                }
                System.out.print(count); // durlauf i 000 und j 000 = 000000
                continue;
            }
        }
    }
}
