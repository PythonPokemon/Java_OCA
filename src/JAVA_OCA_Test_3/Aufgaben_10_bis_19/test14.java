/*
Kompilierungsfehler

Gesamterklärung
i und j können nicht als privat deklariert werden, da i und j lokale Variablen sind.

Nur der finale Modifikator kann mit lokalen Variablen verwendet werden.
 * */
//package JAVA_OCA_Test_3.Aufgaben_10_bis_19;
//
//class Rectangle {
//    private int height;
//    private int width;
//
//    public Rectangle(int height, int width) {
//        this.height = height;
//        this.width = width;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//}
//
//public class test14 {
//    public static void main(String[] args) {
//        private int i = 100;    // privat | zugriffsmodifizierer weglassen
//        private int j = 200;
//        Rectangle rect = new Rectangle(i, j);
//        System.out.println(rect.getHeight() + ", " + rect.getWidth());
//    }
//}
