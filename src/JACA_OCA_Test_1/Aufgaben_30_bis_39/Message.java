package JACA_OCA_Test_1.Aufgaben_30_bis_39; // zur aufgabe 33

//public class Message {
//    public static void main(String [] args){
//        System.out.println("Welcome " + args[2] + "!");
//    }
//}

public class Message {
    public static void main(String [] args){
        if (args.length >= 3) {
            System.out.println("Welcome " + args[2] + "!");
        } else {
            System.out.println("Not enough arguments provided.");
        }
    }
}