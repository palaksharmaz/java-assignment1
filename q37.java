class Animal {
    void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

public class q37 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();

        a.sound();
        d.sound();
    }
}
