/*
Erklärung
Ausnahmebehandlung mit try-catch-Block:

Die Methode verbindeUndLeseDatenbank behandelt die SQLException direkt innerhalb der Methode.
Ein try-catch-Block wird verwendet, um die SQLException abzufangen und eine Fehlermeldung auszugeben.
Im finally-Block werden die Ressourcen (Verbindung, Statement, ResultSet) geschlossen, um Speicherlecks zu vermeiden.
------------------------------------------------------------------------------------------------------------------------
* */

package JAVA_Insel_Smart.OCA.Kapitel_8.Checked_Exceptions.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExceptionMitTryCatch {
    public static void main(String[] args) {
        verbindeUndLeseDatenbank();
    }

    public static void verbindeUndLeseDatenbank() {
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
        } catch (SQLException e) {
            System.out.println("Fehler beim Zugriff auf die Datenbank: " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (verbindung != null) verbindung.close();
            } catch (SQLException e) {
                System.out.println("Fehler beim Schließen der Ressourcen: " + e.getMessage());
            }
        }
    }
}
