/*
hashCode() bei StringBuilder
StringBuilder-Objekte haben eine hashCode()-Methode,
die jedoch nicht den gleichen Wert wie der eines String-Objekts liefert.
* */

package JAVA_Insel_Smart.OCA.Kapitel_5;

public class StringBuilder_Hashcode {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("A");
        int hashCode = sb.hashCode();
        System.out.println(hashCode);// 1791741888

        String st = new String("A"); // 'A' entspricht der Zahl 65-ASCI Tabelle
        int hashCode2 = st.hashCode();
        System.out.println(hashCode2);// 65

    }
}
