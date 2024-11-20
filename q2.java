 import java.util.Scanner;
    public class q2 
    { 
        public static void main(String[] args) 
        { 
            Scanner scanner = new Scanner(System.in); 
            System.out.print("Enter your birth year: "); 
            int birthYear = scanner.nextInt();
            int currentYear = 2024; 
            if (birthYear > currentYear) 
            { 
                System.out.println("Invalid birth year. Please enter a year less than or equal to " + currentYear); 
            } 
            else 
            { 
                int age = currentYear - birthYear; System.out.println("Your age is: " + age + " years."); 
            } 
        } 
    }
