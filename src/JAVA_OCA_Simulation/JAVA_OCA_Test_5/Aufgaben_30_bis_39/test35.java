/*


 * */
package JAVA_OCA_Simulation.JAVA_OCA_Test_5.Aufgaben_30_bis_39;
import java.sql.SQLException;

public class test35 {
    private static void m() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            m();
        } catch(SQLException e) {
            System.out.println("CAUGHT SUCCESSFULLY");  // CAUGHT SUCCESSFULLY
        }
    }
}
