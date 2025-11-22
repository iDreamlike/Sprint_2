package model;

public class Apple extends Food {
    String colour;

    public Apple(int amount, double price, String colour, boolean isVegetarian, int discount) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = isVegetarian;
        this.discount = discount;
    }

    public Apple(int amount, double price, String colour, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = isVegetarian;
    }

}
