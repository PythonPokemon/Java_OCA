/*
Syntax (parameters) -> { statements }:
------------------------------------------------------------------------------------------------------------------------
Wird verwendet, wenn die Lambda-Funktion mehrere Anweisungen enthält.
Hier müssen explizit return-Anweisungen verwendet werden, wenn etwas zurückgegeben werden soll.

Beispiel:
(name) -> { String message = "Hello, " + name + "!"; System.out.println(message); }
Greeter greeter = (name) -> { String message = "Hello, " + name + "!"; System.out.println(message); };:

Lambda-Ausdruck, der einen Parameter name nimmt, eine Nachricht zusammenstellt und diese ausgibt.
------------------------------------------------------------------------------------------------------------------------
Zusammenfassung
Keine return-Anweisung notwendig: Wenn die Methode void ist, wie im Greeter-Beispiel.
return-Anweisung notwendig: Wenn die Methode einen Wert zurückgibt, wie im StringManipulator-Beispiel.
Die Notwendigkeit einer return-Anweisung hängt also davon ab, ob die Methode, die der Lambda-Ausdruck implementiert,
einen Rückgabewert hat oder nicht.
------------------------------------------------------------------------------------------------------------------------
Nutzen von Lambda

Funktionen als Argumente an andere Funktionen übergeben, von Funktionen zurückgegeben
und in Variablen gespeichert werden können
------------------------------------------------------------------------------------------------------------------------
 * */

package JAVA_Insel_Smart.OCA.Kapitel_12;

// Funktionales Interface für Begrüßung mit exact einer methode
@FunctionalInterface
interface GrüßeAusrichten {
    // methode ohne rückgabewert (Datentyp, Parameter)
    void begrüßer(String name);
}

public class Lambda_Syntax_Parameter_Statements {

    public static void main(String[] args) {

        // Lambda-Ausdruck, der eine Nachricht ausgibt
        GrüßeAusrichten grüßeAusrichten = (name) -> {
            String nachricht = "Hello, " + name + "!";
            System.out.println(nachricht);
        };

        // Verwenden des Lambda-Ausdrucks
        grüßeAusrichten.begrüßer("Alice");
    }
}
