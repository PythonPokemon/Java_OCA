/*


 * */
package JAVA_OCA_Test_6.Aufgaben_20_bis_29;

public class test20 {
    public static void main(String[] args) {
        outer: for(int i = 0; i < 3; System.out.print(i)) {
            i++;
            inner: for(int j = 0; j < 3; System.out.print(j)) {
                if(i > ++j) {
                    break outer;    // 1231
                }
            }
        }
    }
}
