/*
Wann ist das Pen-Objekt, das in Zeile 1 erstellt wurde, für die Garbage Collection geeignet?
Am Ende der Hauptmethode

Nach Zeile 4

Nach Zeile 2

Richtige Antwort
Nach Zeile 3

 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_50_bis_59;

public class test55 {
    public static void main(String[] args) {
        test55 p1 = new test55(); //Line 1
        test55 p2 = new test55(); //Line 2
        p1 = p2; //Line 3
        p1 = null; //Line 4
    }
}
//      // aus der aufgabe
//    public class Pen {
//        public static void main(String[] args) {
//            Pen p1 = new Pen(); //Line 1
//            Pen p2 = new Pen(); //Line 2
//            p1 = p2; //Line 3
//            p1 = null; //Line 4
//        }
//    }
//}
