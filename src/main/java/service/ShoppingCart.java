package service;

import model.Food;


public class ShoppingCart {
    Food[] foodArray;

    public ShoppingCart(Food[] foodArray) {
        this.foodArray = foodArray;
    }

    public double getFullSum() {
        double fulSum = 0;
        for (Food food : foodArray) {
            fulSum += food.getAmount() * food.getPrice();
        }
        return fulSum;
    }

    public double getSumWithDiscount() {
        double sumWithDiscount = 0;
        for (Food food : foodArray) {
            double foodSum = food.getAmount() * food.getPrice();
            sumWithDiscount += foodSum - foodSum * food.getDiscount() / 100;
        }
        return sumWithDiscount;
    }

    public double getFullSumVegetarian() {
        double fullSumVegetarian = 0;
        for (Food food : foodArray) {
            if (food.isVegetarian()) {
                fullSumVegetarian += food.getAmount() * food.getPrice();
            }
        }
        return fullSumVegetarian;
    }
}
