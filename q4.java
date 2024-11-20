import java.util.Scanner; 
public class q4 
{ 
    public static void main(String args[])
    { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the number of rows for the pyramid: "); 
        int rows = scanner.nextInt(); 
        System.out.println("Pyramid Pattern:"); 
        for (int i = 1; i <= rows; i++) 
        { 
            for (int j = 1; j <= rows - i; j++) 
            { 
                System.out.print(" "); 
            } 
            for (int k = 1; k <= i; k++) 
            { 
                System.out.print(k + " "); 
            } 
            System.out.println(); 
        } 
    } 
}


