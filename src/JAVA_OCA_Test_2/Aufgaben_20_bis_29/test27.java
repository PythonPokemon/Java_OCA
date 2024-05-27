/*
 * false
 * */

package JAVA_OCA_Test_2.Aufgaben_20_bis_29;

public class test27 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();  // methode()
        String s2 = "Java"; // string literal

        System.out.println(s1 == s2); // kann nicht gleich sein
    }
}