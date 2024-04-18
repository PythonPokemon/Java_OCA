package TestSpiele;

import java.util.Scanner;

public class ClickerGame {
    private int money;
    private int clickValue;
    private int upgradeCost;
    private int upgradeMultiplier;

    public ClickerGame() {
        money = 0;
        clickValue = 1;
        upgradeCost = 10;
        upgradeMultiplier = 2;
    }

    public void click() {
        money += clickValue;
        System.out.println("You clicked! You earned $" + clickValue);
    }

    public void buyUpgrade() {
        if (money >= upgradeCost) {
            money -= upgradeCost;
            clickValue *= upgradeMultiplier;
            upgradeCost *= upgradeMultiplier;
            System.out.println("You bought an upgrade! Click value increased to $" + clickValue);
            System.out.println("Upgrade cost increased to $" + upgradeCost);
        } else {
            System.out.println("Not enough money to buy upgrade!");
        }
    }

    public void displayStats() {
        System.out.println("Money: $" + money);
        System.out.println("Click value: $" + clickValue);
        System.out.println("Upgrade cost: $" + upgradeCost);
    }

    public static void main(String[] args) {
        ClickerGame game = new ClickerGame();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Clicker Game!");

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Click");
            System.out.println("2. Buy Upgrade");
            System.out.println("3. Display Stats");
            System.out.println("4. Quit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    game.click();
                    break;
                case 2:
                    game.buyUpgrade();
                    break;
                case 3:
                    game.displayStats();
                    break;
                case 4:
                    System.out.println("Thanks for playing!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}

