package JAVA_Insel_Smart.OCA.Datum_und_Zeitwerte.LocalTime;

import java.time.LocalTime;

public class ZeitVergleiche {
    public static void main(String[] args) {

        // Vorgaben
        LocalTime aktuelleZeit = LocalTime.now();
        System.out.println(aktuelleZeit);

        // Mittags Pause
        LocalTime mittagsPause = LocalTime.of(12,00);

        // Arbeitszeit
        LocalTime schichtBeginn = LocalTime.of(8,0);
        LocalTime schichtEnde = LocalTime.of(16,30);
//----------------------------------------------------------------------------------------------------------------------
        // Prüfen, ob die Aktuelle, Zeit vor oder nach der Mittagspause liegt
        boolean istAktuelleZeitVorMittagsPause = aktuelleZeit.isBefore(mittagsPause); // isBefore = vor
        boolean istAktuelleZeitNachMittagsPause = aktuelleZeit.isAfter(mittagsPause); // isAfter = nach

        System.out.println(istAktuelleZeitNachMittagsPause);
        System.out.println(istAktuelleZeitVorMittagsPause);
//----------------------------------------------------------------------------------------------------------------------
        // Prüfen, ob die Schicht zu begonnen hat.
        boolean istAktuelleZeitVorSchichtBeginn = aktuelleZeit.isBefore(schichtBeginn);
        // Prüfen, ob die Schicht zu Ende ist.
        boolean istAktuelleZeitNachSchichtEnde = aktuelleZeit.isAfter(schichtEnde);

        System.out.println(istAktuelleZeitVorSchichtBeginn);
        System.out.println(istAktuelleZeitNachSchichtEnde);
    }
}
