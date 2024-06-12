/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_50_bis_59;

class Shape {
    int side = 0; //Line n1

    int getSide() { //Line n2
        return side;
    }
}

class Square extends Shape {
    private int side = 4; //Line n3

    protected int getSide() { //Line n4
        return side;
    }
}

public class test53 {
    public static void main(String[] args) {
        Shape s = new Square();
        System.out.println(s.side + ":" + s.getSide()); // 0:4
    }
}
