package FileHandling.JavaNIO;

import java.nio.charset.Charset;
import java.util.SortedMap;

public class AvailableCharsets {
    public static void main(String[] args) {
        System.out.println("Available Charsets in java Charset class");

        SortedMap<String, Charset> map = Charset.availableCharsets();

        System.out.println("Total Charset: " + map.size());
        for(String name: map.keySet()) {
            System.out.println(name);
        }
    }
}
