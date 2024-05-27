/*
Gesamterklärung
FileNotFoundException erweitert IOException, und daher sollte der catch-Block von FileNotFoundException
vor dem catch-Block von IOException angezeigt werden.

Daher verursacht der Klassentest einen Kompilierungsfehler.

class Test gives compilation error
 * */
package JAVA_OCA_Test_2.Aufgaben_30_bis_39;
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
//public class test37 {
//    public static void main(String[] args) {
//        Super s = new Sub();
//        try {
//            s.m1();
//        } catch (IOException e) {                 // 2. generelle Exception, nach Spezialisierter
//            System.out.print("A");
//        } catch(FileNotFoundException e) {        // 1. spezifische Exception müssen zuerst abgefangen werden
//            System.out.print("B");
//        } finally {                               // 3. wird immer ausgeführt unabhängig der Exception
//            System.out.print("C");
//        }
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
// Korrekter Code
public class test37 {
    public static void main(String[] args) {
        Super s = new Sub();
        try {
            s.m1();
        } catch (FileNotFoundException e) {  // spezifischere Ausnahme zuerst
            System.out.print("B");
        } catch (IOException e) {  // allgemeinere Ausnahme danach
            System.out.print("A");
        } finally {
            System.out.print("C");
        }
    }
}