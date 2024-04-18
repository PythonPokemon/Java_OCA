package TestSpiele;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickerGameGUI {
    private JFrame frame;
    private JButton clickButton;
    private JButton buyFrontendButton;
    private JButton buyBackendButton;
    private JButton buyFullstackButton;
    private JButton buyAgileScrumButton;
    private JButton buyProductOwnerButton;
    private JButton buyScrumMasterButton;
    private JButton buyDevTeamButton;
    private JButton saveButton;
    private JButton loadButton;
    private JLabel moneyLabel;
    private JLabel clickValueLabel;
    private JLabel upgradeCostLabel;
    private JLabel nameLabel;
    private JTextField nameField;
    private int money;
    private int clickValue;
    private int upgradeCost;
    private int clickCounter;
    private boolean frontendManagerUnlocked;
    private boolean backendManagerUnlocked;
    private boolean fullstackManagerUnlocked;
    private boolean agileScrumUnlocked;
    private boolean productOwnerUnlocked;
    private boolean scrumMasterUnlocked;
    private boolean devTeamUnlocked;
    private double clickMultiplier;
    private double autoClickMultiplier;
    private long lastActiveTime;

    // Variables for highest money player
    private int highestMoney;
    private String playerNameWithHighestMoney;

    public ClickerGameGUI() {
        frame = new JFrame("Clicker Game");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(11, 2));

        nameLabel = new JLabel("Enter your name:");
        frame.add(nameLabel);

        nameField = new JTextField(10);
        frame.add(nameField);

        moneyLabel = new JLabel("Money: $0");
        frame.add(moneyLabel);

        clickValueLabel = new JLabel("Click Value: $1");
        frame.add(clickValueLabel);

        upgradeCostLabel = new JLabel("Upgrade Cost: $10");
        frame.add(upgradeCostLabel);

        clickButton = new JButton("Click");
        clickButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                money += clickValue;
                moneyLabel.setText("Money: $" + money);
                clickCounter++;
                if (clickCounter == 10) {
                    clickValue *= 2;
                    clickValueLabel.setText("Click Value: $" + clickValue);
                    clickCounter = 0;
                }
                updateHighestMoney(); // Update highest money when player clicks
            }
        });
        frame.add(clickButton);

        buyFrontendButton = new JButton("Buy Frontend Developer ($1)");
        buyFrontendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buyManager(1, "Frontend Developer", 1);
            }
        });
        frame.add(buyFrontendButton);

        buyBackendButton = new JButton("Buy Backend Developer ($100)");
        buyBackendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buyManager(100, "Backend Developer", 1);
            }
        });
        frame.add(buyBackendButton);

        buyFullstackButton = new JButton("Buy Fullstack Developer ($1000)");
        buyFullstackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buyManager(1000, "Fullstack Developer", 1);
            }
        });
        frame.add(buyFullstackButton);

        buyAgileScrumButton = new JButton("Buy Agile Scrum Project ($10000)");
        buyAgileScrumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (money >= 10000 && !agileScrumUnlocked) {
                    money -= 10000;
                    moneyLabel.setText("Money: $" + money);
                    agileScrumUnlocked = true;
                    buyAgileScrumButton.setEnabled(false);
                    upgradeCostLabel.setText("Upgrade Cost: $100");
                    updateHighestMoney(); // Update highest money when player buys Agile Scrum Project
                }
            }
        });
        frame.add(buyAgileScrumButton);

        buyProductOwnerButton = new JButton("Buy Product Owner ($100)");
        buyProductOwnerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buyManager(100, "Product Owner", 1);
            }
        });
        frame.add(buyProductOwnerButton);

        buyScrumMasterButton = new JButton("Buy Scrum Master ($500)");
        buyScrumMasterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buyManager(500, "Scrum Master", 1);
            }
        });
        frame.add(buyScrumMasterButton);

        buyDevTeamButton = new JButton("Buy Dev Team ($1000)");
        buyDevTeamButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buyManager(1000, "Dev Team", 1);
            }
        });
        frame.add(buyDevTeamButton);

        saveButton = new JButton("Save Progress");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveProgress();
            }
        });
        frame.add(saveButton);

        loadButton = new JButton("Load Progress");
        loadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadProgress();
            }
        });
        frame.add(loadButton);

        frame.setVisible(true);

        money = 0;
        clickValue = 1;
        upgradeCost = 10;
        clickCounter = 0;
        frontendManagerUnlocked = false;
        backendManagerUnlocked = false;
        fullstackManagerUnlocked = false;
        agileScrumUnlocked = false;
        productOwnerUnlocked = false;
        scrumMasterUnlocked = false;
        devTeamUnlocked = false;
        clickMultiplier = 1.0;
        autoClickMultiplier = 1.0;

        highestMoney = 0;
        playerNameWithHighestMoney = "";

        lastActiveTime = System.currentTimeMillis();
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                long currentTime = System.currentTimeMillis();
                long idleTime = currentTime - lastActiveTime;
                if (idleTime > 0) {
                    double idleHours = idleTime / (1000.0 * 60 * 60);
                    double expectedEarnings = clickValue * autoClickMultiplier * idleHours;
                    money += (int) expectedEarnings;
                    moneyLabel.setText("Money: $" + money);
                    lastActiveTime = currentTime;
                }
            }
        });
        timer.start();
    }

    private void buyManager(int cost, String managerName, double upgradeMultiplier) {
        if (money >= cost && agileScrumUnlocked && !managerUnlocked(managerName)) {
            money -= cost;
            moneyLabel.setText("Money: $" + money);
            unlockManager(managerName);
            updateUpgradeCost();
            clickMultiplier += 0.5;
            autoClickMultiplier += 0.01;
            clickValueLabel.setText("Click Value: $" + (int) (clickValue * clickMultiplier));
            updateHighestMoney(); // Update highest money when player buys a manager
        }
    }

    private boolean managerUnlocked(String managerName) {
        switch (managerName) {
            case "Frontend Developer":
                return frontendManagerUnlocked;
            case "Backend Developer":
                return backendManagerUnlocked;
            case "Fullstack Developer":
                return fullstackManagerUnlocked;
            case "Product Owner":
                return productOwnerUnlocked;
            case "Scrum Master":
                return scrumMasterUnlocked;
            case "Dev Team":
                return devTeamUnlocked;
            default:
                return false;
        }
    }

    private void unlockManager(String managerName) {
        switch (managerName) {
            case "Frontend Developer":
                frontendManagerUnlocked = true;
                buyFrontendButton.setEnabled(false);
                break;
            case "Backend Developer":
                backendManagerUnlocked = true;
                buyBackendButton.setEnabled(false);
                break;
            case "Fullstack Developer":
                fullstackManagerUnlocked = true;
                buyFullstackButton.setEnabled(false);
                break;
            case "Product Owner":
                productOwnerUnlocked = true;
                buyProductOwnerButton.setEnabled(false);
                break;
            case "Scrum Master":
                scrumMasterUnlocked = true;
                buyScrumMasterButton.setEnabled(false);
                break;
            case "Dev Team":
                devTeamUnlocked = true;
                buyDevTeamButton.setEnabled(false);
                break;
        }
    }

    private void updateUpgradeCost() {
        upgradeCost *= 2;
        upgradeCostLabel.setText("Upgrade Cost: $" + upgradeCost);
    }

    private void updateHighestMoney() {
        if (money > highestMoney) {
            highestMoney = money;
            playerNameWithHighestMoney = nameField.getText();
        }
    }

    private void saveProgress() {
        // Speichere den Spieler mit dem höchsten Geldbetrag
        System.out.println("Player with highest money: " + playerNameWithHighestMoney + " - $" + highestMoney);
    }

    private void loadProgress() {
        // Hier kannst du den Spielstand laden, falls du eine Möglichkeit zur Speicherung implementierst
        // In diesem Beispiel wird der Spielstand nicht geladen, da keine Speicherung implementiert ist
        System.out.println("Loading progress...");
    }

    public static void main(String[] args) {
        new ClickerGameGUI();
    }
}
