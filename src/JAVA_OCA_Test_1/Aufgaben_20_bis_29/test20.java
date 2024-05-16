package JAVA_OCA_Test_1.Aufgaben_20_bis_29;

public class test20 {

    // compiler fehler | zum Testen auskommentieren!
//    public static void main(String[] args) {
//        int grade = 60;
//        if(grade = 60)  // <-- da hier ein zuweisungsoperator = | anstatt vergleichs operator == verwendet wurde!
//            System.out.println("You passed...");
//        else
//            System.out.println("You failed");
//    }


    // Korrekt wäre
    public static void main(String[] args) {
        int grade = 60;
        if(grade == 60)  // <-- vergleichs operator == verwenden!
            System.out.println("You passed...");
        else
            System.out.println("You failed");

    }
}
