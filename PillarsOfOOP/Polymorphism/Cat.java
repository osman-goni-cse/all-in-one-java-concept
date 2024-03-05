package PillarsOfOOP.Polymorphism;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat can eat fish. meow meow");
    }

    public void sleep() {
        System.out.println("Cats are lazy, They sleep almost all the time");
    }
}
