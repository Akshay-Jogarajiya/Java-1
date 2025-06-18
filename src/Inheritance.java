public class Inheritance {
    public static void main(String[] args) {
        Car2 c = new Car2();
        c.drive();    // Inherited
        c.honk();     // Child-specific
        System.out.println(c.type);
    }
}
class Vehicle2 {
    String type = "Generic Vehicle";

    void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car2 extends Vehicle2 {
    void honk() {
        System.out.println("Car honks");
    }
}

