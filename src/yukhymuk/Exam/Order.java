package yukhymuk.Exam;

import java.io.*;

public class Order {
    private static HotDog hotDog;

    public Order(HotDog hotDog) {
        this.hotDog = hotDog;
    }
public String orderInfo(){
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
