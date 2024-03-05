package PillarsOfOOP.Encapsulation.Exercise_3;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String personName;
    private double personMoney;
    private List<Product> bagOfProducts;

    public Person(String personName, double personMoney) {
        this.setPersonName(personName);
        this.setPersonMoney(personMoney);
        bagOfProducts = new ArrayList<>();
    }

    private void setPersonName(String personName) {
        if(personName.trim().length() <= 0) {
            throw new IllegalArgumentException("Person Name can't be empty.");
        }
        this.personName = personName;
    }

    private void setPersonMoney(double personMoney) {
        if(personMoney < 0) {
            throw new IllegalArgumentException("Money can't be negative");
        }
        this.personMoney = personMoney;
    }

    public void addProductToPersonBag(Product product) {
        if(canPersonAffordProduct(product)) {
            bagOfProducts.add(product);
            this.personMoney -= product.getProductCost();
            System.out.println(this.personName + " bought " + product.getProductName());
        }
        else {
            throw new IllegalArgumentException(this.personName + " can't afford " + product.getProductName());
        }
    }

    private boolean canPersonAffordProduct(Product product) {
        if(this.personMoney < product.getProductCost()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String str = this.personName + " - ";

        if(bagOfProducts.size() <= 0) {
            str += "Nothing bought";
        }

        for(Product product: bagOfProducts) {
            str += product.getProductName() + ",";
        }
        return str;
    }
}
