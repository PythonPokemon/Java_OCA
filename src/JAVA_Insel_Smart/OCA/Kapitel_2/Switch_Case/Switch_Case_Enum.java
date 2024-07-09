package JAVA_Insel_Smart.OCA.Kapitel_2.Switch_Case;

public class Switch_Case_Enum {

    // enum aufzählung separat, außerhalb der mein methode
    enum Wochentag {
        MONTAG, DIENSTAG, MITTWOCH
    }

    public static void main(String[] args) {
        Wochentag tag = Wochentag.MITTWOCH;

        switch (tag) {
            case MONTAG:
                System.out.println("Montag");
                break;
            case DIENSTAG:
                System.out.println("Dienstag");
                break;
            case MITTWOCH:
                System.out.println("Mittwoch");
                break;
            default:
                System.out.println("Standardausgabe");
                break;
        }
    }
}
