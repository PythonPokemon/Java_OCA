/*
Beispiel mit enum
Enums (Aufzählungstypen) sind eine spezielle Art von Klasse in Java, die eine Gruppe von Konstanten repräsentiert.
Enums werden verwendet, wenn Sie eine Variable haben, die nur einen Satz von vordefinierten Werten annehmen kann,
z.B. Wochentage, Monate, Status, etc.
------------------------------------------------------------------------------------------------------------------------
Erklärung
Definition des Enums:

Enums werden mit dem Schlüsselwort enum definiert.
Enums können entweder innerhalb oder außerhalb einer Klasse definiert werden, aber nicht innerhalb von Methoden.
Im obigen Beispiel wird das Enum Day innerhalb der Klasse, aber außerhalb der main-Methode definiert.
Verwendung von Enums:

Enums können wie normale Variablen verwendet werden.
Im obigen Beispiel wird eine Variable today des Typs Day deklariert und mit Day.MONDAY initialisiert.
Switch-Statement mit Enums:

Enums können in einem switch-Statement verwendet werden.
Jedes Enum-Konstante ist ein case im switch-Statement.
* */

package JAVA_Insel_Smart.OCA.Kapitel_6.Aufzählungstypen_enum;

public class enum_Switch_Case {

    public static void main(String[] args) {

        // Deklaration des Enums außerhalb der main-Methode
        Day today = Day.MONDAY;

        // Verwenden von Enums in einem switch-Statement
        switch (today) {
            case MONDAY:
                System.out.println("Heute ist Montag!");
                break;
            case TUESDAY:
                System.out.println("Heute ist Dienstag!");
                break;
            case WEDNESDAY:
                System.out.println("Heute ist Mittwoch!");
                break;
            case THURSDAY:
                System.out.println("Heute ist Donnerstag!");
                break;
            case FRIDAY:
                System.out.println("Heute ist Freitag!");
                break;
            case SATURDAY:
                System.out.println("Heute ist Samstag!");
                break;
            case SUNDAY:
                System.out.println("Heute ist Sonntag!");
                break;
            default:
                System.out.println("Unbekannter Tag!");
                break;
        }
    }

    // Deklaration des Enums außerhalb der main-Methode
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
