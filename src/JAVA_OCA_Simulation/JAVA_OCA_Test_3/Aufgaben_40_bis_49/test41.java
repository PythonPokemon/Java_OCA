/*
A
ArithmeticException
A wird auf der Konsole ausgegeben, Stack Trace wird gedruckt und dann wird das Programm abrupt beendet.

Gesamterklärung
Die Methode m1() wirft eine Instanz von ArithmeticException und die Methode m1() behandelt sie nicht, also leitet sie die Ausnahme an die aufrufende Methode main weiter.

Method main behandelt ArithmeticException nicht, also leitet es es an JVM weiter, aber kurz bevor dieser finally-Block ausgeführt wird. Dadurch wird A auf die Konsole gedruckt.

Danach gibt JVM den Stack-Trace aus und beendet das Programm abrupt.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_40_bis_49;

public class test41 {
    private static void m1() {
        System.out.println(1/0);
    }

    public static void main(String[] args) {
        try {
            m1();
        } finally {
            System.out.println("A");
        }
    }
}
