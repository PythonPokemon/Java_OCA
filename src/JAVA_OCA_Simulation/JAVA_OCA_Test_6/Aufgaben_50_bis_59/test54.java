/*
Which of the following options replaces INSERT?

abstract List<A> get() throws ArrayIndexOutOfBoundsException;   //<--- Correct answer

abstract ArrayList<A> get() throws Exception;
abstract List<B> get();
abstract ArrayList<B> get();
------------------------------------------------------------------------------------------------------------------------
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_6.Aufgaben_50_bis_59;

import java.util.*;

class A{}
class B extends A{}

abstract class Super {
    abstract List<A> get() throws IndexOutOfBoundsException;
}

abstract class Sub extends Super {
    /*INSERT*/
    abstract List<A> get() throws ArrayIndexOutOfBoundsException;   //<--- Correct answer
}

public class test54 {
    public static void main(String[] args) {

    }
}
