import java.util.Scanner;

public class DynamicPolymorphism {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you choose");
        System.out.println("Press 1 for dog and press 2 for cat");
        int decision = sc.nextInt();

        if (decision == 1) {
            animal = new Dog();
            animal.speak();
        } else if (decision == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("That choice is invalid");
        }
        sc.close();
    }

    static class Animal {
        public void speak() {
            System.out.println("Geng geng");
        }
    }

    static class Dog extends Animal {
        @Override
        public void speak() {
            System.out.println("Dog = arf arf");
        }
    }

    static class Cat extends Animal {
        @Override
        public void speak() {
            System.out.println("Cat = mengggggg");
        }
    }
}