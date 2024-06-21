package JAVA_Insel_Smart.OCA.Kapitel_6.Aufzählungstypen_enum;

public class Einfaches_Enum_Beispiel {

    // Schritt 1: Definieren des Enums
    public enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        // Deklarieren und Initialisieren einer Enum-Variable
        Day today = Day.MONDAY;

        // Direkte Verwendung des Enums in einer Ausgabe
        System.out.println("Heute ist " + today);

        // Überprüfen des Enum-Werts
        if (today == Day.MONDAY) {
            System.out.println("Heute ist der erste Tag der Woche.");
        }

        // Enum-Werte in einer Schleife durchlaufen
        System.out.println("Alle Tage der Woche:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }

    }
}
