/*
Which of the following needs to be done so that LIGHT is printed on to the console?
------------------------------------------------------------------------------------------------------------------------
It prints KEEP_GOING_ on to the console     //<--- Correct answer
------------------------------------------------------------------------------------------------------------------------
Compilation Error in Base class
Compilation Error in Super class
Compilation Error in Test class
It prints GOING_KEEP_ on to the console
It prints KEEP_KEEP_GOING_ on to the console
It prints GOING_ on to the console
------------------------------------------------------------------------------------------------------------------------
KEEP_GOING_
* */
package JAVA_OCA_Test_5.Aufgaben_70_bis;

class Super {
    void Super() {
        System.out.print("KEEP_");
    }
}

class Base extends Super {
    Base() {
        Super();
        System.out.print("GOING_");
    }
}

public class test72 {
    public static void main(String[] args) {
        new Base();
    }
}
