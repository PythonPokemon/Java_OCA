/*

1233
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_60_bis_69;

public class test69 {
    private static void m(int i) {
        System.out.print(1);
    }

    private static void m(int i1, int i2) {
        System.out.print(2);
    }

    private static void m(char... args) {
        System.out.print(3);
    }

    public static void main(String... args) {
        m('A');
        m('A', 'B');
        m('A', 'B', 'C');
        m('A', 'B', 'C', 'D');
    }
}
