package JAVA_Insel_Smart.OCA.Kapitel_6.Aufzählungstypen_enum;

public class Enum_mit_Methoden_und_Feldern {
    public static void main(String[] args) {

        Day today = Day.MONDAY;
        System.out.println("Heute ist: " + today + ", Beschreibung: " + today.getDescription());
    }

    enum Day {
        MONDAY("Start of the work week"),
        TUESDAY("Second day"),
        WEDNESDAY("Midweek"),
        THURSDAY("Almost Friday"),
        FRIDAY("End of the work week"),
        SATURDAY("Weekend"),
        SUNDAY("Weekend");

        private String description;

        Day(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

    }
}
