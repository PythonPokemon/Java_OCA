/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_4.Aufgaben_50_bis_59;
import java.util.ArrayList;
import java.util.List;

public class test56 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("grape");

        if(fruits.remove("grape"))
            fruits.remove("apple");

        System.out.println(fruits); // [orange, mango, banana, grape]
    }
}
