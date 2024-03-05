package PillarsOfOOP.Polymorphism;

public class Demo {
    public static void main(String[] args) {
        System.out.println(" *************** Exploring Polymorphism using Method Overriding ********** ");

        Animal animal = new Dog();
        // Animal animal2 = new String();
        
        animal.eat();
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.sleep();
        }
        animal.walk(animal);
    }
}
