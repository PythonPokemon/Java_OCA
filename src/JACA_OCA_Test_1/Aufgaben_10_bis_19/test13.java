package JACA_OCA_Test_1.Aufgaben_10_bis_19;

public class test13 {

    // Auskommentieren zu Testen.
    // Compiler fehler | weil die variablen deklaration args im Konflikt zu anderen steht
//    public static void main(String[] args) {
//        short[] args = new short[]{50, 50};   <--  args bezeichner/variable steht mit dem obigen args im konflikt
//        args[0] = 5;
//        args[1] = 10;
//        System.out.println("[" + args[0] + ", " + args[1] + "]");
//    }


    // Korrekte ausgabe
    public static void main(String[] args) {
        short[] lola = new short[]{50, 50};      // lösung anderen bezeichner wählen --> lola
        lola[0] = 5;
        lola[1] = 10;
        System.out.println("[" + lola[0] + ", " + lola[1] + "]"); // [5, 10]
    }
}
