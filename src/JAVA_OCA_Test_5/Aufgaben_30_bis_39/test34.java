/*
Which of the block of codes can be used to replace /*INSERT such that there is no compilation error?
Select 3 options.
------------------------------------------------------------------------------------------------------------------------
Correct selection
try {

    save();

    log();

} catch(SQLException | IOException ex) {}
------------------------------------------------------------------------------------------------------------------------
Correct selection
try {

    save();

    log();

} catch(Exception ex) {}
------------------------------------------------------------------------------------------------------------------------
Correct selection
try {

    save();

    log();

} catch(IOException | SQLException ex) {}
------------------------------------------------------------------------------------------------------------------------
FALSCH
------------------------------------------------------------------------------------------------------------------------
try {

    save();

    log();

} catch(Exception | RuntimeException ex) {}
------------------------------------------------------------------------------------------------------------------------
try {

    save();

    log();

} catch(IOException | Exception ex) {}
------------------------------------------------------------------------------------------------------------------------
try {

    save();

    log();

} catch(SQLException | Exception ex) {}
 * */
package JAVA_OCA_Test_5.Aufgaben_30_bis_39;

import java.io.IOException;
import java.sql.SQLException;

public class test34 {
    public static void main(String[] args) {
        /*INSERT*/
        try {

            save();

            log();

        } catch(SQLException | IOException ex) {}
    }

    private static void save() throws IOException {}

    private static void log() throws SQLException {}
}
