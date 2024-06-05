/*
Which of the following options, if used to replace /*INSERT*, will compile successfully
and on execution will print LOCK-OPEN on to the console?
------------------------------------------------------------------------------------------------------------------------
None of the other options   <--- Correct answer

(Lock)super.open();
super.open();
((Lock)super).open();
super.super.open();
 * */
package JAVA_OCA_Test_5.Aufgaben_20_bis_29;

class Lock {
    public void open() {
        System.out.println("LOCK-OPEN");
    }
}

class Padlock extends Lock {
    public void open() {
        System.out.println("PADLOCK-OPEN");
    }
}

class DigitalPadlock extends Padlock {
    public void open() {
        /*INSERT*/
    }
}

public class test29 {
    public static void main(String[] args) {
        Lock lock = new DigitalPadlock();
        lock.open();
    }
}
