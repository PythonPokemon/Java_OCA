/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_6.Aufgaben_10_bis_19;

public class test15 {
    public static void main(String[] args) {
        for(int x = 10, y = 11, z = 12; y > x && z > y; y++, z -= 2) {
            System.out.println(x + y + z);  // 33
        }
    }
}
