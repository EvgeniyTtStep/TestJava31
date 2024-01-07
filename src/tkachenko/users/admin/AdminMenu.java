package tkachenko.users.admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdminMenu {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        AdminMethods adminMethods = new AdminMethods();
        boolean check = true;
        System.out.println("Введіть логін, щоб увійти до панелі адміна");
        String log = sc.nextLine();
        System.out.println("Введіть пароль, щоб увійти до панелі адміна");
        String pas = sc.nextLine();
        List<Admin> users = new ArrayList<>();
        users.add(new Admin("admin1099", "PASSWORD"));
        for (Admin user : users) {
            if (user.login.equals(log) && user.password.equals(pas)) {
                adminMethods.productsCheck();
                while (check) {
                    System.out.println("Оберіть дію:");
                    System.out.println("1. Додати продукти.");
                    System.out.println("2. Перевірити, залишок продуктів.");
                    System.out.println("3. Відкрити касу.");
                    System.out.println("4. Отримати файл заказів.");
                    System.out.println("0. Вихід.");

                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1->adminMethods.addProduct();
                        case 2->adminMethods.remainderProduct();
                        case 3->adminMethods.openCashRegister();
                        case 4->adminMethods.showOrders();
                        case 0->check=false;
                        default -> System.out.println("Ви не обрали дію");
                    }
                }
            }else {
                System.out.println("Не вірний логін,або пароль");
            }
        }
    }
}
