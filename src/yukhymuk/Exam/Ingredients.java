package yukhymuk.Exam;

import java.util.List;

public class Ingredients {
    private String roll;
    private String lavash;
    private String sausage;
    private String mayonnaise;
    private String ketchup;
    private String mustard;
    private List<String> toppings;


    public void addRoll(int quantity) {
    }
    public void addLavash(int quantity) {
    }


    public void addMayonnaise(int quantity) {
    }

    public void addKetchup(int quantity) {
    }

    public void addMustard(int quantity) {
    }
    public void addToppings(String topping) {
        toppings.add(topping);
    }

    public List<String> getToppings() {
        return toppings;
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
