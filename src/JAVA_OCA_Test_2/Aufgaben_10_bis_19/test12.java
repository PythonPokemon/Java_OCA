/*
 * Was ist keine gültige Aussage, die auf einem bestimmten Code basiert?

class A{}
class B extends A{}
A a = new B();

Richtige Antwort
B b = new A();

B a = new B();

A a = new A();
------------------------------------------------------------------------------------------------------------------------
* Gesamterklärung
B b = neues A(); -> untergeordnete Klassenreferenz kann nicht auf das übergeordnete Klassenobjekt verweisen. Dies führt zu einem Kompilierungsfehler.

A a = neu B(); -> übergeordnete Klassenreferenz kann auf das untergeordnete Klassenobjekt verweisen. Das ist Polymorphismus.

B a = neu B(); -> Überhaupt keine Probleme.

A a = neu A(); -> Überhaupt keine Probleme.
 * */

package JAVA_OCA_Test_2.Aufgaben_10_bis_19;

public class test12 {
}
