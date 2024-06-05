/*

40
20
40
 * */
package JAVA_OCA_Test_6.Aufgaben_1_bis_9;

public class test9 {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30}; //Line n1
        int i = 0;
        arr[i++] = arr[++i] = 40; //Line n2
        for(int x : arr)
            System.out.println(x);
    }
}
