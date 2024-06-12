/*
* Der Code gibt "Welcome Keller!" aus, weil die main-Methode der Message-Klasse das dritte Element des args-Java_Anfänger_zum_Profi.Arrays ausgibt, das "Keller" ist.
*
* Lassen Sie mich den Ablauf genauer erklären:
*
* Das Programm wird erfolgreich kompiliert.
* Wenn das Programm ausgeführt wird, werden drei Argumente übergeben: "Clare", "Waight" und "Keller".
* Die main-Methode der Klasse Guest wird aufgerufen, und diese ruft die main-Methode der Klasse Message auf und übergibt dabei die drei Argumente.
*
* In der main-Methode der Klasse Message wird args[2] verwendet, um auf das dritte Element des args-Java_Anfänger_zum_Profi.Arrays zuzugreifen.
* Da Java_Anfänger_zum_Profi.Arrays in Java mit 0 indexiert sind:
* args[0] "Clare".
* args[1] "Waight".
* args[2] "Keller".
*
* Das Programm gibt dann "Welcome Keller!" aus, da es das dritte Element des args-Java_Anfänger_zum_Profi.Arrays verwendet.
* Das Ergebnis ist also "Welcome Keller!".*/


//package JACA_OCA_Test_1.Aufgaben_30_bis_39;
//// Guest.java
//// javac Guest.java
//// javac Guest Clare Waight Keller
//
//class Message {
//    static void main(String [] args){
//        System.out.println("Welcome " + args[2] + "!");
//    }
//}
//
//public class Guest {
//    public static void main(String[] args) {
//        Message.main(args);
//    }
//}
