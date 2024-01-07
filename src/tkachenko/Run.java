package tkachenko;

import tkachenko.menuAndMethods.Menu;
import tkachenko.payment.Card;
import tkachenko.payment.CashRegister;
import tkachenko.products.NumberOfProducts;
import tkachenko.products.Products;
import tkachenko.users.admin.AdminMenu;
import tkachenko.users.admin.AdminMethods;

public class Run {
    public static void main(String[] args) {
        Menu menu=new Menu();
        menu.menu();
    }

}
