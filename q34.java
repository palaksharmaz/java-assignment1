class q34 {
    String name;
    int age;

    q34() {
        name = "Unknown";
        age = 0;
    }

    q34(String name) {
        this.name = name;
        age = 0;
    }

    q34(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        q34 p1 = new q34();
        q34 p2 = new q34("Alice");
        q34 p3 = new q34("Bob", 30);

        p1.display();
        p2.display();
        p3.display();
    }
}
