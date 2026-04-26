public class Pr3 {
    public static void main(String args[]) {

        if (args.length != 2) {
            System.out.println("Please enter only two command line arguments");
            System.out.println("Example: java Pr3 10 20");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        double sum = num1 + num2;
        double product = num1 * num2;

        System.out.println("Value of num1: " + num1);
        System.out.println("Value of num2: " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}