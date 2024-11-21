public class q28 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70};
    
        System.out.println("Every alternate number in the array:");
        for (int i = 0; i < array.length; i += 2) { 
            System.out.print(array[i] + " ");
        }
    }
}

