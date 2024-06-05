/*
There is a compilation error in the code.
Which three modifications, done independently, print 1000 on to the console?
------------------------------------------------------------------------------------------------------------------------
Change Line n4 to Parent obj = new Child();             //<--- Correct selection
Change Line n5 to System.out.println(obj.getVar());     //<--- Correct selection
Delete the Line n2                                      //<--- Correct selection
------------------------------------------------------------------------------------------------------------------------
Change Line n3 to return var;
Change Line n1 to private int var = 1000;
Delete the method getVar() from the Child class
------------------------------------------------------------------------------------------------------------------------
Ausgabe:
1000
 * */
package JAVA_OCA_Test_5.Aufgaben_70_bis;

class Parent {
    int var = 1000; // Line n1

    int getVar() {
        return var;
    }
}

class Child extends Parent {
//    private int var = 2000; // Line n2 fehlerhaft

    int getVar() {
        return super.var; //Line n3
    }
}

public class test70 {
    public static void main(String[] args) {
//        Child obj = new Child();          // Line n4 fehlerhaft
        Parent obj = new Child();           // LIne 4 <---korrigiert
//        System.out.println(obj.var);      // Line n5 fehlerhaft
        System.out.println(obj.getVar());   // LIne 4 <---korrigiert
    }
}
