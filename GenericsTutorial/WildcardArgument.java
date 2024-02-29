package GenericsTutorial;

import java.util.ArrayList;
import java.util.List;

public class WildcardArgument {
    public static <T> void printListUsingGenericMethod(List<T> list) {
        System.out.println(list);
    }

    public static void printListUsingWildcard(List<?> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {
        System.out.println("Wildcard usages");

        List<String> str = new ArrayList<>();
        str.add("Osman"); str.add("Goni");
        printListUsingGenericMethod(str);
        printListUsingWildcard(str);
    }
}
