package JAVA_Insel_Smart.OCA.Kapitel_5;

public class String_Teile_extrahieren {
    public static void main(String[] args) {
        // 5.4.8 String-Teile extrahieren
        // die Methoden substring(int beginIndex) und substring(int beginIndex, int endIndex)
        // extrahieren Teile eines Strings.
        String sub = "Hello".substring(1, 4); // "ell"  start 1 und end 4 Index
        System.out.println(sub);

    }
}
