package GenericsTutorial;

public class TupleDemo {
    public static void main(String[] args) {
        System.out.println("Example of Generics");

        Tuple<String, String> userDetails = new Tuple<>("Osman", "SWE");

        System.out.println(userDetails.getA());
        System.out.println(userDetails.getB());
        
        userDetails.showType();

        Tuple<String, Tuple<Integer, Integer>> aboutUser = new Tuple<>("Osman", new Tuple<>(45, 55));
        aboutUser.showType();
    }
}
