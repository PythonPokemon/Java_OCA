public class Test {
    public static void main(String args[]) {
        int i = 0; // die zuweisung auf Index 0 erfolgt hier?

        int[] iA = {10, 20};

        // Ausgabe der Elemente des Arrays
        System.out.println(iA[0]); // Gibt das Element 10 an Index 0 aus
        System.out.println(iA[1]); // Gibt das Element 20 an Index 1 aus
        System.out.println(iA[i]); // Gibt das Element 10 an Index i aus, da i = 0

        // Überprüfung, ob der Wert an Index 0 gleich dem Wert an Index i ist
        boolean isEqual = (iA[0] == iA[i]);
        System.out.println(isEqual); // Gibt true aus, da iA[0] == iA[0]
        System.out.println(iA);
    }
}
