package JAVA_Insel_Smart.OCA.Kapitel_5;

public class Stringbuilder_ZeichenFolgen_erfragen {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        char ch = sb.charAt(1); // 'e'
        String sub = sb.substring(1, 4); // "ell"

        System.out.println(sb);
        System.out.println(ch);
        System.out.println(sub);

    }
}
