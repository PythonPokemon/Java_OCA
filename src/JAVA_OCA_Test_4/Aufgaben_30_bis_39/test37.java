/*


 * */
package JAVA_OCA_Test_4.Aufgaben_30_bis_39;

public class test37 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            for(;;) {
                sb.append("OCA");
            }
        } catch(Exception e) {
            System.out.println("Exception!!!");
        }
        System.out.println("Main ends!!!"); // Program terminates abruptly
    }
}
