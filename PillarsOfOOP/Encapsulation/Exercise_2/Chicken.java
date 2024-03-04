package PillarsOfOOP.Encapsulation.Exercise_2;

public class Chicken {
    private String name;
    private int age;
    private static final int LIFE_SPAN = 15;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        if(name == null || name.trim().length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if(age >= 0 && age <= LIFE_SPAN) {
            this.age = age;
        }
        else {
            throw new IllegalArgumentException("Age should be between 0 to 15");
        }
    }

    private double eggProducedByChickenPerDay() {
        int chickenAge = this.age;
        if(chickenAge >=0 && chickenAge <= 6) {
            return 2.0;
        }
        else if(chickenAge >= 7 && chickenAge <= 12) {
            return 1.0;
        }
        else {
            return 0.75;
        }
    }

    @Override
    public String toString() {
        return "Chicken " + this.name + " (age " +this.age + ") can produce " + eggProducedByChickenPerDay() + " eggs per day."; 
    }
}
