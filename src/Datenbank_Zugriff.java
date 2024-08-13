import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Datenbank_Zugriff {
    public static void main(String[] args) {
        // JDBC URL, Benutzername und Passwort der MySQL-Datenbank
        String sql = "SELECT vorname FROM teilnehmer WHERE tnr = 1;";
        String url = "jdbc:mysql://localhost:3306/fortbildung"; // MySQL JDBC URL
        String user = "root"; // Dein MySQL-Benutzername
        String password = "Rsql2024"; // Dein MySQL-Passwort

        try {
            // Verbindung zur MySQL-Datenbank herstellen
            Connection con = DriverManager.getConnection(url, user, password);

            // Statement erstellen und SQL-Abfrage ausführen
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            // Ergebnis verarbeiten
            if (rs.next()) {
                String vorname = rs.getString(1);
                System.out.println(vorname);
            }

            // Ressourcen schließen
            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
