/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_4.Aufgaben_30_bis_39;
import java.util.ArrayList;
import java.util.List;

public class test34 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');

        if(list.contains('O')) {
            list.remove(3);
        }

        for(char ch : list) {
            System.out.print(ch);   // VET
        }
    }
}
