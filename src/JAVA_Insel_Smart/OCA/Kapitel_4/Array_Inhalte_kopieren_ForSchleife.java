package JAVA_Insel_Smart.OCA.Kapitel_4;
import java.util.Arrays;

public class Array_Inhalte_kopieren_ForSchleife {
    public static void main(String[] args) {
        int[] src = {1, 2, 3};
        int[] dest = new int[3];

        // kopieren der elemente von src zu dest, ab Index 0
        System.arraycopy(src, 0, dest, 0, src.length); //mit:.lenght attribut warscheinlich alle Elemente

        // Ausgabe des Inhalts von dest
        System.out.println("Inhalt des Zielarrays dest: " + Arrays.toString(dest));
        System.out.println("Test src Elementen Anzeige zu String: " + Arrays.toString(src)); // Umwandlung int zu String

        // Alternativ: Manuelle Ausgabe der Elemente in einer Schleife
        System.out.print("Inhalt von dest: ");
        for (int i = 0; i < dest.length; i++) {
            System.out.print(dest[i] + " ");
        }

    }
}
