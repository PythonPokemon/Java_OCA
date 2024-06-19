package JAVA_Insel_Smart.OCA.Kapitel_5;

public class StringBuilder_setzen_löschen_umdrehen {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hallo"); // Index 0=H, 1=a, 2=l, 3=l, 4=o

        // Methode zum Setzen von Zeichen und Zeichen folgen
        sb1.setCharAt(1, 'i'); // ändert das Element im Index 1 zu i

        // Methode zum Löschen von Zeichen und Zeichen folgen
        StringBuilder sb2 = new StringBuilder("Sonne");
        sb2.deleteCharAt(1); // "Snne"

        // Methode zum Umdrehen von Zeichen und Zeichen folgen
        StringBuilder sb3 = new StringBuilder("Wasser");
        sb3.reverse(); // "ressaW"

        System.out.println(sb1);    // "Hallo"
        System.out.println(sb2);    // "Snne"
        System.out.println(sb3);    // "ressaW"
    }
}
