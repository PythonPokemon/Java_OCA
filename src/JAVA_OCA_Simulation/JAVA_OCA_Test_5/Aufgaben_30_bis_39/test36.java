/*
How many of the above options can be used to replace /*INSERT (separately and not together)
such that given command prints BUS on to the console?
------------------------------------------------------------------------------------------------------------------------
Correct answer
Three options only
*/
package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_30_bis_39;

public class test36 {
    public static void main(String[] args) {
        String word = "REBUS";
        /* INSERT */
        word = word.substring(2);

//        word = word.substring(2, 4);
//
//        word = word.substring(2, 5);
//
//        word = word.replace("RE", "");
//
//        word = word.substring(2, 6);
//
//        word = word.delete(0, 2);

        System.out.println(word);
    }
}
