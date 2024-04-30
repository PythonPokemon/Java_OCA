package Arrays;

/*
*   Lernziel:
*   - Kompakte Array-Initializierung
*   - "Kosten" einschätzen können
* */
public class ArrayInitializer {
    public static void main(String[] args) {

        // Variante 1
        String[] names = new String[2];
        names[0] = "Lilo";
        names[1] = "Lola";

        // Variante 2 abgekürzt
        String[] names2 = { "Lilo", "Lola"};        // ist das gleiche wie ==  String[] names2 = new String[2];

        // names2 = {}; // Compilerfehler
        names2 = new String[]{};
        names2 = new String [] {"Lilo", "Lola", "Fedja"};   // index | 0 = Lilo, 1 = Lola, 2 = Fedja | also 3 werte insgesamt
        System.out.println(names2.length);          // gibt aus der konsole den gesamten index aus, der sich im Array befindet
        length(names2);
        length(new String[]{"Thomas", "Georg"});    // gib in der konsole 11 aus
    }

    // Methode | gibt die gesamte länge aller Zeichenketten aus = lilo = 4  + lola = 4 + Fedja = 5 = Gesamte Zeichenkette 13
    static void length( String[] names){
        int sum = 0;
        for (int i = 0; i < names.length; i++) {
            sum += names[i].length();
        }
        System.out.println(sum);
    }
}
