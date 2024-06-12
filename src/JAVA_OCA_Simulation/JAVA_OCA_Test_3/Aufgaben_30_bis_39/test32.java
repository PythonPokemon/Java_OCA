/*
Kompilierungsfehler

Gesamterklärung
Java erlaubt es nicht, bestimmte geprüfte Ausnahmen abzufangen,
wenn diese nicht von den Anweisungen innerhalb des try-Blocks ausgelöst werden.

catch(FileNotFoundException ex) {} verursacht in diesem Fall einen Kompilierungsfehler als System.out.println(1);
wird niemals FileNotFoundException auslösen.

HINWEIS: Java ermöglicht das Abfangen des Ausnahmetyps. catch(Exception ex) {} verursacht niemals einen Kompilierungsfehler.

 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_30_bis_39;
import java.io.FileNotFoundException;

//public class test32 {
//    public static void main(String[] args) {
//        try {
//            System.out.println(1);
//        } catch (NullPointerException ex) {
//            System.out.println("ONE");
//        } catch (FileNotFoundException ex) {
//            System.out.println("TWO");
//        }
//        System.out.println("THREE");
//    }
//}
