/*


 * */
package JAVA_OCA_Test_5.Aufgaben_1_bis_9;

public class test9 {
    public static void main(String [] args) {
        boolean flag = false;
        System.out.println((flag = true) | (flag = false) || (flag = true));    // true
        System.out.println(flag);   // false
    }
}
