package CollectionFrameworkTutorial.ListTutorial;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExample {
    static void removeError() {
        List<String> languages = new ArrayList<>();

        languages.add("Bangla");
        languages.add("English");
        languages.add("Spanish");
        languages.add("Arabic");
        languages.add("Russian");

        System.out.println("Original List: " + languages);

        Iterator<String> iterator = languages.iterator();
        while (iterator.hasNext()) {
            String languageString = iterator.next();
            if (languageString.equals("English")) {
                // This will likely throw ConcurrentModificationException
                // languages.remove(languageString);
                // But This will not
                iterator.remove();
            } else {
                System.out.println("Still Going: " + languageString);
            }
        }
    }
    static void subListError() {
        List<String> cities = new ArrayList<>();

        cities.add("Dhaka");
        cities.add("Chattogram");
        cities.add("Jashore");
        cities.add("Rajshahi");

        List<String> firstTwoCity = cities.subList(0, 2);

        System.out.println("cities: " + cities);
        System.out.println("sub-cities: " + firstTwoCity);

        cities.set(1, "Oman");

        System.out.printf("Size of the subList: %d", firstTwoCity.size()  );
        System.out.println();

        System.out.println("cities: " + cities);
        System.out.println("sub-cities: " + firstTwoCity);

        firstTwoCity.set(1, "New York");

        System.out.println("cities: " + cities);
        System.out.println("sub-cities: " + firstTwoCity);

        firstTwoCity.add("Paris");

        System.out.println("cities: " + cities);
        System.out.println("sub-cities: " + firstTwoCity);
        
    }
    public static void main(String[] args) {
        // removeError();
        subListError();
    }
}
