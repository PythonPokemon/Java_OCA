/*


 * */
package JAVA_OCA_Test_5.Aufgaben_1_bis_9;
import java.sql.SQLException;

public class test8 {
    private static void availableSeats() throws SQLException {
        throw null; //Line 7
    }

    public static void main(String[] args) {
        try {
            availableSeats(); //Line 12
        } catch(SQLException e) {
            System.out.println("SEATS NOT AVAILABLE");  // Program ends abruptly | .NullPointerException
        }
    }
}
