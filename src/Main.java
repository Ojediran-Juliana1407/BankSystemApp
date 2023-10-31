import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BankingSystem bankingSystem = new BankingSystem();

    while (true) {
        System.out.println("Banking Account Management System");
        System.out.println("1. Create Account");
        System.out.println("2. Update Balance");
        System.out.println("3. Add Transaction");
        System.out.println("4. Get Transaction History");
        System.out.println("5. List All Accounts");
        System.out.println("6. Manage Customer Info");
        System.out.println("7. Exit");

        System.out.println("Select an option:");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 1:
                System.out.println("Enter Account Number");
                int accountNumber = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter Customer Name: ");
                String customerName = scanner.nextLine();
                System.out.println("Enter Initial Balance: ");
                double initialBalance = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Enter Account Type: ");
                String accountType = scanner.nextLine();
                Account newAccount = new Account(accountNumber, customerName,initialBalance,accountType);
                bankingSystem.createAccount(newAccount);
                break;
            case 2:
                System.out.println("Enter Account Number: ");
                int accountToUpdate = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter Amount to Update: ");
                double amountToUpdate = scanner.nextDouble();
                scanner.nextLine();
                bankingSystem.updateBalance(accountToUpdate,amountToUpdate);
                break;
            case 3:
                System.out.println("Enter Account Number: ");
                int accountForTransaction = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter Transaction ID: ");
                int transactionId = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter Date: ");
                String date = scanner.nextLine();
                System.out.println("Enter Amount: ");
                double transactionAmount = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Enter Transaction Type: ");
                String transactionType = scanner.nextLine();
                System.out.println("Enter Transaction Description");
                String transactionDescription = scanner.nextLine();
                Transaction newTransaction = new Transaction(transactionId, date, transactionAmount,transactionType, transactionDescription);
                bankingSystem.addTransaction(accountForTransaction, newTransaction);
                break;
            case 4:
                System.out.println("Enter Account Number: ");
                int accountNumberForHistory = scanner.nextInt();
                scanner.nextLine();
                ArrayList<Transaction> history = bankingSystem.getTransactionHistory(accountNumberForHistory);
                for (Transaction transaction : history) {
                    System.out.println(transaction);
                }
                break;
            case 5:
                bankingSystem.listAccounts();
                break;
            case 6:
                System.out.println("We are here to serve you better");
            case 7:
                System.out.println("Exiting the Banking System. Do Have a Great Day");
                System.exit(0);
            default:
                System.out.println("Invalid choice .Please select a valid option");



        }
    }
    }
}