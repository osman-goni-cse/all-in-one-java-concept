package problem_solving.list_method;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ListManipulation {
    public static void main(String args[]){
        List<Person> people = new ArrayList<>();
        people.add(new Person("John",23));
        people.add(new Person("Jane",24));
        people.add(new Person("Jane",25));
        people.add(new Person("Julie",25));
        people.add(new Person("hani",26));
        people.add(new Person("uliep",27));

        System.out.println("========== Before removing =============");
        ListManipulation.printList(people);

        people.remove(new Person("hani",26));

        System.out.println("============= After Removing ==============");
        ListManipulation.printList(people);

        people.removeIf(person -> person.getName().equals("Jane"));

        System.out.println("============= After removing ==============");
        ListManipulation.printList(people);

    }

    static class Person {
        String name;
        int age;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person [name=" + name + ", age=" + age + "]";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            return Objects.equals(name, ((Person) o).name) && age == ((Person) o).age;
        }
    }

    public static void printList(List<Person> people){
        for(Person person : people){
            System.out.println(person);
        }
    }
}
