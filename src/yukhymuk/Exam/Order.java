package yukhymuk.Exam;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private static IHotDog hotDog;
    static Ingredients ingredients = new Ingredients();
    private String phoneNumber;
    private Payment payment;

    private static int amountSoldHotDogs =0;
    private static double income = 0.0;



    public Order(IHotDog hotDog, Map<String, Integer> ingredients) {
        this.hotDog = hotDog;
        this.ingredients = (Ingredients) ingredients;
        this.phoneNumber =phoneNumber;
        this.payment = payment;
    }


    public String orderInfo() {
        return "Інформація про замовлення: " + hotDog.getOrderInfo();
    }

    private static void displayOrder() {
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter("orders.txt"))) {
            writer.write("Інформація про замовлення: " + hotDog.getOrderInfo());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void statistics(double hotDogPrice, double costPrice) {
        amountSoldHotDogs++;
        income += hotDogPrice;
    }
    public static void viewStatisticsHotDods() {
        System.out.println("Статистика");
        System.out.println("Продано хот-догів: " + amountSoldHotDogs);
    }

    public static void viewStatisticsIncome() {
        System.out.println("Статистика");
        System.out.println("Зароблено: " +  income);
    }
    public static void viewIngredients() {
        System.out.println("Доступні інгредієнти:");
        ingredients.displayAvailableIngredients();
    }




}
