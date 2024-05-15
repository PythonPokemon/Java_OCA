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

package JACA_OCA_Test_2.Aufgaben_20_bis_29;

//public class test28 {
//    public static void main(String[] args) {
//        int score = 60;
//        switch (score) {
//            default:
//                System.out.println("Not a valid score");
//            case score < 70:
//                System.out.println("Failed");
//                break;
//            case score >= 70:
//                System.out.println("Passed");
//                break;
//        }
//    }
//}
