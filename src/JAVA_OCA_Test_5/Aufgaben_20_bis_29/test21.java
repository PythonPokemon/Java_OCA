/*
Which of the following options, if used to replace /*INSERT, will compile successfully
and on execution will print true on to the console?
------------------------------------------------------------------------------------------------------------------------
Select 2 options.
------------------------------------------------------------------------------------------------------------------------
s1.equalsIgnoreCase(s2)         <--- Correct selection
s1.length() == s2.length()      <--- Correct selection

s1.contentEquals(s2)
s1.equals(s2.toUpper())
s1.equals(s2)

 * */

package JAVA_OCA_Test_5.Aufgaben_20_bis_29;

public class test21 {
    public static void main(String[] args) {
        String s1 = "OCP";
        String s2 = "ocp";
        System.out.println(/*INSERT*/);
        System.out.println(s1.equalsIgnoreCase(s2));    // true
        System.out.println(s1.length() == s2.length()); // true
    }
}
