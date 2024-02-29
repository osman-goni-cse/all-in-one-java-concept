package GenericsTutorial;

public class AvgCalcGeneric<T extends Number> {
    private T[] numbers;

    public AvgCalcGeneric(T[] numbers) {
        this.numbers = numbers;
    }

    public double average() {
        double sum = 0.0;
        for(T number: numbers) {
            sum += number.doubleValue();
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        System.out.println("Average Calculator");

        Double[] numbers = {1.5, 2.5, 3.0, 5.0};

        System.out.println(numbers[0]);

        AvgCalcGeneric<Double> ara = new AvgCalcGeneric<>(numbers);
        System.out.println(ara.average());

        Integer[] marks = {81,96,87,68,75,55,91};
        AvgCalcGeneric<Integer> ara1 = new AvgCalcGeneric<>(marks);
        System.out.println(ara1.average());
    }
}
