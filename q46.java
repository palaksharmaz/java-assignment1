class Counter {
    static int count = 0;
    Counter() {
        count++;
    }
    static void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class q46 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        Counter.displayCount();  
    }
}
