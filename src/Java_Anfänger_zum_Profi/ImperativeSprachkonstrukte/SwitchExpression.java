package Java_Anfänger_zum_Profi.ImperativeSprachkonstrukte;

/**
 * Lernziel: switch - Ausdrücke
 * Gibt etwas zurück anstatt nur eine anweisung durchzuführen
 */

public class SwitchExpression {

    public static void main(String[] args) {

        String operator = "+";
        String s = switch (operator) {
            case "+" -> {
                System.out.println("Hier bin ich");
                yield "Plus";
            }
            case "-" -> "Minus";
            case "X", "*" -> "Mal";
            default -> "unbekannter Operator";
        };
        System.out.println(s);
    }

}
