package Spiele;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class AutoClicker extends JFrame {
    private JButton clickButton;
    private JButton autoClickButton;
    private JLabel clickCountLabel;
    private int clickCount = 0;
    private boolean isAutoClicking = false;
    private Timer timer;

    public AutoClicker() {
        // Set up the frame
        setTitle("AutoClicker");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // Initialize components
        clickButton = new JButton("Click Me!");
        autoClickButton = new JButton("Auto Click: OFF");
        clickCountLabel = new JLabel("Clicks: 0");

        // Add action listeners
        clickButton.addActionListener(new ClickButtonListener());
        autoClickButton.addActionListener(new AutoClickButtonListener());

        // Add components to frame
        add(clickButton);
        add(autoClickButton);
        add(clickCountLabel);
    }

    private class ClickButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clickCount++;
            clickCountLabel.setText("Clicks: " + clickCount);
        }
    }

    private class AutoClickButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            isAutoClicking = !isAutoClicking;
            if (isAutoClicking) {
                autoClickButton.setText("Auto Click: ON");
                startAutoClick();
            } else {
                autoClickButton.setText("Auto Click: OFF");
                stopAutoClick();
            }
        }
    }

    private void startAutoClick() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                SwingUtilities.invokeLater(() -> {
                    clickCount++;
                    clickCountLabel.setText("Clicks: " + clickCount);
                });
            }
        }, 0, 1000); // Auto click every second (1000 ms)
    }

    private void stopAutoClick() {
        if (timer != null) {
            timer.cancel();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AutoClicker autoClicker = new AutoClicker();
            autoClicker.setVisible(true);
        });
    }
}
