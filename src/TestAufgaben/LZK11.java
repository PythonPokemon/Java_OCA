package TestAufgaben;

/* Code Beschreibung.
* Dieses Java-Programm führt arithmetische Operationen durch und gibt die Ergebnisse aus.
* Die Variable "i" wird deklariert und initialisiert mit dem Wert der arithmetischen Operation "(3 * 2 + 4 + 5)".
* Diese Operation wird von links nach rechts ausgeführt und folgt der Reihenfolge der arithmetischen Operationen (Punkt-vor-Strich-Rechnung).
* Das Ergebnis ist 15, da "3 * 2" 6 ergibt, dann "6 + 4" ergibt 10, und schließlich "10 + 5" ergibt 15.
* Die Variable "j" wird deklariert und initialisiert mit dem Wert der arithmetischen Operation "(3 * (2 + 4) + 5)".
* Die Klammern geben hierbei an, dass zuerst die Operation innerhalb der Klammern ausgeführt wird.
* Also wird zuerst "2 + 4" gerechnet, was 6 ergibt. Dann wird "3 * 6" gerechnet, was 18 ergibt. Schließlich wird "18 + 5" gerechnet, was 23 ergibt.
Die Werte der Variablen "i" und "j" werden mit "System.out.println" ausgegeben.
Die Ausgabe dieses Programms wird sein:
* */
public class LZK11 {
    public static void main(String[] args) {
        int i, j = 0;
        i = (3 * 2 + 4 + 5); // 3 * 2 = 6 + 4 + 5 = 15
        j = (3 * (2 + 4) + 5); // 3 * 6 = 18 + 5 = 23
        System.out.println("i: " + i + "\nj: " + j); // gibt das ergebnis von i = 15 | zeilenumbruch \n | gibt das ergebnis von j = 23
    }
}
