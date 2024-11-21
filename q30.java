class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class q30 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        System.out.println("Student 1 details:");
        student1.displayDetails();

        System.out.println("\nStudent 2 details:");
        student2.displayDetails();
    }
}
