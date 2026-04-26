import java.util.*;

class BankAccount {
    String accountId;
    String accountHolderName;
    double balance;

    // Assign values
    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    // Display values
    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + balance);
        System.out.println();
    }

    // Search function
    static void search(BankAccount accounts[], String searchId, int num) {
        boolean found = false;

        for (int i = 0; i < num; i++) {
            if (accounts[i].accountId.equals(searchId)) {
                accounts[i].displayValues();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account ID does not exist");
        }
    }
}

public class BankAccountDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many accounts you want to create: ");
        int num = sc.nextInt();
        sc.nextLine(); // clear buffer

        if (num < 5) {
            System.out.println("Please create at least 5 accounts");
            return;
        }

        BankAccount accounts[] = new BankAccount[num];

        // Input accounts
        for (int i = 0; i < num; i++) {
            accounts[i] = new BankAccount();

            System.out.print("Enter Account ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Account Balance: ");
            double bal = sc.nextDouble();
            sc.nextLine(); // clear buffer

            accounts[i].assignValues(id, name, bal);
        }

        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display all accounts");
            System.out.println("2. Search account by ID");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    for (int i = 0; i < num; i++) {
                        accounts[i].displayValues();
                    }
                    break;

                case 2:
                    System.out.print("Enter Account ID to search: ");
                    String searchId = sc.nextLine();
                    BankAccount.search(accounts, searchId, num);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 3);

        sc.close();
    }
}