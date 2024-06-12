/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_60_bis_69;

public class test60 {
    public static void main(String[] args) {
        String[] arr = { "L", "I", "V", "E" }; //Line n1
        int i = -2;

        if (i++ == -1) { //Line n2
            arr[-(--i)] = "F"; //Line n3
        } else if (--i == -2) { //Line n4
            arr[-++i] = "O"; //Line n5
        }

        for(String s : arr) {
            System.out.print(s);    // LOVE
        }
    }
}
