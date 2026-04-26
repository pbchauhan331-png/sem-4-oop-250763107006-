import java.util.*;

public class PasswordValidator {

    // Method to check valid password
    public static boolean isValidPassword(String password) {
        int digitCount = 0;

        // Rule 1: length at least 8
        if (password.length() < 8) {
            return false;
        }

        // Check characters
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // Rule 2: only letters and digits allowed
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            // Count digits
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        // Rule 3: at least 2 digits
        return digitCount >= 2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        sc.close();
    }
}