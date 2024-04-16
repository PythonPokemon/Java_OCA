/**
 * Lernziel:
 * - switch-case
 * - default
 * - Durchfallen
 * - Stack-Case-Labels
 */
public class SwitchCaseStatement {
    public static void main(String[] args) {

        int random = (int) (Math.random() * 3); // 0, 1, 2
        switch (random) {
            case 0:
                System.out.println("rot " + random);
                break;
            case 1:
                System.out.println("grün " + random);
                break;
            case 2:
                System.out.println("blau " + random);
                break;
        }

// String Fallunterscheidung, Reihenfolge egal, wenn etwas zutreffend ist, wird ab da abgebrochen!
        String input = "Schokolade";
        switch (input) {
            case "Schokolade":
                System.out.println("Schoki");
                break;
            case "Eise":
            case "Ice":
                System.out.println("Eis");
                break;
            default:
                System.out.println("Etwas anderes, ist das Essbar");
        }
    }
}

