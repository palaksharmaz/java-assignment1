import java.util.Scanner;
public class q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the start and end of the interval
        System.out.print("Enter the start of the interval: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the interval: ");
        int end = scanner.nextInt();

        if (start > end) {
            System.out.println("Invalid interval! Start should be less than or equal to the end.");
        } else {
            System.out.println("Multiples of 10 between " + start + " and " + end + ":");
            boolean found = false;
            for (int i = start; i <= end; i++) {
                if (i % 10 == 0) {
                    System.out.print(i + " ");
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No multiples of 10 found in this interval.");
            }
        }
    }
}
