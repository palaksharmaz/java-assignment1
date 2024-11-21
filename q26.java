import java.util.Scanner;
public class q26 {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public q26(int capacity) {
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = capacity;
    }

    public void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is full. Cannot enqueue " + data);
        } else {
            if (front == -1) {
                front = 0; 
            }
            queue[++rear] = data;
            System.out.println(data + " enqueued to the queue.");
        }
    }

    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty. Nothing to dequeue.");
        } else {
            System.out.println(queue[front] + " dequeued from the queue.");
            front++;
        }
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();

        q26 queue = new q26(size);

        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int data = scanner.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
