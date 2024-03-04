package PillarsOfOOP.Encapsulation.Exercise_2;

import java.io.IOException;

public class AnimalFarm {
    public static void main(String[] args) throws IOException {
        System.out.println("************* Our New Firm ***************");

        try {
            Chicken chicken1 = new Chicken(null, 10);
            System.out.print(chicken1);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
