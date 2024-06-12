/*
import java.util.*;

class Father {}

class Son extends Father {}

class GrandSon extends Son {}

abstract class Super {
    abstract List<Father> get();
}

class Sub extends Super {
    /*INSERT
}


        And the definitions of get() method:

        1. List<Father> get() {return null;}    //<--- korrekt

        2. ArrayList<Father> get() {return null;}

        3. List<Son> get() {return null;}

        4. ArrayList<Son> get() {return null;}

        5. List<GrandSon> get() {return null;}

        6. ArrayList<GrandSon> get() {return null;}

        7. List<Object> get() {return null;}

        8. ArrayList<Object> get() {return null;}

        How many definitions of get() method can replace /*INSERT such that there is no compilation error?
Correct answer
Two definitions
 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_30_bis_39;
import java.util.*;

class Father {}

class Son extends Father {}

class GrandSon extends Son {}

abstract class Super {
    abstract List<Father> get();
}

class Sub extends Super {
    /*INSERT*/
    List<Father> get() {return null;}       //<--- korrekt
//    ArrayList<Father> get() {return null;}
//
//    List<Son> get() {return null;}
//
//    ArrayList<Son> get() {return null;}
//
//    List<GrandSon> get() {return null;}
//
//    ArrayList<GrandSon> get() {return null;}
//
//    List<Object> get() {return null;}
//
//    ArrayList<Object> get() {return null;}
}

public class test39 {
    public static void main(String[] args) {

    }
}
