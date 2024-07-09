package JAVA_Insel_Smart.OCA.Kapitel_2.Switch_Case;

public class Switch_Case_String {
    public static void main(String[] args) {
        String tag = "Mittwoch";

        switch (tag) {
            case "Montag":
                System.out.println("Montag");
                break;
            case "Dienstag":
                System.out.println("Dienstag");
                break;
            case "Mittwoch":
                System.out.println("Mittwoch");
                break;
            default:
                System.out.println("Standardausgabe");
                break;
        }
    }
}
