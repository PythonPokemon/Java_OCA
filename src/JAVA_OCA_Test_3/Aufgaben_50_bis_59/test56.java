/*
01234567



 * */
package JAVA_OCA_Test_3.Aufgaben_50_bis_59;

public class test56 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        sb.append("0123456789");
        sb.delete(8, 1000);
        System.out.println(sb);
    }
}
