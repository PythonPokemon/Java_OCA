package JAVA_Insel_Smart.OCA.Datum_und_Zeitwerte.LocalDate;

import java.time.LocalDate;

public class DatumVergleiche {
    public static void main(String[] args) {

        // Vorgaben
        LocalDate startDatum = LocalDate.of(2020, 1, 1);
        LocalDate endDatum = LocalDate.of(2023, 7, 8);

        // Silvester-Datum (31. Dezember) für ein bestimmtes Jahr, z.B. 2020
        LocalDate silvester = LocalDate.of(2020, 12, 31);
//----------------------------------------------------------------------------------------------------------------------
        // Prüfen, ob das startDatum vor oder nach Silvester liegt
        boolean istStartDatumVorSilvester = startDatum.isBefore(silvester); // isBefore = vor
        boolean istStartDatumNachSilvester = startDatum.isAfter(silvester); // isAfter = nach

        System.out.println("\n" + "Startdatum liegt vor Silvester: " + istStartDatumVorSilvester); // Ausgabe: true oder false
        System.out.println("Startdatum liegt nach Silvester: " + istStartDatumNachSilvester); // Ausgabe: true oder false
//----------------------------------------------------------------------------------------------------------------------
        // Prüfen, ob das endDatum vor oder nach Silvester liegt
        boolean istEndDatumVorSilvester = endDatum.isBefore(silvester);
        boolean istEndDatumNachSilvester = endDatum.isAfter(silvester);

        System.out.println("\n" + "Enddatum liegt vor Silvester: " + istEndDatumVorSilvester); // Ausgabe: true oder false
        System.out.println("Enddatum liegt nach Silvester: " + istEndDatumNachSilvester); // Ausgabe: true oder false
    }
}
