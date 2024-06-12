/*
Hello1234

Gesamterklärung
Da der Ausdruck nur den +-Operator enthält, der von links nach rechts assoziativ ist. Lassen Sie uns den Ausdruck gruppieren.

"Hallo" + 1 + 2 + 3 + 4
= ("Hallo" + 1) + 2 + 3 + 4
= (("Hallo" + 1) + 2) + 3 + 4
= ((("Hallo" + 1) + 2) + 3) + 4
[Lösen wir es jetzt, der +-Operator mit String verhält sich als Verkettungsoperator.]
= (("Hallo1" + 2) + 3) + 4
= ("Hallo12" + 3) + 4
= "Hallo123" + 4
= "Hallo1234"
 * */

package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_10_bis_19;

public class test19 {
    public static void main(String[] args) {
        System.out.println("Hello" + 1 + 2 + 3 + 4);
    }
}
