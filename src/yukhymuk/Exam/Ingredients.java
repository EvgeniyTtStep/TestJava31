package yukhymuk.Exam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ingredients {
    private HashMap<String, Integer> ingredientsAvaliable;
    private String roll;
    private String lavash;
    private String sausage;
    private String mayonnaise;
    private String ketchup;
    private String mustard;
    private List<String> toppings;

    public Ingredients() {
        this.ingredientsAvaliable = new HashMap<>();
        closetIngredients();
    }

    private void closetIngredients() {
        ingredientsAvaliable.put("булка", 20);
        ingredientsAvaliable.put("лаваш", 20);
        ingredientsAvaliable.put("соус", 15);
        ingredientsAvaliable.put("майонез", 15);
        ingredientsAvaliable.put("кетчуп", 10);
        ingredientsAvaliable.put("гірчиця", 10);
        ingredientsAvaliable.put("Солодка цибуля", 10);
        ingredientsAvaliable.put("Халапеньйо", 20);
        ingredientsAvaliable.put("Солоний огірок", 20);
        ingredientsAvaliable.put("Сирний соус", 10);
        ingredientsAvaliable.put("Часниковий соус", 15);
    }

    public void addIngredient(String ingredient, int quantity) {
        ingredientsAvaliable.put(ingredient, ingredientsAvaliable.getOrDefault(ingredient, 0) + quantity);
    }
    public void addRoll(int quantity) {
        addIngredient("булка", quantity);
    }
    public void addLavash(int quantity) {
        addIngredient("лаваш", quantity);
    }


    public void addMayonnaise(int quantity) {
        addIngredient("майонез", quantity);
    }

    public void addKetchup(int quantity) {
        addIngredient("кетчуп", quantity);
    }

    public void addMustard(int quantity) {
        addIngredient("гірчиця", quantity);
    }
    public void addToppings(String topping, int quantity) {
        addIngredient("топінги" + topping.toLowerCase(), quantity);
    }

    public List<String> getToppings() {
        return toppings;
    }

    void displayAvailableIngredients() {
        for (Map.Entry<String, Integer> entry : ingredientsAvaliable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


    public void addToppings() {
        toppings.add("Солодка цибуля");
        toppings.add("Халапеньйо");
        toppings.add("Чилі");
        toppings.add("Солоний огірок");
        toppings.add("Сирний соус");
        toppings.add("Часниковий соус");
    }

}
