public class PolymorphismDemo {
    static class Animal {
        public void makeSound() {
            System.out.println("Some generic animal sound");
        }
    }

    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof! Woof!");
        }
    }

    static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow!");
        }
    }

    static class Cow extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Moo!");
        }
    }

    public static void main(String[] args) {
        Animal[] myAnimals = {new Dog(), new Cat(), new Cow()};
        System.out.println("=== ANIMAL SOUNDS ===");
        for (Animal animal : myAnimals) {
            animal.makeSound();
        }
    }
}   