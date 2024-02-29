package GenericsTutorial;

public class Tuple<A, B> {
    private A a;
    private B b;

    Tuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public A getA() {
        return a;
    }
    
    public B getB() {
        return b;
    }

    public void showType() {
        System.out.println("Type of A is " + a.getClass().getName() + " and Value: " + a);
        System.out.println("Type of B is " + a.getClass().getName() + " and Value: " + b);
    }
}
