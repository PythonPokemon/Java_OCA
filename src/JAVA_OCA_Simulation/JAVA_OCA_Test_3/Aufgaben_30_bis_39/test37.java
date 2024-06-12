/*
Good bonus

Gesamterklärung
$ ist ein gültiger Bezeichner. $ = 80000
Dies ist ein Beispiel für einen ternären Operator.
Der erste Operand ($ >= 50000) ist ein boolescher Ausdruck, der wahr ist, da 80000 >= 50000 wahr ist.
msg bezieht sich auf "Guter Bonus".
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_30_bis_39;

public class test37 {
    public static void main(String[] args) {
        int $ = 80000;
        String msg = ($ >= 50000) ? "Good bonus" : "Average bonus";
        System.out.println(msg);
    }
}
