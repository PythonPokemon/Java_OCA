/*
Für den angegebenen Code:

Richtige Antwort
Die Methode m1() in der Implementer-Klasse ist nicht korrekt implementiert.

Die Schnittstelle I01 gibt einen Kompilierungsfehler aus, da die Methode M1 nicht öffentlich ist.

Keine der anderen Optionen.

Die Deklaration der Implementer-Klasse ist nicht korrekt.
------------------------------------------------------------------------------------------------------------------------
Gesamterklärung
void m1(); in der Schnittstelle I01 entspricht der öffentlichen abstrakten void m1(); Die Methode m1() ist also implizit öffentlich und abstrakt.

In Java kann eine Klasse nur von einer Klasse aus erweitert werden, aber mehrere Schnittstellen implementieren.
Korrekte Schlüsselwörter sind: extends und implements.

Die Klassendeklaration ist also korrekt.

Da die Methode m1() in I01 implizit öffentlich ist, sollte die überschreibende Methode in der Implementer-Klasse auch öffentlich sein.
Aber es ist geschützt und daher beschwert sich der Compiler.

 * */
package JAVA_OCA_Test_3.Aufgaben_10_bis_19;

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
//        protected void m1() {
//
//        }
//    }
//}
