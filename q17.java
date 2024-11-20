import java.util.Scanner;
public class q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();
        double kilometers = miles * 1.60934;

        System.out.printf("%.2f miles is equal to %.2f kilometers.%n", miles, kilometers);
    }
}

