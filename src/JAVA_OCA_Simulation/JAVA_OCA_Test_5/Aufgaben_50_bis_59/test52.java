/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_50_bis_59;

public class test52 {
    public static void main(String[] args) {
        int i = 1;
        int j = 5;
        int k = 0;
        A: while(true) {
            i++;
            B: while(true) {
                j--;
                C: while(true) {
                    k += i + j;
                    if(i == j)
                        break A;
                    else if (i > j)
                        continue A;
                    else
                        continue B;
                }
            }
        }
        System.out.println(k);  // 15
    }
}
