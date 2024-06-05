/*
Which of the following needs to be done so that LIGHT is printed on to the console?
------------------------------------------------------------------------------------------------------------------------
Delete Line n1, Line n2 and Line n3     //<--- Correct answer
------------------------------------------------------------------------------------------------------------------------
No changes are required as given code prints LIGHT on execution
Replace Line n5 with new Car().speed((byte...)b);
Replace Line n4 with byte... b = 10;
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_OCA_Test_5.Aufgaben_70_bis;

class Car {
    void speed(Byte val) { //Line n1
        System.out.println("DARK"); //Line n2
    } //Line n3

    void speed(byte... vals) {
        System.out.println("LIGHT");
    }
}

public class test71 {
    public static void main(String[] args) {
        byte b = 10; //Line n4
        new Car().speed(b); //Line n5
    }
}
