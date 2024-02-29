package EnumTutorial;

enum Size {
    SMALL, MEDIUM, LARGE
}

public class EnumExample {
    Size pizzaSize;

    public EnumExample(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void checkOrderedPizzaSize() {
        switch(pizzaSize) {
            case SMALL:
                System.out.println("I ordered SMALL sized pizza");
                break;
            case MEDIUM:
                System.out.println("I ordered MEDIUM sized pizza");
                break;
            default:
                System.out.println("I ordered LARGE sized pizza");

        }
    }
    public static void main(String[] args) {
        EnumExample enumExample = new EnumExample(Size.MEDIUM);
        enumExample.checkOrderedPizzaSize();
    }
}
