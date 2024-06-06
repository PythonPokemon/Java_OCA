/*
And the commands:
javac Test.java
java Test 10

What is the result?

byte
String  //<--- Correct answer
Compilation error
An Exception is thrown at runtime
Integer

 * */
package JAVA_OCA_Test_6.Aufgaben_30_bis_39;

public class test33 {
    public static void main(String [] args) {
        System.out.println("String");   //<--- Correct answer
    }

    public static void main(Integer [] args) {
        System.out.println("Integer");
    }

    public static void main(byte [] args) {
        System.out.println("byte");
    }
}
