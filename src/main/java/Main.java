import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import model.constants.Discount;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Food[] foodArray = {
                new Meat(5, 100.0, false),
                new Apple(10, 50.0, Colour.RED, true, Discount.DISCOUNT),
                new Apple(8, 60.0, Colour.GREEN, true)
        };

        ShoppingCart shoppingCart = new ShoppingCart(foodArray);

        System.out.println("Сумма всех товаров в корзине без учета скидок: " + shoppingCart.getSumWithoutDiscount());
        System.out.println("Сумма всех товаров в корзине с учетом скидок: " + shoppingCart.getSumWithDiscount());
        System.out.println("Сумма только вегетарианских продуктов в корзине с учетом скидок: " + shoppingCart.getSumWithoutDiscountVegetarian());
    }
}
