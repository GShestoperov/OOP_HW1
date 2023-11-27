import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrink("Чай черный", 70, 300, 100));
        productList.add(new HotDrink("Чай зеленый", 70, 300, 70));
        productList.add(new HotDrink("Кофе каппучино", 120, 200, 90));
        productList.add(new HotDrink("Кофе эспрессо", 150, 150, 90));
        productList.add(new HotDrink("Горячий шоколад", 100, 150, 80));

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("Чай черный", 300, 100));
        System.out.println(vendingMachine.getProduct("Кофе каппучино", 200, 90));
        System.out.println(vendingMachine.getProduct("Кофе эспрессо", 150, 80)); // такого напитка нет
        System.out.println(vendingMachine.getProduct("Очень горячий шоколад", 150, 80)); // такого напитка нет
    }
}