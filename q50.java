public class q50 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[-1] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
        try {
            int result = 10 / 0;  
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}