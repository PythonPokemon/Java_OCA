package Java_Anfänger_zum_Profi.ImperativeSprachkonstrukte;
/*
* Mehrere unabhängige Bedingungen:
* Wenn du if-Statements verwendet, wie im vorliegenden Code, werden beide Bedingungen separat geprüft, unabhängig voneinander.
* Das bedeutet, dass beide Blöcke von Code ausgeführt werden können, wenn ihre jeweiligen Bedingungen erfüllt sind.
* In diesem Fall können beide Bedingungen wahr sein und daher beide Blöcke von Code ausgeführt werden.
*
Exklusive Bedingungen:
* Wenn du else if verwendest, wird nur der Block des ersten if-Statements ausgeführt, dessen Bedingung wahr ist.
* Wenn eine der Bedingungen wahr ist, werden die nachfolgenden else if- und else-Blöcke übersprungen.
* Dies ermöglicht eine exklusive Auswahl zwischen den verschiedenen Bedingungen.
* */
public class IfStatement {
    public static void main(String[] args) {
        // bei IF muss immer eine bedingung wahr oder falsch sein = Boolean wert
        System.out.println("Bitte trage den Wert für 'a' ein: ");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.println("Bitte trage den Wert für 'b' ein: ");
        int b = new java.util.Scanner(System.in).nextInt();
        int area = a * b;

        if (area > 10_000) {
            System.out.println(area + " größer als 10.000");
        }
        if (area < 10_000) {
            System.out.println(area + " kleiner als 10.000");
        }
    }
}
