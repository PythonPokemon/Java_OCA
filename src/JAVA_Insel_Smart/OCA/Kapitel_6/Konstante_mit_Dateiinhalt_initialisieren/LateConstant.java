/*
Erklärung:
Überprüfen der Ressource:

LateConstant.class.getResourceAsStream("/hubble-constant.txt")
sucht nach der Datei im Wurzelverzeichnis des Klassenpfads. Dies scheint korrekt zu sein,
da die Datei im src-Verzeichnis liegt.
------------------------------------------------------------------------------------------------------------------------
Null-Überprüfung:
Der Code überprüft, ob der scanner nicht null ist und ob ein Integer-Wert aus der Datei gelesen werden kann.

Fehlerbehandlung:
Wenn die Ressource nicht gefunden wird oder der Inhalt ungültig ist,
wird eine Ausnahme geworfen und im Catch-Block behandelt.
Stellen Sie sicher, dass die Datei hubble-constant.txt tatsächlich eine gültige Integer-Zahl enthält.
Wenn die Datei nur die Zahl 77 enthält, sollte der Code funktionieren.

Falls weiterhin Probleme auftreten, überprüfen Sie die Datei und stellen Sie sicher,
dass sie korrekt im Klassenpfad vorhanden ist und lesbare Inhalte enthält.
* */

package JAVA_Insel_Smart.OCA.Kapitel_6.Konstante_mit_Dateiinhalt_initialisieren;

import java.io.InputStream;
import java.util.Scanner;

public class LateConstant {
    public final static int HUBBLE;
    public final String ISBN;

    static {
        int hubbleValue = 0;
        try (InputStream is = LateConstant.class.getResourceAsStream("/hubble-constant.txt");
             Scanner scanner = new Scanner(is)) {
            if (scanner != null && scanner.hasNextInt()) {
                hubbleValue = scanner.nextInt();
            } else {
                throw new RuntimeException("Resource not found or invalid content: /hubble-constant.txt");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        HUBBLE = hubbleValue;
    }

    public LateConstant() {
        ISBN = "3572100100";
    }

    public static void main(String[] args) {
        System.out.println(HUBBLE);                      // Erwartete Ausgabe: 77
        System.out.println(new LateConstant().ISBN);     // Ausgabe: 3572100100
    }
}
