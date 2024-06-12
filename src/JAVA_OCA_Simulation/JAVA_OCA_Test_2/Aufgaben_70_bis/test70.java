/*
Es gibt keinen catch-Block, um die geworfene Ausnahme zu behandeln.
Stattdessen gibt es nur einen finally-Block.
Compilerfehler:

Da m1 eine Ausnahme wirft und diese Ausnahme im try-Block nicht behandelt wird, muss die main-Methode entweder die Ausnahme weitergeben (throws Exception) oder sie abfangen.
Der Compiler meldet einen Fehler, weil die Ausnahmebehandlung nicht korrekt ist.
* */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_70_bis;

//public class test70 {
//    private static void m1() throws Exception {
//        throw new Exception();
//    }
//
//    public static void main(String[] args)  {
//        try {
//            m1();
//        } finally {
//            System.out.println("A");
//        }
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
/*
Korrektur des Codes
Um den Compilerfehler zu beheben, gibt es zwei Möglichkeiten
Füge einen catch-Block hinzu, um die Ausnahme zu behandeln.
* */
//----------------------------------------------------------------------------------------------------------------------
//1. Ausnahme abfangen mit try-catch:
public class test70 {
    private static void m1() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("A");
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
//2. Variante Ausnahme weitergeben mit throws:
//public class test70 {
//    private static void m1() throws Exception {
//        throw new Exception();
//    }
//
//    public static void main(String[] args) throws Exception {     //<-- gibt die Exception weiter
//        try {
//            m1();
//        } finally {
//            System.out.println("A");
//        }
//    }
//}
//----------------------------------------------------------------------------------------------------------------------

