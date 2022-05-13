package Mains;

import Classes.BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountMain {
    public static ArrayList<BankAccount> accounts = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        accounts.add(new BankAccount(500, 1001, "Matt"));
        accounts.add(new BankAccount(500, 1002, "Ozzy"));
        boolean isAppStart = true;
        while (isAppStart) {
            System.out.println("Are you existing customer: \n1-Yes\n2-No\n0-Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hello, Please enter your account number: ");
                    int accountNumber = scanner.nextInt();
                    for (int i = 0; i < accounts.size(); i++) {
                        if (accountNumber == accounts.get(i).getAccountNumber()) {
                            System.out.println("Your account is found ");
                            mainMenu(accounts.get(i));
                        }
                    }
                    break;
                case 2:
                    System.out.println("Welcome to our Bank... Let's create your account");
                    BankAccount newAccount = new BankAccount();
                    System.out.println("Please enter your account name: ");
                    String accountName = scanner.next();
                    scanner.nextLine();
                    newAccount.setName(accountName);
                    System.out.println("Please enter your initial balance: ");
                    int balance = scanner.nextInt();
                    newAccount.setBalance(balance);
                    accounts.add(newAccount);
                    mainMenu(newAccount);
                    break;
                case 0:
                    isAppStart = false;
                    break;
            }
        }
    }

    public static void mainMenu(BankAccount account) {
        boolean isAppStart = true;
        while (isAppStart) {
            System.out.println("Hello, " + account.getName() + "\nWelcome to the Main Menu, What would you like to do today? ");
            System.out.println("Please select from the following options:\n" +
                    "            1. Check account balance\n" +
                    "            2. Make a withdrawal\n" +
                    "            3. Make a deposit\n" +
                    "            4. Transfer funds to another account\n" +
                    "            0. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("The Account Balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.println("Please enter amount that you want to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    account.withdrawal(withdrawAmount);
                    System.out.println("The Account Balance: " + account.getBalance());
                    break;
                case 3:
                    System.out.println("Please enter amount that you want to deposit: ");
                    int depositAmount = scanner.nextInt();
                    account.deposit(depositAmount);
                    System.out.println("The Account Balance: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Please enter account number you would like to transfer: ");
                    int accountNumber = scanner.nextInt();

                    boolean found = false;
                    int index = -1;
                    for (int i = 0; i < accounts.size(); i++) {
                        if (accounts.get(i).getAccountNumber() == accountNumber) {
                            found = true;
                            index = i;
                        }
                    }
                    if (!found) {
                        System.out.println("Account doesn't exist");

                    } else if (found) {
                        System.out.println("Please enter transfer amount: ");
                        double transferAmount = scanner.nextDouble();
                        account.transfer(accounts.get(index), transferAmount);
                    }
                    break;
                case 0:
                    System.out.println("Have a good day...");
                    isAppStart = false;
                    break;

            }
        }
    }
}
