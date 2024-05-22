/*

false
false
 * */

package JAVA_OCA_Test_2.Aufgaben_10_bis_19;

public class test11 {
    public static void main(String[] args) {
        String str1 = " ";
        boolean b1 = str1.isEmpty(); // methode die prüft ob string leer ist
        System.out.println(b1);

        str1.trim();
        b1 = str1.isEmpty();        // bezieht sich immer noch auf den stringmit leerzeichen
        System.out.println(b1);
    }
}
