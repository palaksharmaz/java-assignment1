public class q33 {
    String name;
    int age;

    q33(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        q33 p = new q33("Palak", 18);
        p.display();
    }
}
