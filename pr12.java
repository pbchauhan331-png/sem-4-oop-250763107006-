import java.util.*;

// Interface
interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

// Abstract class
abstract class PartialOrder implements Order {
    protected String item;
    protected int qty;
    protected int orderId;
    protected double price;

    // Implement only placeOrder
    public void placeOrder(String item, int qty) {
        this.item = item;
        this.qty = qty;
        this.orderId = (int)(Math.random() * 1000);

        this.price = qty * 100;

        System.out.println("Order placed successfully!");
        System.out.println("Order ID: " + orderId);
    }
}

// Concrete class
class FinalOrder extends PartialOrder {

    public void cancelOrder(int orderId) {
        if (this.orderId == orderId) {
            System.out.println("Order " + orderId + " cancelled successfully");
        } else {
            System.out.println("Order ID not found");
        }
    }

    public void generateBill() {
        System.out.println("\n----- BILL -----");
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Price: Rs. " + price);
    }
}

// Main class
public class OrderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FinalOrder o = new FinalOrder();

        System.out.print("Enter item name: ");
        String item = sc.next();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        o.placeOrder(item, qty);

        System.out.println("\n1. Generate Bill");
        System.out.println("2. Cancel Order");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        if (ch == 1) {
            o.generateBill();
        } else if (ch == 2) {
            System.out.print("Enter Order ID: ");
            int id = sc.nextInt();
            o.cancelOrder(id);
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}