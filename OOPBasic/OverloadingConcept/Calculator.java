package OOPBasic.OverloadingConcept;

public class Calculator {
    
    public static int performAddition(int a, int b) {
        return a + b;
    }

    public static double performAddition(double a, double b) {
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("Method Overloading Concept");
        System.out.println("Sum of a and b is: " + Calculator.performAddition(10, 15));
        System.out.println("Sum of a and b is: " + Calculator.performAddition(10.9, 15.9));
    }
}
