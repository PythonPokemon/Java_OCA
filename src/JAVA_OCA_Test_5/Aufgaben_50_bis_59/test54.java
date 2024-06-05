/*
Which of the following declarations/definitions can replace /*INSERT such that there is no compilation error?

Select 5 options.

//    public void travel(Object obj) {}                 //<--- Korrekt
//    abstract void travel(String beach);               //<--- Korrekt
//    public abstract void travel();                    //<--- Korrekt
//    abstract void travel();                           //<--- Korrekt
//    public void travel() throws RuntimeException {}   //<--- Korrekt
//    public void travel(String beach) throws Exception {}
//    void travel(String beach) throws java.io.IOException {}

 * */
package JAVA_OCA_Test_5.Aufgaben_50_bis_59;

abstract class Traveller {
    void travel(String place) {
    }
}

abstract class BeachTraveller extends Traveller {
    /*INSERT*/
    public void travel(Object obj) {
    }                 //<--- Korrekt
//    abstract void travel(String beach);               //<--- Korrekt
//    public abstract void travel();                    //<--- Korrekt
//    abstract void travel();                           //<--- Korrekt
//    public void travel() throws RuntimeException {}   //<--- Korrekt
//    public void travel(String beach) throws Exception {}
//    void travel(String beach) throws java.io.IOException {}
}

public class test54 {
    public static void main(String[] args) {

    }
}
