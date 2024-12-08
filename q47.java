import java.util.Scanner;

public class q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.nextLine();
        
        int sum = 0;
        
        for (int i = 0; i < num.length() - 1; i++) {
            int num1 = Integer.parseInt(num.substring(i, i + 2));
            sum += num1;
        }
        System.out.println("Sum of consecutive digits: " + sum);
    }
}
