package OOPBasic.OverloadingConcept;

public class Person {
    private String name;
    private String email;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String email) {
        // this.name = name;
        this(name);
        this.email = email;
    }

    public Person(String name, String email, int age) {
        // this.name = name;
        // this.email = email;
        this(name, email);
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + ":" + this.email + ":" + this.age;
    }

    public static void main(String[] args) {
        System.out.println("Constructor Overloading (Constructor Chaining)");

        Person person1 = new Person("Osman");
        System.out.println(person1);

        Person person2 = new Person("Osman", "osman@gmail.com");
        System.out.println(person2);

        Person person3 = new Person("Osman", "os@gmail.com", 25);
        System.out.println(person3);
    }
}
