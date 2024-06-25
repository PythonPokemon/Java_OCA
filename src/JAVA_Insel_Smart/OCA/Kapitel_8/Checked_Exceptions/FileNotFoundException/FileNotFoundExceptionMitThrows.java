/*
Ausnahmebehandlung mit throws in der Methodensignatur:

Die Methode leseDatei deklariert throws FileNotFoundException in ihrer Signatur und behandelt die Ausnahme nicht direkt.
Die Ausnahme wird an die aufrufende Methode (main) weitergeleitet.
Die main-Methode enthält einen try-catch-Block, um die FileNotFoundException zu behandeln,
wenn die Datei nicht gefunden wird.
------------------------------------------------------------------------------------------------------------------------
Regeln und Best Practices
Behandeln von geprüften Ausnahmen:

Da FileNotFoundException eine geprüfte Ausnahme ist, muss sie entweder mit einem try-catch-Block behandelt
oder in der Methodensignatur mit throws deklariert werden.
------------------------------------------------------------------------------------------------------------------------
Verwendung von throws in der Methodensignatur:

Verwenden Sie throws in der Methodensignatur, um Ausnahmen an die aufrufende Methode weiterzuleiten.
Dies ist sinnvoll, wenn die Methode die Ausnahme nicht selbst behandeln kann oder will
und die aufrufende Methode besser in der Lage ist, die Ausnahme zu behandeln.
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Checked_Exceptions.FileNotFoundException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Ausnahmebehandlung mit throws in der Methodensignatur

public class FileNotFoundExceptionMitThrows {
    public static void main(String[] args) {
        try {
            leseDateiMethode("nicht_existierende_datei.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Fehler: Datei nicht gefunden.");
        }
    }

    public static void leseDateiMethode(String dateiName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(dateiName));

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
