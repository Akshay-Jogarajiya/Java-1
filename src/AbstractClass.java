public class AbstractClass {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.fuel();
        vehicle.run();
    }
}
abstract class Vehicle {
    abstract void run();

    void fuel() {
        System.out.println("Filling fuel...");
    }
}
class Car extends Vehicle {
    void run() {
        System.out.println("Running...");
    }
}