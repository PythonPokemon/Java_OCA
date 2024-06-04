/*


 * */
package JAVA_OCA_Test_4.Aufgaben_1_bis_9;

public class test4 {
    public static void main(String[] args) {
        int a = 5;
        int x = 10;
        switch(x) {
            case 10:
                a *= 2;
            case 20:
                a *= 3;
            case 30:
                a *= 4;
        }
        System.out.println(a);  // 120
    }
}
