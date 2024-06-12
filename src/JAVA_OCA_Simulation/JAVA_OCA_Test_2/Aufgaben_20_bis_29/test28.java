/*
 * Gesamterklärung
case-Werte müssen den gleichen Typ/kompatiblen Typ ergeben, den der switch-Ausdruck verwenden kann.

switch-Ausdruck kann Folgendes akzeptieren:

char oder Zeichen,

Byte oder Byte,

kurz oder kurz,

int oder Integer,

Eine Enumeration nur ab Java 6,

Ein String-Ausdruck nur aus Java 7.
In diesem Fall ist der switch-Ausdruck [switch (score)] vom Typ int.

Aber case-Ausdrücke, score < 70 und score >= 70 sind boolescher Typ und daher Kompilierungsfehler.
 * */

package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_20_bis_29;

// Comnpiler Fehler | bedingte Ausdrücke wie <, <=, >, >= usw. sind f. switch-case nicht erlaubt!
//public class test28 {
//    public static final int score = 60;
//    public static void main(String[] args) {
//        int score = 60;
//        switch (score) {
//            default:
//                System.out.println("Not a valid score");
//            case score < 70:            // bedingte Ausdrücke wie <, <=, >, >= usw. sind f. switch-case nicht erlaubt!
//                System.out.println("Failed");
//                break;
//            case score >= 70:
//                System.out.println("Passed");
//                break;
//        }
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
public class test28 {
    public static final int SCORE = 70;

    public static void main(String[] args) {
        int score = 60;

        switch (score) {
            default:
                System.out.println("Not a valid score");
                break;
            case 0: // Dummy case to ensure a valid constant case, which won't be used
                break;
            case SCORE - 10:
                System.out.println("Failed");
                break;
            case SCORE:
                System.out.println("Passed");
                break;
        }
    }
}
