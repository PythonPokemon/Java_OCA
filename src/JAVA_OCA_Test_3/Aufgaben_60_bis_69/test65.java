/*
11 : !

Gesamterklärung
Die String-Klasse hat die Methode length(), die die Anzahl der Zeichen im String zurückgibt. Die Methode length() gibt also 11 zurück.

Die String-Klasse verfügt über die Methode charAt(int index), die das Zeichen beim übergebenen Index zurückgibt.
str.charAt(10) sucht nach Zeichen bei Index 10. Index beginnt mit 0. ! Das Vorzeichen ist bei Index 10.
wenn 9 dann wäre es s

Daher ist die Ausgabe: 11 : !
 * */
package JAVA_OCA_Test_3.Aufgaben_60_bis_69;

public class test65 {
    public static void main(String[] args) {
        String str = "Java Rocks!";
        System.out.println(str.length() + " : " + str.charAt(10));
    }
}
