/*


 * */
package JAVA_OCA_Test_4.Aufgaben_30_bis_39;

public class test33 {
    public static void main(String[] args) {
        /*INSERT | For the class Test, which option, if used to replace INSERT, will print "Lucky no. 7" on to the*/
        int var = '7';
//        int var = 7;      // error
//        Integer var = 7;  // error

        switch(var) {
            case '7':
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}
