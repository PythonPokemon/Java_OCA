package TestAufgaben;
/*  Code Beschreibung.
* In der "main" Methode wird ein Array von Strings namens "table" erstellt und mit den Werten "aa", "bb", "cc" und "dd" initialisiert.
* Die Schleife verwendet eine erweiterte for-Schleife, um jedes Element des Arrays "table" nacheinander zu durchlaufen.
* Innerhalb der Schleife wird überprüft, ob das aktuelle Element gleich "bb" ist.
* Wenn dies der Fall ist, wird das Schlüsselwort "continue" verwendet, um zur nächsten Iteration der Schleife zu springen, ohne den Rest des Schleifenkörpers auszuführen.
* Wenn das aktuelle Element nicht "bb" ist, wird es mit "System.out.println(s)" ausgegeben, wobei "s" das aktuelle Element ist.
* Dann wird überprüft, ob das aktuelle Element gleich "cc" ist.
* Wenn dies der Fall ist, wird das Schlüsselwort "break" verwendet, um die Schleife vorzeitig zu beenden.
* Insgesamt wird dieses Programm also die Ausgabe "aa" und "cc" produzieren.
* Es wird "aa" ausgedruckt, da es das erste Element des Arrays ist und "cc" ausgedruckt wird, weil es nach "bb" kommt und die Schleife beim Erreichen von "cc" unterbrochen wird.
* */
public class LZK3 {
    public static void main(String[] args) {
        String[] table = {"aa", "bb", "cc", "dd"};

        for (
                String s : table) {
            if ("bb".equals(s)) {
                continue;

            }
            System.out.println(s);
            if ("cc".equals(s)) {
                break;
            }
        }
    }
}