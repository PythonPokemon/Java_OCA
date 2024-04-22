package TestAufgaben;
/*
* Hier wrden nur die Farben mit der Länge einer zeichenkette ungleich 4 aus
* bedeutet red zu klein
* green, yellow, maroon, zu groß
* passend blue , cyan | da diese exakt 4 haben!
* */
public class LZK10 {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "green", "yellow", "maroon", "cyan"};
        for (String c : colors) {
            if (c.length() !=4) {
                continue;
            }
                System.out.println(c+", ");
        }
    }
}
