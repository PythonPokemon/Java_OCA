package JAVA_Insel_Smart.Kapitel_2;

public class IF_Else_Anweisung_Erweitert {
    public static void main(String[] args) {
        int zahl = 100;

        if (zahl > 10) {
            System.out.println("Zahl ist größer als 10");
        } else if (zahl > 5) {
            System.out.println("Zahl ist größer als 5, aber kleiner oder gleich 10");
        } else if (zahl > 0) {
            System.out.println("Zahl ist größer als 0, aber kleiner oder gleich 5");
        } else if (zahl == 0) {
            System.out.println("Zahl ist gleich 0");
        } else {
            System.out.println("Zahl ist kleiner als 0");
        }
    }
}
