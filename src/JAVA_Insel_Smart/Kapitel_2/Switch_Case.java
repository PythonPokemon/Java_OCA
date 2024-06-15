/*
Die switch-Anweisung ist nützlich, wenn Sie eine Variable gegen eine Reihe von Werten vergleichen möchten.
Sie bietet eine übersichtliche Alternative zu mehreren if-else-Anweisungen:
* */
package JAVA_Insel_Smart.Kapitel_2;

public class Switch_Case {
    public static void main(String[] args) {
        int tag = 3;
        switch (tag) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            default:
                System.out.println("Unbekannter Tag");
                break;
        }

    }
}
