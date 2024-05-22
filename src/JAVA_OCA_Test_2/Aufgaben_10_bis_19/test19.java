/*
 *
Kompilierungsfehler
* ----------------------------------------------------------------------------------------------------------------------
* Gesamterklärung
Da es keine Klammern nach if gibt, ist nur eine Anweisung Teil des if-Blocks und die andere ist außerhalb.

Der obige Code kann wie folgt geschrieben werden:

if(grade > 60) {
    System.out.println("Congratulations");
}
System.out.println("You passed");
else
    System.out.println("You failed");


Es sollte nichts zwischen if-else-Block stehen, aber in diesem Fall System.out.println("Sie haben bestanden"); liegt zwischen if-else und damit Kompilierungsfehler.
 * */

package JAVA_OCA_Test_2.Aufgaben_10_bis_19;

//// Variante 1 | Compiler fehler
//public class test19 {
//    public static void main(String[] args) {
//        int grade = 75;
//        if(grade > 60)
//            System.out.println("Congratulations");
//        System.out.println("You passed");
//         else                                       // else-Anweisung außerhalb des if-Blocks,
//        System.out.println("You failed");
//    }
//}
//----------------------------------------------------------------------------------------------------------------------

// Variante 2 | Korrekt
public class test19 {
    public static void main(String[] args) {
        int grade = 55;

        if (grade > 60)
            System.out.println("Congratulations");
        else
            System.out.println("You passed");       // Die else-Anweisung muss hier stehen
        System.out.println("You passed");           // output wird außerhalb der schleife ausgegeben
    }
}