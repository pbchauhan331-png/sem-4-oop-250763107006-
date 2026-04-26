import java.util.*;

class BillGenerator {

    // Regular customer (no discount)
    void generateBill(int itemTotal) {
        System.out.println("Customer type: Regular");
        System.out.println("Final Amount: " + itemTotal);
    }

    // Privileged customer (flat discount)
    void generateBill(int itemTotal, int discount) {
        int finalAmount = itemTotal - discount;
        System.out.println("Customer type: Privileged");
        System.out.println("Final Amount: " + finalAmount);
    }

    // Festive offer (percentage discount)
    void generateBill(int itemTotal, double discountPercent) {
        double discount = (itemTotal * discountPercent) / 100;
        double finalAmount = itemTotal - discount;
        System.out.println("Customer type: Festive Offer");
        System.out.println("Final Amount: " + finalAmount);
    }
}

public class BillingSystem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BillGenerator billGen = new BillGenerator();

        int choice;

        do {
            System.out.println("\n--- Billing Menu ---");
            System.out.println("1. Regular Customer");
            System.out.println("2. Privileged Customer (Flat Discount)");
            System.out.println("3. Festive Offer (Percentage Discount)");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter total amount: ");
                    int total1 = sc.nextInt();
                    billGen.generateBill(total1);
                    break;

                case 2:
                    System.out.print("Enter total amount: ");
                    int total2 = sc.nextInt();
                    System.out.print("Enter discount amount: ");
                    int discount = sc.nextInt();
                    billGen.generateBill(total2, discount);
                    break;

                case 3:
                    System.out.print("Enter total amount: ");
                    int total3 = sc.nextInt();
                    System.out.print("Enter discount percentage: ");
                    double percent = sc.nextDouble();
                    billGen.generateBill(total3, percent);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}