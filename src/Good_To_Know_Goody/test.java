/*


 * */
//----------------------------------------------------------------------------------------------------------------------
/*
test
test1
test2
test3
test4
test5
test6
 * */

package Good_To_Know_Goody;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;

        System.out.println(-a++ + b); // das ++ hinter dem a wird ers im nachfolgender berechnung hinzu anddiert
        System.out.println(-a + b); // also erst hier
//----------------------------------------------------------------------------------------------------------------------
        List<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(2));
        list.add(new Integer(1));
        list.add(new Integer(0));

        list.remove(list.indexOf(0));   // enternt die liste aus dem index expliziet

        System.out.println(list);
//----------------------------------------------------------------------------------------------------------------------
        List<String> list1 = new ArrayList<>();
        list1.add("A"); // Index 0
        list1.add("D"); // index 1

        List<String> list2 = new ArrayList<>();
        list2.add("B");
        list2.add("C");

        list1.addAll(1, list2);

        System.out.println(list1);  // [A, B, C, D]
        // start ist A dann wird Liste 2 hinzugefügt B, C, und der rest von A also D weiter ausgegeben

//----------------------------------------------------------------------------------------------------------------------
        int[] arr = {4, 3, 2, 1, 0};
        for (int i : arr) {
            System.out.println(arr[i]); // liest von RECHTS nach LINKS
//            System.out.println("Links nach rechts " + i);  // 2, 1, 0

//----------------------------------------------------------------------------------------------------------------------


//----------------------------------------------------------------------------------------------------------------------


//----------------------------------------------------------------------------------------------------------------------


//----------------------------------------------------------------------------------------------------------------------
        }
    }
}
