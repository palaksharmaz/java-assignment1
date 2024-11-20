import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range (positive integer): ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer greater than or equal to 1.");
        } else {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("The sum of natural numbers up to " + n + " is: " + sum);
        }
    }
}
