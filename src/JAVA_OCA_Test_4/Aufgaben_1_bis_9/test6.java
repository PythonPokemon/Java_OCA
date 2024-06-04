/*


 * */
package JAVA_OCA_Test_4.Aufgaben_1_bis_9;
import java.util.ArrayList;
import java.util.List;

public class test6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(4);
        list.add(0, "Array");
//        list.add(1,"test");               // weil index 1 fehlt
        list.add(2, "List");

        System.out.println(list);   // .IndexOutOfBoundsException
    }
}
