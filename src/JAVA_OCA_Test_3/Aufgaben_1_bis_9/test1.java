/*
What will be the result of compiling and executing TestBaseDerived class?
Base: m1()
Derived: m1()

Correct answer
None of the other options


Derived: m1()

Base: m1()

Die abgeleitete Klasse überschreibt die Methode m1() der Basisklasse.
Der Zugriffsmodifikator der Methode m1() in der Basisklasse ist geschützt, sodass die überschreibende Methode protected oder public verwenden kann.

In diesem Fall wurde jedoch der Standardmodifikator verwendet, und daher liegt ein Kompilierungsfehler vor.
* */
package JAVA_OCA_Test_3.Aufgaben_1_bis_9;

//class Base {
//    protected void m1() {
//        System.out.println("Base: m1()");
//    }
//}
//
//class Derived extends Base {
//    void m1() {
//        System.out.println("Derived: m1()");
//    }
//}
//
//public class test1 {
//    public static void main(String[] args) {
//        Base b = new Derived();
//        b.m1();
//    }
//}
