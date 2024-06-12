/*

------------------------------------------------------------------------------------------------------------------------
 *
 **
 ***
 ------------------------------------------------------------------------------------------------------------------------
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_4.Aufgaben_30_bis_39;
import java.util.function.Predicate;

public class test36 {
    public static void main(String[] args) {
        String [] arr = {"*", "**", "***", "****", "*****", "******"};
        Predicate<String> pr1 = s -> s.length() < 4;
        print(arr, pr1);
    }

    private static void print(String [] arr, Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);    // gibt die sternen kleiner 4 aus also  3
            }
        }
    }
}
