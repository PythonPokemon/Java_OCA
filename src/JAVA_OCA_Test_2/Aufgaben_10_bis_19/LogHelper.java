package JAVA_OCA_Test_2.Aufgaben_10_bis_19;

//abstract class Helper {
//    int num = 100; // package-private
//    String operation = null; // package-private
//
//    protected abstract void help(); // protected
//
//    void log() { // package-private
//        System.out.println("Helper-log");
//    }
//}
//
//public class LogHelper extends Helper { // public class LogHelper
//    private int num = 200; // private
//    protected String operation = "LOGGING"; // protected
//
//    public void help() { // package-private
//        System.out.println("LogHelper-help");
//    }
//
//    void log() { // package-private
//        System.out.println("LogHelper-log");
//    }
//
//    public static void main(String[] args) {
//        new LogHelper().help();
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
// Falsch
//abstract class Helper {
//    int num = 100;
//    String operation = null;
//
//    protected abstract void help();
//
//    void log() {
//        System.out.println("Helper-log");
//    }
//}
//
//public class LogHelper extends Helper {
//    private int num = 200;
//    protected String operation = "LOGGING";
//
//    void help() {
//        System.out.println("LogHelper-help");
//    }
//
//    void log() {
//        System.out.println("LogHelper-log");
//    }
//
//    public static void main(String [] args) {
//        new LogHelper().help();
//    }
//}