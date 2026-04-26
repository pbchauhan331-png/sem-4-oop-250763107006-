import java.util.Scanner;

public class Pr2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        int result = 0;
        int place = 1;
        int carry = 0;

        for (int i = 0; i < 5; i++) {
            int digit = num % 10;
            num = num / 10;

            digit = digit + 1 + carry;

            if (digit == 10) {
                digit = 0;
                carry = 1;
            } else {
                carry = 0;
            }

            result = digit * place + result;
            place = place * 10;
        }

        System.out.println("New number: " + result);

        sc.close();
    }
}