/*
Number version

Gesamterklärung
Es gibt 3 überladene Methode m. Beachten Sie, dass alle numerischen Wrapperklassen (Byte, Short, Integer, Long, Float und Double)
von Number und Number von Object erweitert werden.
Der Compiler führt entweder implizite Umwandlung oder Wrapping durch, aber nicht beides.
 1 ist int-Literal, der Java-Compiler kann es nicht implizit in double umwandeln und dann in Double boxen,
 sondern es boxt i in Integer, und da Number die unmittelbare Superklasse von Integer ist, bezieht sich die Number-Version auf das Integer-Objekt.
Die Nummernversion ist auf der Konsole aufgedruckt.
 * */
package JAVA_OCA_Test_3.Aufgaben_60_bis_69;

public class test63 {
    public static void main(String[] args) {
        m(1);
    }

    private static void m(Object obj) {
        System.out.println("Object version");
    }

    private static void m(Number obj) {
        System.out.println("Number version");
    }

    private static void m(Double obj) {
        System.out.println("Double version");
    }
}
