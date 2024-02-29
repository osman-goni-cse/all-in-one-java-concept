package CollectionFrameworkTutorial.ListTutorial;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ConvertArrayToList {

    static void listToArrayConvert() {
        System.out.println("***************** Converting a list to array ********************");
        List<String> letters = new ArrayList<>();

        letters.add("A"); letters.add("B"); letters.add("C");

        String[] strArr = new String[letters.size()];
        strArr = letters.toArray(strArr);
        System.out.println(Arrays.toString(strArr));
    }

    static void arrayToListConvert() {
        System.out.println("***************** Converting an array to list ********************");

        String[] vowels = {
            "a", "e", "i", "o", "u"
        };

        List<String> vowelsList = Arrays.asList(vowels);

        System.out.println(vowelsList);

        System.out.println("You can't modify the structure if u convert in that way");

        try {
            vowelsList.add("y");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            System.out.println("To solve this issue you have to copy elements from array using for loop");
        }

    }

    static void sortListDiffWays() {

        List<Integer> marks = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 10; i++) {
            marks.add(random.nextInt(100));
        }

        Collections.sort(marks);
        System.out.println("Sort using Collections: ");
        System.out.println(marks);

        marks.sort((o1, o2) -> {
            return (o2-o1);
        });

        System.out.println("Sort using custom methods");
        System.out.println(marks);

    }

    static void commonListOperations() {
        List<String> vowels = new ArrayList<>();
        vowels.add("a"); vowels.add("i");
        System.out.println(vowels);
        vowels.add(1, "e");
        System.out.println("After inserting e between a and i" + vowels);

        List<String> list = new ArrayList<>();
        list.add("O"); list.add("U");

        vowels.addAll(list);
        System.out.println("After appending a whole list on vowels. " );
        System.out.println(vowels);

        list.clear();
        System.out.println("Vowels size: " + vowels.size());

        vowels.set(2, "e");

        System.out.println(vowels);

        System.out.println("Sublist example");
        vowels.clear(); vowels.add("A"); vowels.add("E"); vowels.add("I"); vowels.add("O"); vowels.add("U");

        list = vowels.subList(1, 3);
        
        System.out.println("original: " + vowels + " sublist: " + list);
        vowels.set(1, "Y");
        System.out.println("original: " + vowels + " sublist: " + list);
        list.add("y");
        System.out.println("original: " + vowels + " sublist: " + list);

        try {
            vowels.add("xyz");
            System.out.println("original: " + vowels + " sublist: " + list);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Can't change the structure of originial list");
            System.out.println(e);
        }

    }

    public static void main(String[] args) {

        arrayToListConvert();

        listToArrayConvert();

        sortListDiffWays();

        commonListOperations();

    }
}
