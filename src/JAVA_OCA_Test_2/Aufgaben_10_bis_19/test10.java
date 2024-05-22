/*
also ob a erhöht wird oder negiert wird, beeinflusst, indem fall nur die summe, aber es wird trotzdem immer true sein.
weil es der 2 entpricht und damit initialisiert wurde.

* */

package JAVA_OCA_Test_2.Aufgaben_10_bis_19;

public class test10 {
    public static void main(String [] args) {
        int a = 2;
        boolean res = false;
        res = a++ == 2 || --a == 2 && --a == 2; // bezeichner a wird der wert 2 zugewiesen und u
        System.out.println(a);
    }
}
