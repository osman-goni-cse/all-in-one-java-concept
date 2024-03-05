package PillarsOfOOP.Polymorphism;

public class Animal {
    public void eat() {
        System.out.println("Animal eat everything");
    }

    public void walk(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Dog is walking ....");
        }
        if(animal instanceof Cat) {
            System.out.println("Cat is walking.....");
        }
    }
}
