/*
Which of the following options, if used to replace

Select 4 options.

((Rideable)horse).ride("emma");             //<--- Correct selection
((Horse)(Rideable)horse).ride("emma");      //<--- Correct selection
((Horse)horse).ride("Emma");                //<--- Correct selection
((Rideable)(Horse)horse).ride("EMMA");      //<--- Correct selection

horse.ride("EMMA");
(Rideable)(Horse)horse.ride("EMMA");
(Rideable)horse.ride("emma");
(Horse)(Rideable)horse.ride("EMMA");
(Horse)horse.ride("EMMA");
 * */
package JAVA_OCA_Test_6.Aufgaben_20_bis_29;

interface Rideable {
    void ride(String name);
}

class Animal {}

class Horse extends Animal implements Rideable {
    public void ride(String name) {
        System.out.println(name.toUpperCase() + " IS RIDING THE HORSE");
    }
}

public class test28 {
    public static void main(String[] args) {
        Animal horse = new Horse();
        /*INSERT*/
        ((Rideable)horse).ride("emma"); //<--- Correct selection
    }
}
