
public class InheritanceDemo {
    static class Animal {
    protected String name;
        public Animal(String name) {
this.name = name;
}
public void eat() {
    System.out.println(name + " is eating.");
}

public void sleep() {
System.out.println(name + " is sleeping.");
}
}
static class Dog extends Animal {
   public Dog(String name) {
     super(name);
}
public void bark() {
System.out.println(name + " is barking: Woof! Woof!");
}
}
public static void main(String[] args) {
    Dog myDog = new Dog("Buddy");
    myDog.eat(); // Inherited method
    myDog.sleep(); // Inherited method
    myDog.bark(); // Subclass-specific method
}
}