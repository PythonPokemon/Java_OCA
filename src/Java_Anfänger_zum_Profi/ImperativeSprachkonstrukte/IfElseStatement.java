package Java_Anfänger_zum_Profi.ImperativeSprachkonstrukte;

/**
 * Lernziel:
 * - if-else
 * Dangling-else-problem
 */

public class IfElseStatement {
    public static void main(String[] args) {
        double random = Math.random();
        if (random < 0.3)
            System.out.println("rot");  // wenn die zahl kleiner 0.3 ist = rot
        else if (random < 0.6)
            System.out.println("grün"); // wenn die zahl kleiner 0.6 ist = grün | aber größer 0.3
        else
            System.out.println("blau"); // wenn die zahl größer 0.6 ist = blau
    }
}