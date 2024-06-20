/*
Das Wort "Pattern" stammt aus dem Englischen und kann je nach Kontext verschiedene Bedeutungen haben:

Muster: Ein wiederholtes dekoratives Design. Zum Beispiel ein Stoffmuster.
Vorlage: Ein Modell oder eine Schablone, die als Leitfaden dient. Zum Beispiel ein Schnittmuster für Kleidung.
Struktur/Schema: Ein sich wiederholendes Arrangement von Elementen.
Zum Beispiel ein Verhaltensmuster oder ein Software-Design-Pattern.
Regelmäßigkeit: Ein erkennbares und wiederkehrendes Verhalten oder Ereignis.
Zum Beispiel Muster in Daten oder in der Natur.
* */
package JAVA_Insel_Smart.OCA.Kapitel_5.String_Zerlegen;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_und_Pattern_Methode {
    public static void main(String[] args) {
        String text = "eins1zwei2drei3vier4";

        Pattern strukturMusterVorlage = Pattern.compile("\\d");
        Matcher zuordnungVergleichsMechanismus = strukturMusterVorlage.matcher(text);

        while (zuordnungVergleichsMechanismus.find()) {
            System.out.println("Gefundene Nummern: " + zuordnungVergleichsMechanismus.group());
        }
        // Ausgabe:
        // Found number: 1
        // Found number: 2
        // Found number: 3
        // Found number: 4
    }
}
