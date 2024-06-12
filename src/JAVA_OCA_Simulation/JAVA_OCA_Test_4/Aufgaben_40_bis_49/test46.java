/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_4.Aufgaben_40_bis_49;

public class test46 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Good"); //Line 3
        change(sb); //Line 4
        System.out.println(sb); //Line 5 | Good_Morning

    }

    private static void change(StringBuilder s) {
        s.append("_Morning"); //Line 9
    }
}
