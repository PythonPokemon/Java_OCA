/*
Erklärung
Ausnahmebehandlung mit try-catch-Block:

Die Methode leseDatei enthält einen try-catch-Block, der die FileNotFoundException direkt innerhalb der Methode behandelt.
Wenn die Datei nicht gefunden wird, gibt die Methode eine Fehlermeldung aus.
------------------------------------------------------------------------------------------------------------------------
Regeln und Best Practices
Behandeln von geprüften Ausnahmen:

Da FileNotFoundException eine geprüfte Ausnahme ist, muss sie entweder mit einem try-catch-Block behandelt oder
in der Methodensignatur mit throws deklariert werden.
------------------------------------------------------------------------------------------------------------------------
Verwendung von try-catch-Block:

Verwenden Sie try-catch-Blöcke, um Ausnahmen direkt innerhalb der Methode zu behandeln.
Dies ist sinnvoll, wenn die Methode in der Lage ist, die Ausnahme zu behandeln
oder eine spezifische Fehlerbehandlung durchzuführen.
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Checked_Exceptions.FileNotFoundException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Ausnahmebehandlung mit try-catch-Block

public class FileNotFoundExceptionMitTryCatch {
    public static void main(String[] args) {
        leseDatei("nicht_existierende_datei.txt");
    }

    public static void leseDatei(String dateiName) {
        try {
            Scanner scanner = new Scanner(new File(dateiName));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fehler: Datei nicht gefunden.");
        }
    }
}
