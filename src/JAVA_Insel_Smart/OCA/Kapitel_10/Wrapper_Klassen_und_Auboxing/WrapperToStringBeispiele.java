/*
Erklärung
------------------------------------------------------------------------------------------------------------------------
Erzeugen von Wrapper-Objekten: Wrapper-Objekte werden erstellt, um primitive Werte zu speichern.

Integer i = 42;
Double d = 3.14;
Boolean b = true;
------------------------------------------------------------------------------------------------------------------------
Konvertierung in String-Repräsentation: Die toString-Methode der Wrapper-Klassen wird verwendet,
um die enthaltenen Werte in Strings zu konvertieren.

String intString = i.toString();
String doubleString = d.toString();
String booleanString = b.toString();
------------------------------------------------------------------------------------------------------------------------
Ausgabe der String-Repräsentationen: Die String-Repräsentationen werden ausgegeben.

System.out.println("Integer als String: " + intString);
System.out.println("Double als String: " + doubleString);
System.out.println("Boolean als String: " + booleanString);
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_10.Wrapper_Klassen_und_Auboxing;

public class WrapperToStringBeispiele {
    public static void main(String[] args) {
        // Erzeugen von Wrapper-Objekten
        Integer i = 42;
        Double d = 3.14;
        Boolean b = true;

        // Konvertierung in String-Repräsentation
        String intString = i.toString(); // "42"
        String doubleString = d.toString(); // "3.14"
        String booleanString = b.toString(); // "true"

        // Ausgabe der String-Repräsentationen
        System.out.println("Integer als String: " + intString);
        System.out.println("Double als String: " + doubleString);
        System.out.println("Boolean als String: " + booleanString);
    }
}
