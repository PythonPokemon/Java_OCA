/*

%
$$
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_20_bis_29;

public class test24 {
    public static void main(String[] args) {
        String [][] arr = { {"%", "$$"}, {"***", "@@@@", "#####"}};
        for(String [] str : arr) {
            for(String s : str) {
                System.out.println(s);
                if(s.length() == 4) //Line n1
                    break; //Line n2
            }
            break; //Line n3
        }
    }
}
