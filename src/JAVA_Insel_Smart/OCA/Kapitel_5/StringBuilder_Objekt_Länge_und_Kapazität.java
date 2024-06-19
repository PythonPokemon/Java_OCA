/*
StringBuilder-Objekte haben eine variable Länge und Kapazität. Diese können erfragt und gesetzt werden.
* */
package JAVA_Insel_Smart.OCA.Kapitel_5;

public class StringBuilder_Objekt_Länge_und_Kapazität {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(50);

        int length = sb.length(); // 0
        int capacity = sb.capacity(); // 50

        // Varianten zum Erfragen von Ausgaben
        System.out.println(length);
        System.out.println(sb.length());

        System.out.println(capacity);
        System.out.println(sb.capacity());
    }
}
