package JAVA_Insel_Smart.Kapitel_5;

public class Nach_Zeichen_und_Zeichenfolgen_Suchen {
    public static void main(String[] args) {
        // Nach enthaltenen Zeichen und Zeichenfolgen suchen
        // Die Methoden contains(), indexOf() und lastIndexOf() helfen beim Suchen von Zeichen
        // oder Zeichenfolgen in einem String.

        // Bsp: für suchmaschinen | oder Account cookies Daten matching für autoauswahl
        boolean contains = "Hello".contains("ell"); // gibt true aus, wenn die zeichen im String enthalten sind
        int index = "Hello".indexOf('l'); // gibt den Index an, an dem sich das Element im String befindet

        System.out.println(contains);
        System.out.println(index);
    }
}
