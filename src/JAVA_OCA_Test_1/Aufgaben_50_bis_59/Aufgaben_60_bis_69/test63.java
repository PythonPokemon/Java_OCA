/*
*
In diesem Code gibt es zwei Überladungsmethoden mit dem Namen m, eine für den int-Typ und eine für den char-Typ.

Wenn Sie m(i) aufrufen, wird die Methode m(int x) aufgerufen, da i vom Typ int ist. Der ASCII-Wert des Zeichens '5' ist 53, daher wird m(i) "int version" ausgeben.

Wenn Sie m('5') aufrufen, wird die Methode m(char x) aufgerufen, da der Wert '5' vom Typ char ist. Daher wird m('5') "char version" ausgeben.

Obwohl das Zeichen '5' als Zeichen konstant dargestellt ist, kann es in einem numerischen Kontext als Zahl verwendet werden. In diesem Fall wird es als ASCII-Wert behandelt, der dem numerischen Wert 53 entspricht.
* */

package JAVA_OCA_Test_1.Aufgaben_50_bis_59.Aufgaben_60_bis_69;

public class test63 {
    private static void m(int x) {
        System.out.println("int version");
    }

    private static void m(char x) {
        System.out.println("char version");
    }

    public static void main(String[] args) {
        int i = '5';
        m(i);
        m('5');
    }
}
