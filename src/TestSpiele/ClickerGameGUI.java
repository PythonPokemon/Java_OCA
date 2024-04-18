import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClickerGameGUI {
    private JFrame frame;
    private JLabel moneyLabel;
    private JLabel clickValueLabel;
    private JButton clickButton;
    private JButton[] managerButtons;
    private JButton upgradeClickRateButton;
    private int[] managerCosts = {1, 100, 1000};
    private boolean[] managerUnlocked = new boolean[3];
    private int money = 0;
    private int clickValue = 1;
    private int clickRateUpgradeCost = 50;
    private Timer timer;
    private List<Achievement> achievements = new ArrayList<>();

    public ClickerGameGUI() {
        frame = new JFrame("Clicker Game");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        moneyLabel = new JLabel("Money: $" + money);
        frame.add(moneyLabel);

        clickValueLabel = new JLabel("Click Value: $" + clickValue);
        frame.add(clickValueLabel);

        clickButton = new JButton("Click");
        clickButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                money += clickValue;
                moneyLabel.setText("Money: $" + money);
                checkAchievements();
            }
        });
        frame.add(clickButton);

        managerButtons = new JButton[3];
        for (int i = 0; i < managerButtons.length; i++) {
            managerButtons[i] = new JButton("Buy Manager " + (i + 1) + " ($" + managerCosts[i] + ")");
            int index = i;
            managerButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (!managerUnlocked[index] && money >= managerCosts[index]) {
                        managerUnlocked[index] = true;
                        money -= managerCosts[index];
                        clickValue += 1; // Increase click value when a manager is bought
                        updateLabels();
                        startAutoClick();
                        checkAchievements();
                    }
                }
            });
            frame.add(managerButtons[i]);
        }

        upgradeClickRateButton = new JButton("Upgrade Click Rate ($" + clickRateUpgradeCost + ")");
        upgradeClickRateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (money >= clickRateUpgradeCost) {
                    money -= clickRateUpgradeCost;
                    clickRateUpgradeCost *= 2;
                    clickValue += 1;
                    updateLabels();
                    checkAchievements();
                }
            }
        });
        frame.add(upgradeClickRateButton);

        frame.setVisible(true);

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < managerUnlocked.length; i++) {
                    if (managerUnlocked[i]) {
                        money += clickValue;
                        updateLabels();
                        checkAchievements();
                    }
                }
            }
        });

        // Load achievements from file
        loadAchievements();
    }

    private void updateLabels() {
        moneyLabel.setText("Money: $" + money);
        clickValueLabel.setText("Click Value: $" + clickValue);
        for (int i = 0; i < managerButtons.length; i++) {
            if (!managerUnlocked[i] && money >= managerCosts[i]) {
                managerButtons[i].setEnabled(true);
            } else {
                managerButtons[i].setEnabled(false);
            }
        }
        upgradeClickRateButton.setText("Upgrade Click Rate ($" + clickRateUpgradeCost + ")");
    }

    private void startAutoClick() {
        if (!timer.isRunning()) {
            timer.start();
        }
    }

    private void checkAchievements() {
        for (Achievement achievement : achievements) {
            if (!achievement.isUnlocked() && achievement.checkCondition(money, clickValue)) {
                achievement.unlock();
                JOptionPane.showMessageDialog(frame, "Achievement Unlocked: " + achievement.getName());
            }
        }
    }

    private void loadAchievements() {
        try {
            File file = new File("achievements.txt");
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    String name = parts[0];
                    String condition = parts[1];
                    achievements.add(new Achievement(name, condition));
                }
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveAchievements() {
        try {
            FileWriter writer = new FileWriter("achievements.txt");
            for (Achievement achievement : achievements) {
                writer.write(achievement.getName() + "," + achievement.getCondition() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ClickerGameGUI();
    }
}

class Achievement {
    private String name;
    private String condition;
    private boolean unlocked;

    public Achievement(String name, String condition) {
        this.name = name;
        this.condition = condition;
        this.unlocked = false;
    }

    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public void unlock() {
        unlocked = true;
    }

    public boolean checkCondition(int money, int clickValue) {
        // Implement condition checking logic here
        return true;
    }
}
