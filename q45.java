class Car {
    String model;
    int year;
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    void display() {
        System.out.println("Car Model: " + this.model);
        System.out.println("Car Year: " + this.year);
    }
    void updateYear(int year) {
        this.year = year;  
    }
}

public class q45 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020);
        car.display();

        car.updateYear(2023);
        System.out.println("After updating the year:");
        car.display();
    }
}
