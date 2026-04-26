import java.util.*;

// Base class
class Payment {
    void processPayment(int amount) {
        System.out.println("Processing payment of Rs. " + amount);
    }
}

// Subclass 1
class CreditCardPayment extends Payment {
    @Override
    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using Credit Card");
    }
}

// Subclass 2
class UPIPayment extends Payment {
    @Override
    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using UPI");
    }
}

// Main class
public class PaymentDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        System.out.println("\nSelect Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        Payment p;  // Parent reference

        switch (choice) {
            case 1:
                p = new CreditCardPayment();
                break;

            case 2:
                p = new UPIPayment();
                break;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        // Runtime polymorphism
        p.processPayment(amount);

        sc.close();
    }
}