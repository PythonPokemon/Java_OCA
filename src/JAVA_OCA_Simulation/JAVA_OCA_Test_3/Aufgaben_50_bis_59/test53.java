/*
9
Which 3 options, if used to replace *INSERT*, on execution will print 9 on to the console?

Correct selection
int n = 1; n < arr.length - 1; n++

Correct selection
int n = 3; n < arr.length; n++

int n = 1; n < arr.length; n += 2

int n = 0; n < arr.length; n++

Correct selection
int n = 0; n < arr.length; n += 2
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_50_bis_59;

public class test53 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int x = 0;
        for(int n = 0; n < arr.length; n += 2 ) {   //<-- /*INSERT*/ (int n = 0; n < arr.length; n += 2 )
            x += arr[n];
        }
        System.out.println(x);
    }
}
