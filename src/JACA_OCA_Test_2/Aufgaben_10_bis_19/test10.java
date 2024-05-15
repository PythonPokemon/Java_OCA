/*
* 3
* */

package JACA_OCA_Test_2.Aufgaben_10_bis_19;

public class test10 {
    public static void main(String [] args) {
        int a = 2;
        boolean res = false;
        res = a++ == 2 || --a == 2 && --a == 2;
        System.out.println(a);
    }
}
