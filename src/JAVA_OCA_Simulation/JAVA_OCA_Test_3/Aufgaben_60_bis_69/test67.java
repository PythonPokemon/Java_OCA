/*
MNO



 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_60_bis_69;

class M { }
class N extends M { }
class O extends N { }
class P extends O { }

public class test67 {
    public static void main(String args []) {
        M obj = new O();
        if(obj instanceof M)
            System.out.print("M");
        if(obj instanceof N)
            System.out.print("N");
        if(obj instanceof O)
            System.out.print("O");
        if(obj instanceof P)
            System.out.print("P");
    }
}
