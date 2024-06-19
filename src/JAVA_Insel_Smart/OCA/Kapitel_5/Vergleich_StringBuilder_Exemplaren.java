package JAVA_Insel_Smart.OCA.Kapitel_5;

public class Vergleich_StringBuilder_Exemplaren {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        String test = "Vergleich";
        String test2 = "Vergleich";

        // True, weil die Objekte zum String umgewandelt werden und dann die Elemente verglichen werden
        boolean isEqual = sb1.toString().equals(sb2.toString());
        System.out.println(isEqual);// true

        // false, weil jedes Element zu dem eigenen Objekt Referenziert ist
        boolean Referenz_Elementen_Vergleich = sb1.equals(sb2);
        System.out.println(Referenz_Elementen_Vergleich);// false

        // true weil der Vergleich der Elemente Übereinstimmt
        boolean VergleichVonStringElementen = test.equals(test2);
        System.out.println(VergleichVonStringElementen);// true

        // false, weil jedes Objekt seine eigene Speicheradresse besitzt
        boolean Vergleich_Der_Speicheradresse = sb1 == sb2;
        System.out.println(Vergleich_Der_Speicheradresse);// false


        System.out.println("Test, ob die Strings Im selben StringPool sind? " + (test == test2));
        boolean VergleichStringPool = test == test2; //test == test2 wird dem Bezeichner:VergleichStringPool |zugewiesen
        System.out.println(VergleichStringPool);
    }
}
