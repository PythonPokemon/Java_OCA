package JACA_OCA_Test_1.Aufgaben_60_bis_70;

public class test68 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = sb.toString();

        System.out.println(s1 == s2);   // was kommt raus? false
    }
}
