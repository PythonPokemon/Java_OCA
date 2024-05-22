/*
 *Wählen Sie die Optionen aus, die die folgenden Spezifikationen erfüllen:

Erstellen Sie eine gut gekapselte Klasse Clock mit einem Instanzvariablenmodell.

Der Wert des Modells sollte außerhalb von Clock zugänglich und änderbar sein.
------------------------------------------------------------------------------------------------------------------------
* Gesamterklärung
Bei der Kapselung geht es darum, eine private Instanzvariable zu haben
*  und öffentliche Getter- und Setter-Methoden bereitzustellen.
 * */

package JAVA_OCA_Test_2.Aufgaben_10_bis_19;

public class test16 {
    public static void main(String[] args) {

    }

//    // variante 1
//    public class Clock {
//        public String model;
//        private String getModel() { return model; }
//        private void setModel(String val) { model = val; }
//    }
//
//    // variante 2
//    public class Clock2 {
//        public String model;
//    }

    // variante 3 | Richtig
    public class Clock3 {
        private String model;
        public String getModel() { return model; }
        public void setModel(String val) { model = val; }
    }

//    // variante 4
//    public class Clock4 {
//        public String model;
//        public String getModel() { return model; }
//        public void setModel(String val) { model = val; }
//    }

}

