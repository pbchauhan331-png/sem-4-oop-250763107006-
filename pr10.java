import java.util.*;

// Base class
class Vehicle {
    String vehicleNumber;
    String brand;
    String fuelType;

    Vehicle(String vnumber, String vbrand, String ftype) {
        this.vehicleNumber = vnumber;
        this.brand = vbrand;
        this.fuelType = ftype;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass Car
class Car extends Vehicle {
    int numberOfSeats;
    boolean acAvailable;

    Car(String vnumber, String vbrand, String ftype, int seats, boolean ac) {
        super(vnumber, vbrand, ftype);
        this.numberOfSeats = seats;
        this.acAvailable = ac;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + (acAvailable ? "Yes" : "No"));
    }
}

// Subclass ElectricCar
class ElectricCar extends Car {
    double batteryCapacity;
    double chargingTime;

    ElectricCar(String vnumber, String vbrand, String ftype,
                int seats, boolean ac, double battery, double charging) {

        super(vnumber, vbrand, ftype, seats, ac);
        this.batteryCapacity = battery;
        this.chargingTime = charging;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

// Main class
public class VehicleDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Vehicle");
            System.out.println("2. Car");
            System.out.println("3. Electric Car");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter vehicle number: ");
                    String v1 = sc.nextLine();

                    System.out.print("Enter brand: ");
                    String b1 = sc.nextLine();

                    System.out.print("Enter fuel type: ");
                    String f1 = sc.nextLine();

                    Vehicle obj1 = new Vehicle(v1, b1, f1);
                    obj1.displayDetails();
                    break;

                case 2:
                    System.out.print("Enter vehicle number: ");
                    String v2 = sc.nextLine();

                    System.out.print("Enter brand: ");
                    String b2 = sc.nextLine();

                    System.out.print("Enter fuel type: ");
                    String f2 = sc.nextLine();

                    System.out.print("Enter number of seats: ");
                    int s2 = sc.nextInt();

                    System.out.print("AC available (true/false): ");
                    boolean ac2 = sc.nextBoolean();
                    sc.nextLine();

                    Vehicle obj2 = new Car(v2, b2, f2, s2, ac2); // upcasting
                    obj2.displayDetails();
                    break;

                case 3:
                    System.out.print("Enter vehicle number: ");
                    String v3 = sc.nextLine();

                    System.out.print("Enter brand: ");
                    String b3 = sc.nextLine();

                    System.out.print("Enter fuel type: ");
                    String f3 = sc.nextLine();

                    System.out.print("Enter number of seats: ");
                    int s3 = sc.nextInt();

                    System.out.print("AC available (true/false): ");
                    boolean ac3 = sc.nextBoolean();

                    System.out.print("Enter battery capacity: ");
                    double bc = sc.nextDouble();

                    System.out.print("Enter charging time: ");
                    double ct = sc.nextDouble();
                    sc.nextLine();

                    Vehicle obj3 = new ElectricCar(v3, b3, f3, s3, ac3, bc, ct);

                    // Downcasting example
                    if (obj3 instanceof ElectricCar) {
                        ElectricCar e = (ElectricCar) obj3;
                        e.displayDetails();
                    }
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