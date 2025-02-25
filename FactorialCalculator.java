import java.util.Scanner;

public class FactorialCalculator {

    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 0) {
                    return number;
                } else {
                    System.out.println("Error: Please enter a non-negative integer (0 or greater).");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter an integer.");
                scanner.next();
            }
        }
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int inputNumber = getNonNegativeInteger();
        long factorial = calculateFactorial(inputNumber);
        System.out.println("The factorial of " + inputNumber + " is: " + factorial);
    }
}
