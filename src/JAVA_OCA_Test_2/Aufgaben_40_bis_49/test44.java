/*
 * Was wird das Ergebnis des Kompilierens und Ausführens der Testklasse sein?
 * ---------------------------------------------------------------------------------------------------------------------
 *Correct answer
String

Compilation Error

CharSequence

Object
 *
 * ---------------------------------------------------------------------------------------------------------------------
 * Gesamterklärung
Die Methode m1 wird überladen, um 3 verschiedene Parameter zu akzeptieren: String, CharSequence und Object.

String implementiert CharSequence und Object ist die übergeordnete Klasse in Java.
* Es gibt keinen Konflikt zwischen den überladenen Methoden für den Aufruf m1(null),
* da er der niedrigsten Klasse in der Hierarchie zugeordnet ist, nämlich der String-Klasse. Daher ist die Ausgabe "String".

Wenn Sie nun eine weitere überladene Methode hinzufügen, 'static void m1(StringBuilder s) {...} ' in der Test-Klasse,
* dann würde 'm1(null);' einen Kompilierungsfehler verursachen, da es sowohl mit den Methoden m1(StringBuilder) als auch m1(String) übereinstimmen würde.
* In diesem Fall wäre m1(null) also ein mehrdeutiger Aufruf und würde einen Kompilierungsfehler verursachen.

Aus dem gleichen Grund ist System.out.println(null); verursacht einen Kompilierungsfehler, da die println-Methode überladen wird,
*  um 3 Verweistypen Object, String und char [] zusammen mit primitiven Typen zu akzeptieren.

System.out.println(null); stimmt sowohl mit println(char[]) als auch mit println(String) überein,
* daher ist es ein mehrdeutiger Aufruf und daher der Kompilierungsfehler.
 * */
package JAVA_OCA_Test_2.Aufgaben_40_bis_49;

public class test44 {
    public static void main(String[] args) {
        m1(null);
    }

    static void m1(CharSequence s) {
        System.out.println("CharSequence");
    }

    static void m1(String s) {
        System.out.println("String");
    }

    static void m1(Object s) {
        System.out.println("Object");
    }
}
