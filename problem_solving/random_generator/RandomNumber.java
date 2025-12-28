package problem_solving.random_generator;
import java.security.Provider;
import java.security.Security;
import java.util.Random;
import java.lang.Math;
import java.security.SecureRandom;

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println("Random number generator");

        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(111));
        System.out.println(random.nextInt(999, 1000));
        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());

        System.out.println("Stream of Random numbers");
        random.ints(5).forEach(System.out::println);


        System.out.println("Random number generator using Math");
        System.out.println(Math.random());
        System.out.println( (int) (Math.random() * 100));

        System.out.println("Random number generator using SecureRandom");
        SecureRandom secureRandom = new SecureRandom();
        System.out.println(secureRandom.nextInt());

        Provider[] providers = Security.getProviders();
        for (Provider provider : providers) {
            System.out.println(provider.getInfo());
        }

    }
}
