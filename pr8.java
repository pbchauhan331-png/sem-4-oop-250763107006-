import java.util.*;

class University {
    static int totalStudents = 0;
    static String universityName;

    // Static block
    static {
        universityName = "GTU";
        System.out.println("Static block executed");
        System.out.println("University Name: " + universityName);
    }

    // Instance block
    {
        System.out.println("Instance block executed (object created)");
    }

    // Constructor
    University() {
        totalStudents++;
        System.out.println("Constructor executed");
    }

    // Static method
    static int getTotalStudents() {
        return totalStudents;
    }
}

public class UniversityDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Create new object");
            System.out.println("2. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    new University();
                    System.out.println("Total Students: " + University.getTotalStudents());
                    break;

                case 2:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 2);

        sc.close();
    }
}