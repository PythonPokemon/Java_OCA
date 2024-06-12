/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_4.Aufgaben_60_bis_69;

public class test66 {
    public static void main(String [] args) {
        int a = 3;
        m(++a, a++);
        System.out.println(a);  // 5
    }

    private static void m(int i, int j) {
        i++;
        j--;
    }
}
