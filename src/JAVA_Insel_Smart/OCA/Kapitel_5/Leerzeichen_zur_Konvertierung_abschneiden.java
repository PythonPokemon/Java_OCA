package JAVA_Insel_Smart.OCA.Kapitel_5;

public class Leerzeichen_zur_Konvertierung_abschneiden {
    public static void main(String[] args) {
        String s = " 1234   ".trim(); // s = "1234" | schneidet das Leerzeichen raus
        int i = Integer.parseInt(s);   // konvertiert den String (s) zu einer Ganzzahl | i = 1234

        System.out.println(s);
        System.out.println(i);
    }
}
