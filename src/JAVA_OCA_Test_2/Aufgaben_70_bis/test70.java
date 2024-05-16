/*
Kompilierungsfehler.

Gesamterklärung
Die Methode m1() wirft Exception (checked) und deklariert, dass sie geworfen werden soll, also keine Probleme mit der Methode m1().

Die Methode main() bietet jedoch weder einen catch-Handler noch eine throws-Klausel, und daher gibt die main-Methode einen Kompilierungsfehler aus.

Die Handle- oder Declare-Regel sollte für die überprüfte Ausnahme befolgt werden, wenn Sie sie nicht erneut auslösen.
* */
package JAVA_OCA_Test_2.Aufgaben_70_bis;

//public class test70 {
//    private static void m1() throws Exception {
//        throw new Exception();
//    }
//
//    public static void main(String[] args) {
//        try {
//            m1();
//        } finally {
//            System.out.println("A");
//        }
//    }
//}
