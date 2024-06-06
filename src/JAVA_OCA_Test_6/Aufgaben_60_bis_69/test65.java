/*


 * */
package JAVA_OCA_Test_6.Aufgaben_60_bis_69;

interface Blogger {
    default void blog() throws Exception {
        System.out.println("GENERIC");
    }
}

class TravelBlogger implements Blogger {
    public void blog() {
        System.out.println("TRAVEL");
    }
}

public class test65 {
    public static void main(String[] args) {
        Blogger blogger = new TravelBlogger(); //Line n1
        ((TravelBlogger)blogger).blog(); //Line n2
    }
}
