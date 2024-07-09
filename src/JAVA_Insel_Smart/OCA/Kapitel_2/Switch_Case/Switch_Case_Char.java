package JAVA_Insel_Smart.OCA.Kapitel_2.Switch_Case;

public class Switch_Case_Char {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Ausgezeichnet");
                break;
            case 'B':
                System.out.println("Gut");
                break;
            case 'C':
                System.out.println("Befriedigend");
                break;
            default:
                System.out.println("Standardausgabe");
                break;
        }
    }
}
