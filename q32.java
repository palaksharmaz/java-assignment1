class Student {
    private String name;
    private int age;

    public Student() {
        this.name = "Unknown"; 
        this.age = 0;          
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class q32 {
    public static void main(String[] args) {
        Student student1 = new Student(); 
        System.out.println("Student 1 details:");
        student1.displayDetails();
    }
}