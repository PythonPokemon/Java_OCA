package Arrays;

/*
*   Lernziel:
*   - Kompakte Array-Initializierung
* - "Kosten" einschätzen können
* */
public class ArrayInitializer {
    public static void main(String[] args) {

        // Variante 1
        String[] names = new String[2];
        names[0] = "Lilo";
        names[1] = "Lola";

        // Variante 2 abgekürtzt
        String[] names2 = { "Lilo", "Lola"};
    }
}
