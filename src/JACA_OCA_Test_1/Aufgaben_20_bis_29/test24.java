package JACA_OCA_Test_1.Aufgaben_20_bis_29;

public class test24 {


    interface Printable {
        public void setMargin();

        public void setOrientation();
    }

    abstract class Paper implements Printable { // Line 7
        public void setMargin() {
        }
        // Line 9
    }

    abstract class NewsPaper extends Paper { // Line 12
        public void setMargin() {
        }

        @Override
        public void setOrientation() {

        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
// Was muss geändert werden und warum ???

//    interface Printable {
//        public void setMargin();
//        public void setOrientation();
//    }
//
//    abstract class Paper implements Printable { // Line 7
//        public void setMargin() {}
//        // Line 9
//    }
//
//    class NewsPaper extends Paper { // Line 12
//        public void setMargin() {}
//        // Line 14
//    }



