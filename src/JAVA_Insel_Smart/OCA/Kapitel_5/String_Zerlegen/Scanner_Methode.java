/*
Erklärung:
Scanner für die Eingabezeile: Der erste Scanner liest eine Zeile von der Konsole.
Trennzeichen festlegen: Ein zweiter Scanner wird erstellt, um die eingegebene Zeile zu analysieren,
und das Trennzeichen wird auf ein oder mehrere Leerzeichen (\\s+) gesetzt.

Wörter zählen: Eine Schleife zählt die Anzahl der Wörter in der Zeile.
Schließen der Scanner: Beide Scanner werden nach der Benutzung geschlossen, um Ressourcen freizugeben.
Dies ist ein einfaches Beispiel, das zeigt, wie man mit dem Scanner Text aus der Konsole liest
und die Anzahl der Wörter in der eingegebenen Zeile zählt.
* */
package JAVA_Insel_Smart.OCA.Kapitel_5.String_Zerlegen;
import java.util.Scanner;

public class Scanner_Methode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zeile ein:");
        String line = scanner.nextLine();

        // Erstellen eines neuen Scanners für die Eingabezeile und Festlegen des Trennzeichens
        Scanner lineScanner = new Scanner(line);
        lineScanner.useDelimiter("\\s+"); // Verwenden von Leerzeichen als Trennzeichen

        int wordCount = 0;
        while (lineScanner.hasNext()) {
            lineScanner.next();
            wordCount++;
        }

        System.out.println("Anzahl der Wörter: " + wordCount);

        // Schließen der Scanner
        lineScanner.close();
        scanner.close();
    }
}
