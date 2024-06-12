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
Bei überladenen Methoden in Java spielt die Hierarchie der Klassen und Schnittstellen eine entscheidende Rolle,
wenn der Compiler entscheidet, welche Methode aufzurufen ist.
* Der Compiler wählt die am besten passende Methode basierend auf den Typen der Argumente.
* Wenn mehrere überladene Methoden für ein bestimmtes Argument in Frage kommen,
* bevorzugt der Compiler die spezifischere Methode gegenüber einer allgemeineren Methode.

In deinem Beispiel haben wir drei überladene Methoden m1, die jeweils verschiedene Parameter akzeptieren:
* CharSequence, String und Object.

Hier ist die Klassen- und Schnittstellenhierarchie relevant,
* da String eine Unterklasse von Object ist und auch die Schnittstelle CharSequence implementiert:

Object
CharSequence (Schnittstelle)
String
Wenn du die Methode m1(null) aufrufst, muss der Compiler entscheiden,
welche der überladenen Methoden am besten zu null passt.
Da null ein gültiger Wert für jeden Referenztyp ist, ist null sowohl mit Object,
CharSequence als auch String kompatibel.
Die spezifischste Methode wird gewählt, was in diesem Fall die Methode m1(String s) ist.

Hier ist der Ablauf, wie der Compiler die Entscheidung trifft:

Specificity: String ist spezifischer als CharSequence und Object, weil String eine Unterklasse von Object ist
* und die CharSequence-Schnittstelle implementiert.

Method Selection: Der Compiler wählt die Methode, die den spezifischsten Typ akzeptiert, der mit dem Argument null kompatibel ist.
* Daher wird m1(String s) gewählt.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_40_bis_49;

public class test44 {
    public static void main(String[] args) {
        m1(null);
    }

    static void m1(CharSequence s) {
        System.out.println("CharSequence");
    }   // Schnittstelle

    static void m1(String s) {
        System.out.println("String");
    }   // Spezialisiert

    static void m1(Object s) {
        System.out.println("Object");
    }   // Oberklasse
}
