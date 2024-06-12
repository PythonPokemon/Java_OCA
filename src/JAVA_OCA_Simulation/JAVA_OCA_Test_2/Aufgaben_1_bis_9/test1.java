/*
* Gesamterklärung
"Ausgabe ist: " + (10 != 5) [Auf der linken Seite gibt es nichts zu bewerten, also werten wir die rechte Seite von + aus, 10 != 5 ist wahr.]

= "Ausgabe ist: " + true [+ Operator verhält sich wie Verkettungsoperator]

= "Ausgabe ist: true"
* */

package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_1_bis_9;

public class test1 {
    public static void main(String[] args) {
        System.out.println("Output is: " + (10 != 5));
    }
}
