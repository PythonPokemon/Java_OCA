package JAVA_Insel_Smart.OCA.Kapitel_6.Aufzählungstypen_enum;

public class Enum_IF_Else {

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
        Day today = Day.WEDNESDAY;

        // Verwenden eines if-else-Konstrukts, um den Tag zu überprüfen
        if (today == Day.MONDAY) {
            System.out.println("Heute ist Montag.");
        } else if (today == Day.TUESDAY) {
            System.out.println("Heute ist Dienstag.");
        } else if (today == Day.WEDNESDAY) {
            System.out.println("Heute ist Mittwoch.");
        } else if (today == Day.THURSDAY) {
            System.out.println("Heute ist Donnerstag.");
        } else if (today == Day.FRIDAY) {
            System.out.println("Heute ist Freitag.");
        } else if (today == Day.SATURDAY) {
            System.out.println("Heute ist Samstag.");
        } else if (today == Day.SUNDAY) {
            System.out.println("Heute ist Sonntag.");
        } else {
            System.out.println("Ungültiger Tag.");
        }
    }
}
