/*
Zeichenfolgen
Eine Zeichenfolge ist eine geordnete Sammlung von Zeichen,
die in Java als char-Array oder als String-Objekt dargestellt werden kann.
Java bietet drei Hauptklassen zur Verwaltung von Zeichenfolgen:
String, StringBuilder und StringBuffer.
Sie unterscheiden sich in ihrer Immutabilität und Thread-Sicherheit.
------------------------------------------------------------------------------------------------------------------------
Klasse          Eigenschaft
------------------------------------------------------------------------------------------------------------------------
String	        Immutable, threadsicher
StringBuilder	Mutable, nicht threadsicher
StringBuffer	Mutable, threadsicher
------------------------------------------------------------------------------------------------------------------------
Die Klasse String und ihre Methoden
String-Literale als String-Objekte für konstante Zeichenketten
String-Literale (Zeichenketten in doppelten Anführungszeichen) werden in Java automatisch als String-Objekte behandelt.
* */
package JAVA_Insel_Smart.Kapitel_5;

public class ZeichenfolgenStrings {
    public static void main(String[] args) {
        String str = "Charlie Hebdo";
        int zeichenLänge = str.length(); // 13

        System.out.println(str);
        System.out.println(zeichenLänge);

    }
}
