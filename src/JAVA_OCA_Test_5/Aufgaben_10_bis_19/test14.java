/*


 * */
package JAVA_OCA_Test_5.Aufgaben_10_bis_19;

class A {
    public String toString() {
        return null;
    }
}

public class test14 {
    public static void main(String [] args) {
        String text = null;
        text = text + new A(); //Line n1
        System.out.println(text.length()); //Line n2    // 8
    }
}
