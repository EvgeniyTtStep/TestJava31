package yukhymuk.Exam;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private static HotDog hotDog;
    private Map<String, Integer> ingredients = new HashMap<>();

    public Order(Map<String, Integer> ingredients) {
        this.hotDog = hotDog;
        this.ingredients = ingredients;
    }

    public String orderInfo() {
        return "Order Information: " + hotDog.getOrderInfo();
    }

    private static void displayOrder() {
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter("orders.txt"))) {
            writer.write("Order");
            writer.write(hotDog.getOrderInfo());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
