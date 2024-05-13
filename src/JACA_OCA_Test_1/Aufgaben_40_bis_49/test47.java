/*
* In Variante 1
* tritt ein Compilerfehler auf, weil FileNotFoundException eine Subklasse von IOException ist,
* und in der catch-Klausel speziell nach FileNotFoundException gefragt wird.
* Da s.m1() in der main-Methode aufgerufen wird und m1() in Super mit throws IOException deklariert ist,
* erfordert der Compiler, dass IOException entweder behandelt oder deklariert wird.
* Eine FileNotFoundException ist jedoch eine spezifischere Ausnahme als IOException, und daher wird der Compilerfehler ausgelöst.
*
* In Variante 2 wird der Compilerfehler behoben, indem in der main-Methode throws IOException hinzugefügt wird.
* Dadurch wird signalisiert, dass die Methode möglicherweise eine IOException wirft, was den Compiler zufriedenstellt,
* da FileNotFoundException eine Unterklasse von IOException ist. Somit wird der Compilerfehler behoben,
* und der Code kann ordnungsgemäß kompiliert werden.
* */

package JACA_OCA_Test_1.Aufgaben_40_bis_49;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super {
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}
//----------------------------------------------------------------------------------------------------------------------
//// Variante 1 compiler fehler | zum testen auskommentieren
//public class test47 {
//    public static void main(String[] args) { // <--
//        Super s = new Sub();
//        try {
//            s.m1();
//        } catch (FileNotFoundException e) {
//            System.out.println("M");
//        } finally {
//            System.out.println("N");
//        }
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
// Variante 2 Exception | zum testen auskommentieren
public class test47 {
    public static void main(String[] args) throws IOException { // <--
        Super s = new Sub();
        try {
            s.m1();
        } catch (FileNotFoundException e) {
            System.out.println("M");
        } finally {
            System.out.println("N");
        }
    }
}