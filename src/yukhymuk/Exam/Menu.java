package yukhymuk.Exam;

import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть операцію");
        HotDog hotDog = new HotDog();
        boolean isSelect = true;
        while (isSelect) {
            System.out.println("1 Хот-дог з класичною сосискою (булка, сосиска,майонез, кетчуп, гірчиця, морква ко-корейські)");
            System.out.println("2 Хот-дог з мисливською сосискою (булка, сосиска, майонез, кетчуп, гірчиця, морква ко-корейські)");
            System.out.println("3 Хот-дог в лаваші з класичною сосискою (лаваш, сосиска, майонез, кетчуп, гірчиця, морква ко-корейські)");
            System.out.println("4 Обрати власний рецепт");
            System.out.println("5 Додати топінг");
            System.out.println("6 Способи оплати");
            System.out.println("7 Перегляд кількості проданих хот-догів");
            System.out.println("8 Перегляд виручки");
            System.out.println("9 Перегляд інформації про наявні інгредієнти для приготування хот-догів.");
            System.out.println("0 Вихід.");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {hotDog.addFirstRecipe();}
                case 2 -> {hotDog.addSecondRecipe();}
                case 3 -> {hotDog.addThirdRecipe();}
                case 4 -> {hotDog.addOunRecipe();}
                case 5 -> {hotDog.addToppings();}
                case 6 -> {Payment payment = hotDog.payment;}
                case 7 -> {Order.viewStatisticsHotDods();}
                case 8 -> {Order.viewStatisticsIncome();}
                case 9 -> {Order.viewIngredients();}
                case 0 -> {
                    System.out.println("До побачення");
                    isSelect = false;
                    ;
                }
                default -> System.out.println("Помилка введення операції. Повторіть спробу. Оберіть цифри зі списку.");

            }
        }
    }
}