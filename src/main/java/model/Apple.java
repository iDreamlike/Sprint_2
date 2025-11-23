package model;

public class Apple extends Food {
    String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
        if (colour.equals("red")) {
            this.discount = 60;
        }
    }

}
