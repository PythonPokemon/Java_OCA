/*

BBB
EEE
HHH
 * */
package JAVA_OCA_Test_4.Aufgaben_10_bis_19;

public class test15 {
    public static void main(String[] args) {
        char [][] arr = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][1]);
            }
            System.out.println(); // BBB | EEE | HHH
        }
    }
}
