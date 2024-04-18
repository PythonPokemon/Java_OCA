package TestSpiele;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickerGame{
    private JFrame frame;
    private JButton clickButton;
    private JButton buyFrontendButton;
    private JButton buyBackendButton;
    private JButton buyFullstackButton;
    private JLabel moneyLabel;
    private JLabel clickValueLabel;
    private JLabel upgradeCostLabel;
    private int money;
    private int clickValue;
    private int upgradeCost;
    private int clickCounter;
    private boolean frontendManagerUnlocked;
    private boolean backendManagerUnlocked;
    private boolean fullstackManagerUnlocked;
    private Timer timer;

    public ClickerGame() {
        frame = new JFrame("Clicker Game");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

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
            }
        });
        frame.add(clickButton);

        buyFrontendButton = new JButton("Buy Frontend Developer ($1)");
        buyFrontendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (money >= 1) {
                    money -= 1;
                    moneyLabel.setText("Money: $" + money);
                    frontendManagerUnlocked = true;
                    buyFrontendButton.setEnabled(false);
                    startAutoClick();
                }
            }
        });
        frame.add(buyFrontendButton);

        buyBackendButton = new JButton("Buy Backend Developer ($100)");
        buyBackendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (money >= 100) {
                    money -= 100;
                    moneyLabel.setText("Money: $" + money);
                    backendManagerUnlocked = true;
                    buyBackendButton.setEnabled(false);
                    startAutoClick();
                }
            }
        });
        frame.add(buyBackendButton);

        buyFullstackButton = new JButton("Buy Fullstack Developer ($1000)");
        buyFullstackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (money >= 1000) {
                    money -= 1000;
                    moneyLabel.setText("Money: $" + money);
                    fullstackManagerUnlocked = true;
                    buyFullstackButton.setEnabled(false);
                    startAutoClick();
                }
            }
        });
        frame.add(buyFullstackButton);

        frame.setVisible(true);

        money = 0;
        clickValue = 1;
        upgradeCost = 10;
        clickCounter = 0;
        frontendManagerUnlocked = false;
        backendManagerUnlocked = false;
        fullstackManagerUnlocked = false;

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (frontendManagerUnlocked) {
                    money += clickValue;
                }
                if (backendManagerUnlocked) {
                    money += clickValue;
                }
                if (fullstackManagerUnlocked) {
                    money += clickValue;
                }
                moneyLabel.setText("Money: $" + money);
            }
        });
    }

    private void startAutoClick() {
        if (!timer.isRunning()) {
            timer.start();
        }
    }

    public static void main(String[] args) {
        new ClickerGame();
    }
}
