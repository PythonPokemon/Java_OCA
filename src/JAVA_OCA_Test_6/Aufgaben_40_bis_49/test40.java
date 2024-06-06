/*


 * */
package JAVA_OCA_Test_6.Aufgaben_40_bis_49;

public class test40 {
    public static void main(String [] args) {
        int num = 10;
        if(num++ == num++) {
            System.out.println("EQUAL " + num);
        } else {
            System.out.println("NOT EQUAL " + num); // NOT EQUAL 12
        }
    }
}
