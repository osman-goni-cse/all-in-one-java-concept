package PillarsOfOOP.Polymorphism;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog can eat chicken. woof woof");
    }

    public void lifetime() {
        System.out.println("Dog has 12 yrs lifetime.");
    }
}
