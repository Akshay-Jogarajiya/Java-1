public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal animal;

        animal = new Dog();
        animal.makeSound();

        animal = new Cat();
        animal.makeSound();
    }
}
class Animal {
    void makeSound() {
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog Sound");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat Sound");
    }
}
