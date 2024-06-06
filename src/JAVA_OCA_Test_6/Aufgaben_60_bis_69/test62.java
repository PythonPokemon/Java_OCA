/*
Line 14 causes compilation error. Which of the following changes enables to code to print LENGTH SHOULD BE GREATER THAN 0?
Replace Line 14 with 'catch(RuntimeException e) {'  //<--- Correct answer

Replace Line 14 with 'catch(IllegalArgumentException | Exception e) {'
Replace Line 14 with 'catch(IllegalArgumentException | RuntimeException e) {'
Comment out Line 14, Line 15 and Line 16
Replace Line 14 with 'catch(RuntimeException | Exception e) {'

 * */
package JAVA_OCA_Test_6.Aufgaben_60_bis_69;

//public class test62 {
//    public static void convert(String s)
//            throws IllegalArgumentException, RuntimeException, Exception {
//        if(s.length() == 0) {
//            throw new RuntimeException("LENGTH SHOULD BE GREATER THAN 0");
//        }
//    }
//    public static void main(String [] args) {
//        try {
//            convert("");
//        }
//        catch(IllegalArgumentException | RuntimeException | Exception e) { //Line 14
//            System.out.println(e.getMessage()); //Line 15
//        } //Line 16
//        catch(Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
