/*
((Parent)gc).quote          //<---Correct selection
((Parent)(Child)gc).quote   //<---Correct selection

gc.quote
(Parent)(Child)gc.quote
(Parent)gc.quote

 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_6.Aufgaben_1_bis_9;

class Parent {
    String quote = "MONEY DOESN'T GROW ON TREES";
}

class Child extends Parent {
    String quote = "LIVE LIFE KING SIZE";
}

class GrandChild extends Child {
    String quote = "PLAY PLAY PLAY";
}

public class test2 {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        System.out.println(((Parent)gc).quote/*INSERT*/);   //<--- MONEY DOESN'T GROW ON TREES
    }
}
