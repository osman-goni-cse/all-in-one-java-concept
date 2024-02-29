package CollectionFrameworkTutorial.MapTutorial;
import java.util.HashMap;
import java.util.Map;

public class MapConcept {
    public static void main(String[] args) {
        System.out.println("Hash Map Tutorial");

        Map<Long, String> users = new HashMap<>();

        users.put(1L, "Osman");
        users.put(2L, "Farman");

        System.out.println(users);
    }
}
