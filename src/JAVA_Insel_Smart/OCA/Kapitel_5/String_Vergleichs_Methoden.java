package JAVA_Insel_Smart.OCA.Kapitel_5;

public class String_Vergleichs_Methoden {
    public static void main(String[] args) {
        // Strings können mit equals(), equalsIgnoreCase() und compareTo() verglichen werden.
        boolean isEqual = "hello".equals("Hello"); // false | vergleicht String groß -und kleinschreibung
        boolean isEqualIgnoreCase = "hello".equalsIgnoreCase("Hello"); // true | Ignoriert groß/kleinschrift

        int comparison = "abc".compareTo(""); // es fehlen 3 elemente im Vergleich
        int comparison2 = "abc".compareTo("a"); // es fehlen 2 elemente im Vergleich
        int comparison3 = "abc".compareTo("ab"); // es fehlen 1 elemente im Vergleich
        int comparison4 = "abc".compareTo("abc"); // ist Identisch
        int comparison5 = "abc".compareTo("abcd"); // 1 zu viel | deswegen -1 weil es entfernt werden soll

        System.out.println(isEqual);
        System.out.println(isEqualIgnoreCase);
        System.out.println(comparison);
        System.out.println(comparison2);
        System.out.println(comparison3);
        System.out.println(comparison4);
        System.out.println(comparison5);
    }
}
