import java.util.Scanner;
public class q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nConversion Options:");
            System.out.println("1. Binary to Decimal");
            System.out.println("2. Decimal to Binary");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a binary number: ");
                    String binary = scanner.next();
                    int decimal = binaryToDecimal(binary);
                    System.out.println("The decimal equivalent of " + binary + " is: " + decimal);
                    break;

                case 2:
                    System.out.print("Enter a decimal number: ");
                    int decimalNumber = scanner.nextInt();
                    String binaryNumber = decimalToBinary(decimalNumber);
                    System.out.println("The binary equivalent of " + decimalNumber + " is: " + binaryNumber);
                    break;

                case 3:
                    System.out.println("Exiting program.");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            char bit = binary.charAt(length - 1 - i); 
            if (bit == '1') {
                decimal += Math.pow(2, i); 
            }
        }
        return decimal;
    }

    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        if (decimal == 0) {
            return "0";
        }

        while (decimal > 0) {
            binary.insert(0, decimal % 2); 
            decimal /= 2; 
        }
        return binary.toString();
    }
}
