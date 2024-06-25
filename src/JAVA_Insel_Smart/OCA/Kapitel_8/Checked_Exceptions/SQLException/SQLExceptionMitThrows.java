/*
Erklärung
Ausnahmebehandlung mit throws in der Methodensignatur:

Die Methode verbindeUndLeseDatenbank deklariert throws SQLException in ihrer Signatur
und behandelt die Ausnahme nicht direkt.

Die Ausnahme wird an die aufrufende Methode (main) weitergeleitet.
Die main-Methode enthält einen try-catch-Block, um die SQLException zu behandeln,
wenn ein Fehler beim Datenbankzugriff auftritt.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Checked_Exceptions.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExceptionMitThrows {
    public static void main(String[] args) {
        try {
            verbindeUndLeseDatenbank();
        } catch (SQLException e) {
            System.out.println("Fehler beim Zugriff auf die Datenbank: " + e.getMessage());
        }
    }

    public static void verbindeUndLeseDatenbank() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/meine_datenbank";
        String benutzer = "benutzername";
        String passwort = "passwort";

        Connection verbindung = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            verbindung = DriverManager.getConnection(url, benutzer, passwort);
            statement = verbindung.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM meine_tabelle");

            while (resultSet.next()) {
                System.out.println("Daten: " + resultSet.getString("spalte"));
            }
        } finally {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (verbindung != null) verbindung.close();
        }
    }
}
