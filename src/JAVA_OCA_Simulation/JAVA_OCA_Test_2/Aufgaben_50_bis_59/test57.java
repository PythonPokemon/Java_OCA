/*
 * .NullPointerException
 *
 * Gesamterklärung
add(10.0, null); => Der Compiler kann null nicht in den primitiven Typ double konvertieren,
daher ist das 2. Argument mit dem Double-Referenztyp gekennzeichnet.

Um dem Methodenaufruf zu entsprechen, wird 10.0 durch automatisches Boxing und add(10.0, null) in ein Double-Objekt konvertiert.
ist mit add(Double, Double) markiert; Methode.

Aber zum Zeitpunkt der Ausführung ist d2 null, also System.out.println("Double version: " + (d1 + d2)); löst NullPointerException aus.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_50_bis_59;

public class test57 {
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }

    public static void main(String[] args) {
        add(10.0, null);// zweites element muss auch eine gleitkommazahl sein, sonst wird eine NullPointerException ausgelöst, die sagt das da kein wert ist den man ausdrücken kann
    }
}
