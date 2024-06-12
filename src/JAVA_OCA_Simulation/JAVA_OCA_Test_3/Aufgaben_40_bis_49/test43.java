/*
Kompilierungsfehler


Gesamterklärung
Die Variable y ist privat, sodass außerhalb der Grenze der Point-Klasse nicht darauf zugegriffen werden kann.
p1.y und p2.y, die in der Testklasse verwendet werden, verursachen den Kompilierungsfehler.
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_3.Aufgaben_40_bis_49;

class Point {
    static int x;
    private int y;

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

//public class test43 {
//    public static void main(String[] args) {
//        Point p1 = new Point();
//        p1.x = 100;
//        p1.y = 200;
//
//        Point p2 = new Point();
//        p2.x = 100;
//        p2.y = 200;
//
//        System.out.println(p1);
//    }
//}
