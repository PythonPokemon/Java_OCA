package JAVA_Insel_Smart.Kapitel_4;

public class Array_mit_Rückgabewerten {
    // Methode, die ein Array von int zurückgibt
    public static int[] getCoordinates() {
        return new int[] {10, 20};
    }

    public static void main(String[] args) {
        // Aufruf der Methode und Zuweisung der Rückgabewerte zu einem Array
        int[] coordinates = getCoordinates();

        // Ausgabe der Rückgabewerte
        System.out.println("X: " + coordinates[0]); // X: 10
        System.out.println("Y: " + coordinates[1]); // Y: 20
    }
}
