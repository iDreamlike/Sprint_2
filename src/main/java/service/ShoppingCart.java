package service;

import model.Food;


public class ShoppingCart {
    Food[] foodArray;

    public ShoppingCart(Food[] foodArray) {
        this.foodArray = foodArray;
    }

    public double getSumWithoutDiscount() {
        double sum = 0;
        for (Food food : foodArray) {
            sum += food.getAmount() * food.getPrice();
        }
        return sum;
    }

    public double getSumWithDiscount() {
        double sum = 0;
        for (Food food : foodArray) {
            if (food.getDiscount() == 0) {
                sum += food.getAmount() * food.getPrice();
            } else {
                double foodSum = food.getAmount() * food.getPrice();
                sum += foodSum - foodSum * food.getDiscount() / 100;
            }
        }
        return sum;
    }

    public double getSumWithoutDiscountVegetarian() {
        double sum = 0;
        for (Food food : foodArray) {
            if (food.isVegetarian()) {
                sum += food.getAmount() * food.getPrice();
            }
        }
        return sum;
    }
}
