package JAVA_Insel_Smart.OCA.Kapitel_5;

public class StringObjekte_mit_Konstruktoren_aus_Wiederholungen_erzeugen {
    public static void main(String[] args) {
        // Bsp. 1
        String repeated = new String(new char[] {'a', 'b', 'c' }); // "abc"
        String repeatedString = new String(new char[] { 'a', 'b', 'c' }, 1, 2); // "bc"
        String repeat = "abc".repeat(3); // "abcabcabc"

        System.out.println(repeated);
        System.out.println(repeatedString);
        System.out.println(repeat);
        System.out.println("-------------------------------------");
//----------------------------------------------------------------------------------------------------------------------
        // Bsp.2
        // Erzeugung eines Strings mit einem Konstruktor aus einem char-Array
        char[] charArray = { 'a', 'b', 'c' };
        String str1 = new String(charArray);
        System.out.println("Erzeugt aus char-Array: " + str1); // Ausgabe: "abc"

        // Erzeugung eines Teilstrings mit einem Konstruktor aus einem char-Array
        String str2 = new String(charArray, 1, 2);
        System.out.println("Teilstring aus char-Array: " + str2); // Ausgabe: "bc"

        // Erzeugung eines wiederholten Strings
        String str3 = "abc".repeat(3);
        System.out.println("Wiederholter String: " + str3); // Ausgabe: "abcabcabc"
    }
}
