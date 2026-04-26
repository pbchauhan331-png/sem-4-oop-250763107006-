import java.util.*;

class LoanCalculator {

    // Home loan EMI (int principal, int time, float rate)
    void calculateEMI(int principal, int time, float rate) {
        double r = rate / (12 * 100);
        int t = time * 12;

        double emi = (principal * r * Math.pow(1 + r, t)) /
                     (Math.pow(1 + r, t) - 1);

        System.out.println("Home Loan EMI: " + emi);
    }

    // Vehicle loan EMI (double principal, int time, double rate)
    void calculateEMI(double principal, int time, double rate) {
        double r = rate / (12 * 100);
        int t = time * 12;

        double emi = (principal * r * Math.pow(1 + r, t)) /
                     (Math.pow(1 + r, t) - 1);

        System.out.println("Vehicle Loan EMI: " + emi);
    }

    // Personal loan EMI (fixed rate = 10%)
    void calculateEMI(int principal, int time) {
        double rate = 10;
        double r = rate / (12 * 100);
        int t = time * 12;

        double emi = (principal * r * Math.pow(1 + r, t)) /
                     (Math.pow(1 + r, t) - 1);

        System.out.println("Personal Loan EMI: " + emi);
    }
}

public class LoanEMI {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LoanCalculator lc = new LoanCalculator();

        int choice;

        do {
            System.out.println("\n=== EMI Calculator ===");
            System.out.println("1. Home Loan");
            System.out.println("2. Vehicle Loan");
            System.out.println("3. Personal Loan");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter principal amount: ");
                    int p1 = sc.nextInt();

                    System.out.print("Enter time (years): ");
                    int t1 = sc.nextInt();

                    System.out.print("Enter rate of interest: ");
                    float r1 = sc.nextFloat();

                    lc.calculateEMI(p1, t1, r1);
                    break;

                case 2:
                    System.out.print("Enter principal amount: ");
                    double p2 = sc.nextDouble();

                    System.out.print("Enter time (years): ");
                    int t2 = sc.nextInt();

                    System.out.print("Enter rate of interest: ");
                    double r2 = sc.nextDouble();

                    lc.calculateEMI(p2, t2, r2);
                    break;

                case 3:
                    System.out.print("Enter principal amount: ");
                    int p3 = sc.nextInt();

                    System.out.print("Enter time (years): ");
                    int t3 = sc.nextInt();

                    lc.calculateEMI(p3, t3);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Please enter valid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}