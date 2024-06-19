package JAVA_Insel_Smart.OCA.Kapitel_5;

public class replace_replaceFirst_replaceAll_Methode {
    public static void main(String[] args) {
        // Gesucht, gefunden, ersetzt
        // Die Methoden replace(), replaceFirst() und replaceAll() ersetzen Zeichen oder Zeichenfolgen in einem String.
        // Ursprünglicher String
        String str = "Hallo Welt! Welt, wie geht es dir? Welt";

        // Alle Vorkommen von "Welt" ersetzen durch "Java"
        String strErsetztAlle = str.replace("Welt", "Java");
        System.out.println("Ersetzt alle 'Welt': " + strErsetztAlle);
        // Ausgabe: "Hallo Java! Java, wie geht es dir? Java"

        // Ersetzen des ersten Vorkommens von "Welt" durch "Java"
        String strErsetztErstes = str.replaceFirst("Welt", "Java");
        System.out.println("Ersetzt erstes 'Welt' mit 'Java': " + strErsetztErstes);
        // Ausgabe: "Hallo Java! Welt, wie geht es dir? Welt"

        // Ersetzen aller Vorkommen von "Welt" durch "Java" mit Regex (z.B. für Groß- und Kleinschreibung)
        String strErsetztRegex = str.replaceAll("(?i)Welt", "Java"); // (?i) steht für case-insensitive
        System.out.println("Ersetzt alle 'Welt' (case-insensitive) mit 'Java': " + strErsetztRegex);
        // Ausgabe: "Hallo Java! Java, wie geht es dir? Java"
    }
}
