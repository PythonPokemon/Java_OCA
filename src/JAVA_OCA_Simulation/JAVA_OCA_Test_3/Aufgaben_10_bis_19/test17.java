/*
Für den angegebenen Code:

Richtige Antwort
Die Methode m1() in der Implementer-Klasse ist nicht korrekt implementiert.

Die Schnittstelle I01 gibt einen Kompilierungsfehler aus, da die Methode M1 nicht öffentlich ist.

Keine der anderen Optionen.

Die Deklaration der Implementer-Klasse ist nicht korrekt.
------------------------------------------------------------------------------------------------------------------------
Erklärung des Fehlers
Interface-Methode m1 in I01:

Das Interface I01 deklariert die Methode m1 als public
(standardmäßig sind alle Methoden in einem Interface public und abstract).
------------------------------------------------------------------------------------------------------------------------
Implementierung der Methode m1 in Implementer:

Die Klasse Implementer deklariert, dass sie das Interface I01 implementiert.
Die Methode m1 wird in Implementer als protected implementiert.
Warum führt dies zu einem Kompilierungsfehler?
------------------------------------------------------------------------------------------------------------------------
Sichtbarkeitsregel in Java:
Wenn eine Klasse ein Interface implementiert, müssen alle Methoden des Interface in der Klasse implementiert werden
und mindestens die gleiche Sichtbarkeit wie im Interface haben.

Da die Methode m1 im Interface I01 als public deklariert ist,
muss die Implementierung von m1 in Implementer ebenfalls public sein.
In deinem Code ist die Methode m1 in Implementer als protected deklariert,
was eine geringere Sichtbarkeit als public hat.
Dies führt zu einem Kompilierungsfehler, weil die Implementierung der Methode
die vertragliche Verpflichtung des Interfaces nicht erfüllt.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_10_bis_19;

//public class test17 {
//    public static void main(String[] args) {
//
//    }
//
//    interface I01 {
//        void m1();
//    }
//
//    public class Implementer extends Object implements I01{
//        protected void m1() { // fehler weil die methode protected ist, muss aber public sein
//
//        }
//    }
//}
//
public class test17 {
    public static void main(String[] args) {

    }

    interface I01 {
        void m1();
    }

    public class Implementer extends Object implements I01 {
        public void m1() {

        }
    }
}
