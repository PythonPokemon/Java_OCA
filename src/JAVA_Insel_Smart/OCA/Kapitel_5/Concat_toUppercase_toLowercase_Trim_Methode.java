package JAVA_Insel_Smart.OCA.Kapitel_5;

public class Concat_toUppercase_toLowercase_Trim_Methode {
    public static void main(String[] args) {
        // Strings definieren
        String str1 = "Hallo";
        String str2 = " Welt";
        String str3 = "   Java Programmierung   ";

        // Strings anhängen (zusammenfügen)
        String zusammengefügt = str1.concat(str2);
        System.out.println("Zusammengefügt: " + zusammengefügt); // Ausgabe: "Hallo Welt"

        // Strings in Großbuchstaben umwandeln
        String groß = str1.toUpperCase();
        System.out.println("Großbuchstaben: " + groß); // Ausgabe: "HALLO"

        // Strings in Kleinbuchstaben umwandeln
        String klein = str1.toLowerCase();
        System.out.println("Kleinbuchstaben: " + klein); // Ausgabe: "hallo"

        // Weißraum entfernen
        String getrimmt = str3.trim();
        System.out.println("Getrimmt: '" + getrimmt + "'"); // Ausgabe: "Java Programmierung"
    }
}
