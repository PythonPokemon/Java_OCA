/*
Which of the options can be used to replace INSERT such that there is no compilation error?
Select 5 options.
------------------------------------------------------------------------------------------------------------------------
Error                   //<--- Correct selection
NullPointerException    //<--- Correct selection
RuntimeException        //<--- Correct selection
SQLException            //<--- Correct selection
SQLWarning              //<--- Correct selection
------------------------------------------------------------------------------------------------------------------------
java.io.IOException
Throwable
Exception
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_60_bis_69;
import java.sql.*;

interface Multiplier {
    void multiply(int... x) throws SQLException;
}

class Calculator implements Multiplier {
    public void multiply(int... x) throws Error/*<---INSERT*/ {

    }
}

public class test64 {
    public static void main(String[] args) {
        try {
            Multiplier obj = new Calculator(); //Line n1
            obj.multiply(1, 2, 3);
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
}
