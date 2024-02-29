package CollectionFrameworkTutorial.ListTutorial;
import java.util.ArrayList;
import java.util.List;

public class ArrayListConcept {
    public static void main(String[] args) {
        System.out.println("Hello List of List ArrayList");
        List<String>fruits = new ArrayList<>();

        fruits.add("Banana");

        fruits.add("Apple");

        fruits.add("Pineapple");

        for(int i = 0; i < fruits.size(); i++) {
            int ideHasCode = System.identityHashCode(fruits.get(i));
            System.out.printf("%s %s\n", ideHasCode, fruits.get(i));
        }
        // fruits.clear();
        if(fruits.isEmpty()) {
            System.out.println("We don't have any fruits");
        }
        else {
            System.out.println("Yeah we have lot of fruits");
        }

        System.out.printf("At %d we have %s fruit.\n", 2, fruits.get(2));
        System.out.printf("After updating in %d\n", 2);
        fruits.set(2, "Cherry");
        System.out.printf("At %d now we have %s\n", 2, fruits.get(2));
        if(fruits.contains("AppleJuice")) {
            System.out.println("I have an Apple");
        }
        else {
            System.out.println("Don't have Apple");
        }
    }
}
