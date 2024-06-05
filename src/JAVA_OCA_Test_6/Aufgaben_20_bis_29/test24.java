/*


 * */
package JAVA_OCA_Test_6.Aufgaben_20_bis_29;
// Does above code compile successfully? YES
public class test24 {
    public static void main(String[] args) {
        System.out.println(new RuntimeException()); //Line n1
        System.out.println(new RuntimeException("HELLO")); //Line n2
        System.out.println(new RuntimeException(new RuntimeException("HELLO"))); //Line n3
    }
}
