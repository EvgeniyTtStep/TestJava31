package tkachenko.menuAndMethods;

import tkachenko.menuAndMethods.methods.MethodsForMenu;

import java.util.Scanner;

public class Menu {

    public void menu() {
        Scanner sc = new Scanner(System.in);
        MethodsForMenu metForMenu = new MethodsForMenu();
        boolean check = true;
        while (check) {
            System.out.println("""
                    Оберіть дію:\s
                    1.Класичний хот-дог.
                    2.Німецький хот-дог.
                    3.Франзуцький хот-дог.
                    4.Зробити самому.
                    5.Закінчити замовленяя.
                    6.Адмін.          \s
                    0.Вимкнути додаток.
                    """);
            int chose= sc.nextInt();
            switch (chose){
                case 1->metForMenu.classic();
                case 2->metForMenu.german();
                case 3->metForMenu.french();
                case 4->metForMenu.yourself();
                case 5->metForMenu.finishTheOrder();
                case 6->metForMenu.menu();
                case 0->check=false;
                default -> System.out.println("Ви обрали не вірну дію");
            }

        }
    }
}
