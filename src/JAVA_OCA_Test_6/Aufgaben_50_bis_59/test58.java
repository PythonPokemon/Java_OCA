/*

-:$
-:€
 * */
package JAVA_OCA_Test_6.Aufgaben_50_bis_59;

class Currency {
    String notation = "-"; //Line n1

    String getNotation() { //Line n2
        return notation;
    }
}

class USDollar extends Currency {
    String notation = "$"; //Line n3

    String getNotation() { //Line n4
        return notation;
    }
}

class Euro extends Currency {
    protected String notation = "€"; //Line n5

    protected String getNotation() { //Line n6
        return notation;
    }
}

public class test58 {
    public static void main(String[] args) {
        Currency c1 = new USDollar();
        System.out.println(c1.notation + ":" + c1.getNotation());

        Currency c2 = new Euro();
        System.out.println(c2.notation + ":" + c2.getNotation());
    }
}
