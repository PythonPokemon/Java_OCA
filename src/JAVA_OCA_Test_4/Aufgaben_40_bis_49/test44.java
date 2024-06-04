/*
Which modifications, done independently, print "Integer version" on to the console?

Select 3 options.
------------------------------------------------------------------------------------------------------------------------
Replace add(10, 20);  by add(10.0, 20.0);

Correct selection
Replace add(10, 20);  by add(new Integer(10), new Integer(20));

Correct selection
Remove add(int i, int j)  method declaration and definition.

Correct selection
Replace add(10, 20);  by add(null, null);

 * */
package JAVA_OCA_Test_4.Aufgaben_40_bis_49;

public class test44 {
    private static void add(int i, int j) {
        System.out.println("int version");  // match mit ganzzahlen | int version
    }

    private static void add(Integer i, Integer j) {
        System.out.println("Integer version");  // Wrapper KLasse
    }

    public static void main(String[] args) {
        add(10, 20);
    }
}
