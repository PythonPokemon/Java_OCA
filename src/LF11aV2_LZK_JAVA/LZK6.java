package LF11aV2_LZK_JAVA;

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
        if (value >= 0) {                       // wenn 33 größer gleich null, prüfe bedingung und printe 'The'
            if (value != 0)
                System.out.println("The ");     // printed 'The' weil 33 ungleich 0 ist.
            else
                System.out.println("quick ");
            if (value < 10)                     // trifft nicht zu, da 33 nicht kleiner 10 ist | also weitere bedingung prüfen
                System.out.println("brown ");
            else if (value > 30)                // trifft zu da, 33 größer 30 ist | also werden weitere else if nicht abgefragt
                System.out.println("fox ");
            else if (value < 50)
                System.out.println("jumps ");   // wird übersprungen, da die vorherige bedingung zutreffend war.
            else if (value < 10)
                System.out.println("over ");    // wird übersprungen, da die vorherige bedingung zutreffend war.
            else
                System.out.println("The ");     // wird übersprungen, da die vorherige bedingung zutreffend war.
            if (value > 10)
                System.out.println("lazy ");    // Prüft ob 33 größer 10 ist, wenn ja print 'lazy'
        } else {
            System.out.println("dog ");
        }
        System.out.println("...");
    }
}
