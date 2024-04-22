package ImperativeSprachkonstrukte;

public class IfStatement {
    public static void main(String[] args) {
        // bei IF muss immer eine bedingung wahr oder falsch sein = Boolean wert
        System.out.println("Bitte trage den Wert für 'a' ein: ");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.println("Bitte trage den Wert für 'b' ein: ");
        int b = new java.util.Scanner(System.in).nextInt();
        int area = a * b;

        if (area > 10_000) {
            System.out.println(area + " größer als 10.000");
        }
        if (area < 10_000) {
            System.out.println(area + " kleiner als 10.000");
        }
    }
}
