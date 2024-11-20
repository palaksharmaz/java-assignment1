import java.util.Scanner;
public class q1 {
         public static void main(String[] args) 
        { 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Welcome to User Registration");

        String username; 
        while (true) 
        { 
            System.out.print("Enter a username (at least 3 characters): ");
            username = scanner.nextLine(); 
            if (username.length() >= 3) 
            {         
                break; 
            }
            else 
            {        
                System.out.println("Username must be at least 3 characters long."); 
            }
        }

        String password; 
        while (true) 
        { 
            System.out.print("Enter a password (at least 6 characters, must include a number): "); 
            password = scanner.nextLine(); 
            if (password.length() >= 6 && containsDigit(password)) 
            {         
                break; 
            }
            else 
            { 
                System.out.println("Password must be at least 6 characters long and include at least one number."); 
            }
        }
        
        String email;    
        while (true) 
        {
            System.out.print("Enter your email (must include '@' and '.'): "); 
            email = scanner.nextLine(); 
            if (email.contains("@") && email.contains(".") && email.indexOf("@") < email.indexOf(".")) 
            { 
                break; 
            } 
            else 
            { 
                System.out.println("Invalid email. Please enter a valid email address."); 
            } 
        }
        System.out.println("\nRegistration successful!"); 
        System.out.println("Username: " + username); 
        System.out.println("Email: " + email);  
    }
    public static boolean containsDigit(String str) 
    { 
        for (char c : str.toCharArray()) 
        {         
            if (Character.isDigit(c)) 
            { 
                return true;
            }
        } 
        return false;
    }
}