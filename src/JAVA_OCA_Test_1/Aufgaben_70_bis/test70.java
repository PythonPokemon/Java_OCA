/*
Kompilierungsfehler

Gesamterklärung
Die Methode 'append' ist in der StringBuilder-Klasse überladen: append(String), append(StringBuffer) und append(char[]) usw.

In diesem Fall ist der Compiler verwirrt, welche Methode 'append(null)' markiert werden kann, da String,
StringBuffer und char[] bei mehrstufiger Vererbung nicht miteinander verwandt sind.
Daher verursacht 'sb.append(null)' einen Kompilierungsfehler.
* */
package JAVA_OCA_Test_1.Aufgaben_70_bis;

//public class test70 {
//    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        System.out.println(sb.append(null).length());
//    }
//}
