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

package JACA_OCA_Test_2.Aufgaben_10_bis_19;

public class test19 {
    public static void main(String[] args) {
        int grade = 75;
        if(grade > 60)
            System.out.println("Congratulations");
        System.out.println("You passed");
         else
        System.out.println("You failed");
    }
}
