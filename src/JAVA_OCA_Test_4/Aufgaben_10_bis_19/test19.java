/*


 * */
package JAVA_OCA_Test_4.Aufgaben_10_bis_19;
import java.io.*;

class ReadTheFile {

    static void print() throws Exception{ //Line 4 | static void print() {} war falsch
        throw new IOException(); //Line 5
    }
}
//Line 12 | Which 2 changes are necessary so that code compiles successfully?
public class test19 {
    public static void main(String[] args) { //Line 10
//        ReadTheFile.print(); //Line 11 | war falsch

        // Korrekt
        try {
            ReadTheFile.print();
        } catch(Exception e) {
            e.printStackTrace();
        }
//----------------------------------------------------------------------------------------------------------------------
//        // Falsch
//        try {
//            ReadTheFile.print();
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
//----------------------------------------------------------------------------------------------------------------------
//        // Falsch
//        try {
//            ReadTheFile.print();
//        } catch(IOException | Exception e) {
//            e.printStackTrace();
//        }
    }
}
