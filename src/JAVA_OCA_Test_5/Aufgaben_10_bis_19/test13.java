/*
User must be allowed to read and change the value of radius field.
What needs to be done so that all the classes can read/change the value of radius field
and Circle class is well encapsulated as well?

 * */
package JAVA_OCA_Test_5.Aufgaben_10_bis_19;

public class test13 {
    public static void main(String[] args) {

    }
    private double radius;
//    public double getRadius() {               //<--- korrekt
//        return radius;
//    }
//    public void setRadius(double radius) {    //<--- korrekt
//        this.radius = radius;
//    }

    public test13(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
