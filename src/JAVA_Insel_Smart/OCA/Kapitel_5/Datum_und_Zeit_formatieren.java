package JAVA_Insel_Smart.OCA.Kapitel_5;

public class Datum_und_Zeit_formatieren {
    public static void main(String[] args) {
        Date date = new Date();
        String s = String.format("%tA, %<tB %<td, %<tY", date);
        System.out.println(s);  // Ausgabe: Samstag, Januar 1, 2022 (abhängig vom aktuellen Datum)

    }
}
