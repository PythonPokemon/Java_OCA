package TestAufgaben;

/* Code Beschreibung.
 * Zuerst wird überprüft, ob "value" größer oder gleich 0 ist.
 * Da "value" 33 ist und größer als 0, wird der Block innerhalb dieser Bedingung ausgeführt.
 * Innerhalb dieser Bedingung gibt es weitere Bedingungen:
 * Die zweite Bedingung überprüft, ob "value" ungleich 0 ist. Da "value" 33 ist, wird "The " ausgegeben.
 * Die dritte Bedingung wird übersprungen, da "value" größer als 10 ist.
 * Die vierte Bedingung überprüft, ob "value" größer als 30 ist. Da "value" 33 ist, wird "fox " ausgegeben.
 * Die fünfte Bedingung wird übersprungen, da "value" größer als 10 ist.
 * Die sechste Bedingung überprüft, ob "value" größer als 10 ist. Da "value" 33 ist, wird "lazy " ausgegeben.
 * Schließlich wird "The fox lazy" ausgegeben.
 * */
public class LZK6 {
    public static void main(String[] args) {
        int value = 33;
        if (value >= 0) {
            if (value != 0)
                System.out.println("The ");
            else
                System.out.println("quick ");
            if (value < 10)
                System.out.println("brown ");
            else if (value > 30)
                System.out.println("fox ");
            else if (value < 50)
                System.out.println("jumps ");
            else if (value < 10)
                System.out.println("over ");
            else
                System.out.println("The ");
            if (value > 10)
                System.out.println("lazy ");
        } else {
            System.out.println("dog ");
        }
        System.out.println("...");
    }
}
