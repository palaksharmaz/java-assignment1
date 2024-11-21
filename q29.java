public class q29 {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 4, 5, 6, 8, 4};
        System.out.println("Duplicate elements and their frequencies:");
        boolean[] visited = new boolean[array.length];
    
        for (int i = 0; i < array.length; i++) {
            if (visited[i]) {
                continue; 
            }
            int count = 1; 
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true; 
                }
            }
            if (count > 1) { 
                System.out.println(array[i] + " occurs " + count + " times");
            }
        }
    }
}
