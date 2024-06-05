/*

false
true
 * */
package JAVA_OCA_Test_5.Aufgaben_60_bis_69;

public class test67 {
    public static void main(String [] args) {
        boolean flag1 = true;
        boolean flag2 = false;
        boolean flag3 = true;
        boolean flag4 = false;

        System.out.println(!flag1 == flag2 != flag3 == !flag4); //Line n1 <--- false
        System.out.println(flag1 = flag2 != flag3 == !flag4); //Line n2 <--- true
    }
}
