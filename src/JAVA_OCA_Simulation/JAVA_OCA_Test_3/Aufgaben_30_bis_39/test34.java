/*
Kompilierungsfehler

Gesamterklärung
super(); wird vom Compiler als erste Anweisung in beiden Konstruktoren hinzugefügt.

Die Klasse Super erweitert sich von der Objektklasse und die Objektklasse hat keinen Argumentkonstruktor,
daher keine Probleme mit dem Konstruktor der Superklasse.

Der no-arg-Konstruktor ist jedoch in der Super-Klasse nicht verfügbar, daher wird super();
Der Unterklassenkonstruktor gibt einen Kompilierungsfehler aus.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_30_bis_39;

//class Super {
//    public Super(int i) {
//        System.out.println(100);
//    }
//}
//
//class Sub extends Super {
//    public Sub() {
//        System.out.println(200);
//    }
//}
//
//public class test34 {
//    public static void main(String[] args) {
//        new Sub();
//    }
//}
