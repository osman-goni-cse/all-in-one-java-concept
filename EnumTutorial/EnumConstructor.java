package EnumTutorial;


enum FoodSize {

    SMALL("THIS IS A SMALL SIZE FOOD"),
    MEDIUM("THIS IS A MEDIUM SIZE FOOD"),
    LARGE("THIS IS A LARGE SIZE FOOD");

    private final String foodSize;

    private FoodSize(String foodSize){
        this.foodSize = foodSize;
    }

    public String getSize() {
        return foodSize;
    }
}

public class EnumConstructor {
    public static void main(String[] args) {
        System.out.println("Using constructor in Enum");

        FoodSize foodSize = FoodSize.SMALL;
        System.out.println(foodSize.getSize());
    }
}
