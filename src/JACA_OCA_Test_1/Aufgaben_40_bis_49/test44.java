package JACA_OCA_Test_1.Aufgaben_40_bis_49;

public class test44 {
    public static void main(String[] args) {
        Boolean ask1 = true;
        Boolean ask2 = false;

        String question = "Which of the following is the correct way to make the variable 'passportNO' wich will return its value";

        String option1 = "Make 'passportNo' static and provide a public static method getPassportNo() which\n" +
                "will return its value. = ";

        String option2 = "Make 'passportNo' private and provide a public method getPassportNo() which will\n" +
                "return its value. = ";

        String option3 = "Remove 'public' from the 'passportNo' declaration. i.e., change line 2 to int\n" +
                "passportNo; = ";

        String option4 = "Make 'passportNo' private. = ";

        System.out.println(option1 + ask2);
        System.out.println(option2 + ask1);
        System.out.println(option3 + ask2);
        System.out.println(option4 + ask2);
    }
}
