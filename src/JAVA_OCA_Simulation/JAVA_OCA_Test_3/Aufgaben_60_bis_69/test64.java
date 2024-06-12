/*
In Java sind int und Integer zwar miteinander verwandt, aber sie sind nicht dasselbe. Hier sind die Hauptunterschiede:

Primitive Datentypen vs. Objekte:
int ist ein primitiver Datentyp in Java, der verwendet wird, um ganze Zahlen zu speichern.
Integer ist eine Wrapper-Klasse, die das primitive int in ein Objekt kapselt.
------------------------------------------------------------------------------------------------------------------------
Speicherung und Speicherplatz:
int-Variablen speichern den Wert direkt in den Speicher.
Integer-Objekte speichern eine Referenz auf ein Objekt, das den Wert hält.
------------------------------------------------------------------------------------------------------------------------
Null-Werte:
int kann keinen Nullwert haben. Es hat immer einen Standardwert von 0, wenn es nicht initialisiert wird.
Integer kann den Wert null haben, da es sich um ein Objekt handelt.
Dies kann nützlich sein, um fehlende oder nicht zugewiesene Werte darzustellen.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_60_bis_69;

public class test64 {
    public static void main(String[] args) {
        final int i1 = 1;           // true
        final Integer i2 = 1;       // false weil Integer
        final String s1 = ":ONE";

        String str1 = i1 + s1;
        String str2 = i2 + s1;

        System.out.println(str1 == "1:ONE");
        System.out.println(str2 == "1:ONE");
    }
}
