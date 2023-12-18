package yukhymuk.Exam;

import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть операцію");
        //Metods metods = new Metods();

        while (true) {
            System.out.println("1 Хот-дог з класичною сосискою (булка, сосиска,майонез, кетчуп, гірчиця, морква ко-корейські)");
            System.out.println("2 Хот-дог з мисливською сосискою (булка, сосиска, майонез, кетчуп, гірчиця, морква ко-корейські)");
            System.out.println("3 Хот-дог в лаваші з класичною сосискою (лаваш, сосиска, майонез, кетчуп, гірчиця, морква ко-корейські)");
            System.out.println("4 Обрати власний рецепт");
            System.out.println("5 Додати топінг");
            System.out.println("6 Способи оплати");
            System.out.println("7 Перегляд кількості проданих хот-догів");
            System.out.println("8 Перегляд виручки");
            System.out.println("9 Перегляд інформації про наявні інгредієнти для приготування хот-догів.");
            System.out.println("10 Інгредієнти, які закінчились (Потрібно придбати)");
            System.out.println("0 Вихід.");

            int choice = scanner.nextInt();
            scanner.nextLine();
            boolean isSelect = true;

            switch (choice) {
                case 1 -> {

                }

                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {

                }
                case 6 -> {

                }
                case 7 -> {

                }
                case 8 -> {

                }
                case 9 -> {

                }
                case 10 -> {

                }
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