/*
* Der Compilerfehler tritt auf, weil die Methode m1() in der main-Methode aufgerufen wird,
* ohne dass der Aufruf in einem try-catch-Block eingefasst ist oder dass der Aufruf selbst eine throws-Klausel enthält.
* In Java müssen alle Methoden, die eine geprüfte Exception auslösen könnten, entweder die entsprechende Exception
* in ihrer eigenen throws-Klausel deklarieren oder die Exception innerhalb der Methode mithilfe eines try-catch-Blocks behandeln.
*
* Da die Methode m1() eine throws-Klausel für Exception enthält und der Aufruf in der main-Methode nicht in einem try-catch-Block eingefasst ist, tritt ein Compilerfehler auf.
* */
package JACA_OCA_Test_1.Aufgaben_60_bis_70;

//// Variante 1 | Compiler fehler | zum Testen auskommentieren
//public class test60 {
//    public static void main(String[] args) {
//        m1(); //Line 3
//    }
//
//    private static void m1() throws Exception {
//        System.out.println("NOT THROWING ANY EXCEPTION"); // < -- Compilation error at Line 3
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
// Variante 2
// try-catch-Block verwenden | zum Testen auskommentieren
// Du kannst den Aufruf der Methode m1() in einen try-catch-Block einbetten, um die mögliche Ausnahme abzufangen und zu behandeln.
//public class test60 {
//    public static void main(String[] args) {
//        try {
//            m1(); //Line 3
//        } catch (Exception e) {
//            e.printStackTrace(); // Behandlung der Ausnahme, z.B. Ausgabe des Stacktraces
//        }
//    }
//
//    private static void m1() throws Exception {
//        System.out.println("NOT THROWING ANY EXCEPTION");
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
// Variante 3
// throws-Klausel entfernen | zum Testen auskommentieren
// Wenn die Methode m1() keine Ausnahmen auslöst, kannst du einfach die throws-Klausel entfernen:
public class test60 {
    public static void main(String[] args) {
        m1(); //Line 3
    }

    private static void m1() {
        System.out.println("NOT THROWING ANY EXCEPTION");
    }
}
