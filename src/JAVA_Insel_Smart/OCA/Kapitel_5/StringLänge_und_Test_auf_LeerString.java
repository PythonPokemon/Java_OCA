/*
 String-Länge und Test auf Leer-String
Die Länge eines Strings kann mit der Methode length() ermittelt werden,
und ein Leer-String wird durch Vergleichen mit "" überprüft.
* */
package JAVA_Insel_Smart.OCA.Kapitel_5;

public class StringLänge_und_Test_auf_LeerString {
    public static void main(String[] args) {
        String empty = "";
        boolean isEmpty = empty.length() == 0; // true

        System.out.println(empty); // nichts, weil kein zeichen vorhanden ist
        System.out.println(isEmpty); // true weil prüfung nach wahrheitswert
    }
}
