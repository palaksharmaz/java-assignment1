import java.util.Scanner; 
public class q5 
{ 
    public static void main(String[] args) 
    { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the number of elements in the array: "); 
        int n = scanner.nextInt(); 
        int[] array = new int[n]; 
        int sum = 0; 
        System.out.println("Enter " + n + " elements:"); 
        for (int i = 0; i < n; i++) 
        { 
            array[i] = scanner.nextInt(); 
            sum += array[i]; 
        } 
        double average = (double) sum / n; 
        System.out.println("Sum of array elements: " + sum); 
        System.out.println("Average of array elements: " + average); 
    } 
}


