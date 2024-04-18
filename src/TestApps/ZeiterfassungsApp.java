package TestApps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ZeiterfassungsApp extends JFrame {
    private ScreenManager screenManager;

    public ZeiterfassungsApp() {
        screenManager = new ScreenManager();
        add(screenManager);
        setTitle("Zeiterfassungs App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ZeiterfassungsApp();
    }
}

class ScreenManager extends JPanel {
    private ZeiterfassungScreen zeiterfassungScreen;

    public ScreenManager() {
        setLayout(new CardLayout());
        zeiterfassungScreen = new ZeiterfassungScreen();
        add(zeiterfassungScreen, "zeiterfassung");
        CardLayout layout = (CardLayout) getLayout();
        layout.show(this, "zeiterfassung");
    }
}

class ZeiterfassungScreen extends JPanel {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private LocalDateTime pauseStartTime;
    private Duration pauseDuration;

    private JLabel label;
    private JButton startButton;
    private JButton endButton;
    private JButton pauseButton;
    private JButton saveToDatabaseButton;

    public ZeiterfassungScreen() {
        setLayout(new GridLayout(5, 1));
        label = new JLabel("Zeiterfassung: 00:00:00");
        startButton = new JButton("Start");
        endButton = new JButton("Ende");
        pauseButton = new JButton("Pause");
        saveToDatabaseButton = new JButton("Daten in Datenbank speichern");

        startButton.addActionListener(e -> startTimer());
        endButton.addActionListener(e -> endTimer());
        pauseButton.addActionListener(e -> pauseTimer());
        saveToDatabaseButton.addActionListener(e -> saveToDatabase());

        add(label);
        add(startButton);
        add(endButton);
        add(pauseButton);
        add(saveToDatabaseButton);
    }

    private void startTimer() {
        startTime = LocalDateTime.now();
        label.setText("Zeiterfassung läuft...");
    }

    private void endTimer() {
        if (startTime != null) {
            endTime = LocalDateTime.now();
            Duration elapsedTime = calculateElapsedTime();
            label.setText("Zeiterfassung beendet: " + formatDuration(elapsedTime));
        } else {
            label.setText("Starte zuerst die Zeiterfassung!");
        }
    }

    private void pauseTimer() {
        pauseStartTime = LocalDateTime.now();
        label.setText("Pause gestartet...");
    }

    private void saveToDatabase() {
        if (startTime != null && endTime != null) {
            Connection conn = null;
            PreparedStatement stmt = null;
            try {
                conn = DriverManager.getConnection("jdbc:sqlite:zeiterfassung.db");
                stmt = conn.prepareStatement("INSERT INTO zeiterfassung (start_time, end_time, pause_duration, total_time) VALUES (?, ?, ?, ?)");
                stmt.setString(1, startTime.toString());
                stmt.setString(2, endTime.toString());
                stmt.setString(3, pauseDuration.toString());
                stmt.setString(4, calculateElapsedTime().toString());
                stmt.executeUpdate();
                label.setText("Daten in Datenbank gespeichert");
            } catch (SQLException e) {
                label.setText("Fehler beim Speichern der Daten: " + e.getMessage());
            } finally {
                try {
                    if (stmt != null) stmt.close();
                    if (conn != null) conn.close();
                } catch (SQLException e) {
                    label.setText("Fehler beim Schließen der Verbindung: " + e.getMessage());
                }
            }
        } else {
            label.setText("Starte zuerst und beende dann die Zeiterfassung!");
        }
    }

    private Duration calculateElapsedTime() {
        Duration totalDuration = Duration.between(startTime, endTime);
        if (pauseStartTime != null) {
            LocalDateTime pauseEndTime = LocalDateTime.now();
            Duration pauseTime = Duration.between(pauseStartTime, pauseEndTime);
            totalDuration = totalDuration.minus(pauseTime);
            pauseDuration = pauseTime;
        }
        return totalDuration;
    }

    private String formatDuration(Duration duration) {
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
