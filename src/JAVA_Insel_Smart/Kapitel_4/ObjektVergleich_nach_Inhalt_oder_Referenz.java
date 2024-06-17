package JAVA_Insel_Smart.Kapitel_4;

import java.util.Arrays;

public class ObjektVergleich_nach_Inhalt_oder_Referenz {
    public static void main(String[] args) {
        int[] numbers1 = new int[0];
        int[] numbers2 = new int[0];

        // Vergleich der Referenzen der Arrays
        System.out.println(numbers1.equals(numbers2));

        // Vergleich der Inhalte der Arrays
        System.out.println(Arrays.equals(numbers1, numbers2));
    }
}
