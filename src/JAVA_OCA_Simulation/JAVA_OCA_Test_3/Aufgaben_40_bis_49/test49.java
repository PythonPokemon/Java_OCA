/*
25


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_40_bis_49;

public class test49 {
    public static void main(String[] args) {
        int start = 1;
        int sum = 0;
        do {
            if(start % 2 == 0) {
                continue;
            }
            sum += start;
        } while(++start <= 10);
        System.out.println(sum);
    }
}
