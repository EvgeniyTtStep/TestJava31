package yukhymuk.Exam;

import java.util.Scanner;

public class HotDog implements IHotDog{
    Ingredients ingredients = new Ingredients();
    Payment payment= new Payment();

    public HotDog() {
    }

    @Override
    public void  addFirstRecipe(){

        System.out.println("Ви обрали хот-дог з класичною сосискою (булка, сосиска, майонез, кетчуп, гірчиця, морква ко-корейські)");
    }
    @Override
    public void addSecondRecipe(){
        System.out.println("Ви обрали хот-дог з мисливською сосискою (булка, сосиска, майонез, кетчуп, гірчиця, морква ко-корейські)");
    }
    @Override
    public void addThirdRecipe(){
        System.out.println("Ви обрали хот-дог в лаваші з класичною сосискою (лаваш, сосиска, майонез, кетчуп, гірчиця, морква ко-корейські)");
    }
    @Override
    public void addOunRecipe(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть iнгредієнти для хот-догу");
        System.out.println("1 Булка");
        System.out.println("2 Лаваш");
        int userChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("1 Класична сосиска");
        System.out.println("2 Мисливська сосиска");
        int userChoice1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("1 Майонез");
        System.out.println("2 Кетчуп");
        System.out.println("3 Гірчиця");
        System.out.println("4 Майонез + Кетчуп");
        System.out.println("5 Майонез + Кетчуп + Гірчиця");
        int userChoice2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ви обрали: ");
        switch (userChoice) {
            case 1 -> System.out.print("Булку");
            case 2 -> System.out.print("Лаваш");

        }
        switch (userChoice1) {
            case 1 -> System.out.print(", класичну сосиску");
            case 2 -> System.out.print(", мисливську сосиску");
        }
        switch (userChoice2) {
            case 1 -> System.out.print(", майонез");
            case 2 -> System.out.print(", кетчуп");
            case 3 -> System.out.print(", гірчицю");
            case 4 -> System.out.print(", майонез, кетчуп");
            case 5 -> System.out.print(", майонез, кетчуп, гірчицю");
        }
    }
    @Override
    public String getOrderInfo() {
        return null;
    }

    public void addToppings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть топінг для хот-догу");
        while (true) {
            System.out.println("1 Солодку цибулю");
            System.out.println("2 Халапеньйо");
            System.out.println("3 Чилі");
            System.out.println("4 Солоний огірок");
            System.out.println("5 Сирний соус");
            System.out.println("6 Часниковий соус");
            System.out.println("0 Вихід.");

            int userChoice = scanner.nextInt();
            scanner.nextLine();
            boolean isSelect = true;
            System.out.println("Ви обрали: ");

            switch (userChoice) {
                case 1 -> System.out.println("Солодка цибуля");
                case 2 -> System.out.println("Халапеньйо");
                case 3 -> System.out.println("Чилі");
                case 4 -> System.out.println("Солоний огірок");
                case 5 -> System.out.println("Сирний соус");
                case 6 -> System.out.println("Часниковий соус");
                case 0 -> {
                    System.out.println("Вихід");
                    isSelect = false;
                    Menu menu = new Menu();
                    menu.menu();

                }
            }
        }
    }
}
