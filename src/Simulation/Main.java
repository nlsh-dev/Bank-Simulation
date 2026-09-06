package Simulation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SavingsAccount account = new SavingsAccount(
                "ACC1001",
                "Neelesh",
                10000,
                1000
        );

        int choice;

        do {
            System.out.println("\n==============================");
            System.out.println("       BANK ACCOUNT SYSTEM");
            System.out.println("==============================");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println(
                            "Current Balance: ₹" + account.getBalance()
                    );
                    break;

                case 4:
                    account.displayAccountDetails();
                    break;

                case 5:
                    account.showTransactionHistory();
                    break;

                case 6:
                    System.out.println("Thank you for using the Bank Account System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        scanner.close();
    }
}