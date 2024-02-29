package GenericsTutorial;

public class GenericsDemo {
    public static void main(String[] args) {
        System.out.println("Generics in java(Type agnostic code)");

        Generic<Integer> genInteger = new Generic<>(88);

        System.out.println(genInteger.getObj());
        genInteger.showType();

        Generic<String> genString = new Generic<>("My Name is Osman");
        System.out.println(genString.getObj());
        genString.showType();
    }
}
