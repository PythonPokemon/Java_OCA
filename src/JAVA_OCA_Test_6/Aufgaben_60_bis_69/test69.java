/*


 * */
package JAVA_OCA_Test_6.Aufgaben_60_bis_69;

class Calculator {
    int calculate(int i1, int i2) {
        return i1 + i2;
    }

    double calculate(byte b1, byte b2) {
        return b1 % b2;
    }
}

public class test69 {
    public static void main(String[] args) {
        byte b = 100;
        int i = 20;
        System.out.println(new Calculator().calculate(b, i));   // 120
    }
}
