/*
 * Gesamterklärung
HINWEIS: Die Frage fragt nach einer "falschen" Implementierung und nicht nach einer "korrekten" Implementierung.

Wenn die übergeordnete Klasse / Schnittstellenmethode deklariert, eine geprüfte Ausnahme auszulösen, hat die überschreibende Methode der Unterklasse / Implementiererklasse gemäß den übergeordneten Regeln die folgenden Optionen:

1. Darf nicht erklären, dass eine geprüfte Ausnahme ausgelöst wird,

2. Kann deklarieren, dass dieselbe überprüfte Ausnahme ausgelöst wird, die von der Superklasse / Schnittstellenmethode ausgelöst wird.

3. Kann deklarieren, dass die Unterklasse der Ausnahme ausgelöst wird, die von der Superklasse / Schnittstellenmethode ausgelöst wird,

4. Die Superklasse der Ausnahme, die von der Superklasse / Schnittstellenmethode ausgelöst wird, kann nicht deklariert werden.
 * */
package JAVA_OCA_Test_2.Aufgaben_60_bis_70;

public class test60 {
    public static void main(String[] args) {

    }

    public interface I1 {
        void m1() throws java.io.IOException;
    }

    //----------------------------------------------------------------------------------------------------------------------
    // Fehlerhaft
//    public class C4 implements I1 {
//        public void m1() throws Exception{}
//    }
//----------------------------------------------------------------------------------------------------------------------
    // Variante 1
//    public class C2 implements I1 {
//        public void m1() throws java.io.FileNotFoundException{}
//    }
//----------------------------------------------------------------------------------------------------------------------
    // Variante 2
//public class C1 implements I1 {
//    public void m1() {}
//}
//----------------------------------------------------------------------------------------------------------------------
    // Variante 3
    public class C3 implements I1 {
        public void m1() throws java.io.IOException {
        }
    }
}
