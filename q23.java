public class q23 {
    public static void main(String[] args) {
        int num = 1;  
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i + (i-1); j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println(); 
        }
     }
}
