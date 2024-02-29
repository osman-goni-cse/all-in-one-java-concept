import java.util.List;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println("Hello " + name + "!" + " You're ");
        System.out.println(age);
        System.out.print("Enter your name: again");

        scanner.close();
    }
}
