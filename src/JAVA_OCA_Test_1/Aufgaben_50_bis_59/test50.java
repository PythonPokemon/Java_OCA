/*
* In der Schleife for(int i : arr) durchläuft i jedes Element des Arrays arr.
* In diesem Fall sind die Werte von i 2, 1 und 0.
*
* Wenn wir arr[i] drucken, greifen wir auf das Element mit dem Index i im Array arr zu.
* Also, arr[2] ist 2, arr[1] ist 1 und arr[0] ist 0.
* */

package JAVA_OCA_Test_1.Aufgaben_50_bis_59;

public class test50 {
    public static void main(String[] args) {
        int [] arr = {2, 1, 0};
        for(int i : arr){
            System.out.println(arr[i]); // was kommt raus?
        }
    }
}
