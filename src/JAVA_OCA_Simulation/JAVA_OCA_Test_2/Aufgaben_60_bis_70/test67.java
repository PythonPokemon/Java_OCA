/*
Welche der folgenden Arraydeklarationen und Initialisierungen ist NICHT zulässig?
//        int [] arr3 = new int[3]{10, 20, 30};

Gesamterklärung
Sie können die Größe zum Zeitpunkt der Initialisierung mit Daten nicht angeben,
daher new int[3]{10, 20, 30}; Gibt einen Kompilierungsfehler aus.

 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_2.Aufgaben_60_bis_70;

public class test67 {
    public static void main(String[] args) {
        int [] arr3 = new int[]{10, 20, 30};

//        int [] arr2 = {1, 2, 3, 4, 5};
//
//        byte [] val = new byte[10];
//
//        char [] arr1 [] = new char[5][];
        System.out.println(arr3);
//        System.out.println(arr2);
//        System.out.println(val);
//        System.out.println(arr1);
    }
}
