package CollectionFrameworkTutorial.ListTutorial;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateList {
    static void Arrays_As_List() {
        System.out.println("Creating ArrayList other ways");
        String[] countries = new String[] {"Bangladesh", "Saudi Arabia", "Oman", "UAE"};

        List<String> copyOfCountries = Arrays.asList(countries);

        System.out.println(copyOfCountries);
        copyOfCountries.set(1, "KSA");

        // assert(copyOfCountries).containsExactly("Bangladesh", "Saudi Arabia", "Oman", "UAE");
        // assert(countries).containsExactly("Bangladesh", "Saudi Arabia", "Oman", "UAE");
        System.out.println(countries);
        System.out.println(copyOfCountries);

        try {
            copyOfCountries.add("Morrocco");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println(copyOfCountries);
    }
    static void ArrayList_Arrays_As_List() {
        System.out.println("Creating ArrayList many ways");

        List<String> cities = new ArrayList<>(
            Arrays.asList("Dhaka", "Chittagong")
        );

        System.out.println(cities);

        cities.add("Pabna");

        System.out.println(cities);

        cities.set(1, "Barisal");
        System.out.println(cities);
    }
    public static void main(String[] args) {
        Arrays_As_List();
    }
}
