package tkachenko.menuAndMethods.methods;

import tkachenko.payment.CashRegister;
import tkachenko.products.Products;
import tkachenko.users.admin.AdminMenu;

import java.util.Scanner;

public class MethodsForMenu {
    Scanner sc = new Scanner(System.in);
    Products product = new Products();

    CashRegister cashReg = new CashRegister();

    AdminMenu adminMenu = new AdminMenu();


    public void finishTheOrder() {
        System.out.println("Оберіть метод оплати: \n1.Готівка\n2.Карта");
        int pay = sc.nextInt();
        switch (pay) {
            case 1 -> {

                cashReg.cash(Products.getPrice());
                Products.setPrice(0);
                Products.setDiscount(0);
            }
            case 2 -> {
                cashReg.card((Products.getPrice()));
                Products.setPrice(0);
                Products.setDiscount(0);
            }

        }
    }

    public void menu() {
        adminMenu.menu();
    }

    public void classic() {
        product.classic();
    }

    public void german() {
        product.german();
    }

    public void french() {
        product.french();
    }

    public void yourself() {
        product.yourself();
    }

}
