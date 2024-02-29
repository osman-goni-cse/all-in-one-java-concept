package GenericsTutorial;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        System.out.println("Exploring Generic Dynamic Array");

        DynamicArray<Integer> vector = new DynamicArray<>();

        vector.add(5);
        vector.add(10);
        System.out.println(vector);

        DynamicArray<String> str = new DynamicArray<>();

        str.add("Osman");
        str.add("Farman");
        str.add("Md");
        System.out.println(str);
        System.out.println(str.size());

        // DynamicArray<String> stringArray = new DynamicArray<>();
        // below line will give Compile Error, because String is a subclass of Object class But GenericString is not a subclass of GenericObject
        // DynamicArray<Object> objectArray = stringArray;

    }
}
