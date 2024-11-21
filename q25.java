import java.util.Scanner;
public class q25 {
    private int[] stack;  
    private int top;      
    private int capacity; 

    public q25(int size) {
        stack = new int[size];
        capacity = size;
        top = -1; 
    } 
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + element);
            return;
        }
        stack[++top] = element;
        System.out.println(element + " pushed into the stack.");
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }
        return stack[top--];
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == capacity - 1;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements are:");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();

        q25 stack = new q25(size);

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    int poppedElement = stack.pop();
                    if (poppedElement != -1) {
                        System.out.println("Popped element: " + poppedElement);
                    }
                    break;
                case 3:
                    int topElement = stack.peek();
                    if (topElement != -1) {
                        System.out.println("Top element: " + topElement);
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
