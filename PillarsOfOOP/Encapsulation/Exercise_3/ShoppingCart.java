package PillarsOfOOP.Encapsulation.Exercise_3;

public class ShoppingCart {
    public static void main(String[] args) {
        System.out.println("Implement a minimalist shopping cart system");

        try {
            Person pesho = new Person("Pesho", 11);
            Person gosho = new Person("Gosho", 4);

            Product bread = new Product("Bread", 10);
            Product milk = new Product("Milk", 2);

            pesho.addProductToPersonBag(bread);
            gosho.addProductToPersonBag(milk);
            gosho.addProductToPersonBag(milk);

            try{
                pesho.addProductToPersonBag(milk);
            }catch(IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }

            System.out.println(pesho);
            System.out.println(gosho);

            try {
                Person jeko = new Person("Jeko", -3);
                Product chushki = new Product("Chushki", 1);

                jeko.addProductToPersonBag(chushki);
                System.out.println(jeko);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
            }

        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }
}
