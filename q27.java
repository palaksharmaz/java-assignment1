import java.util.Scanner;
public class q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int smallest = array[0]; 
        for (int i = 1; i < n; i++) {
            if (array[i] < smallest) {
                smallest = array[i]; 
            }
        }
        System.out.println("The smallest number in the array is: " + smallest);
    }
}
