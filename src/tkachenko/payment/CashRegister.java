package tkachenko.payment;

import tkachenko.products.Products;

import java.util.Scanner;

public class CashRegister {
    private float cashReg = 500;
    Card card = new Card();
    Scanner sc = new Scanner(System.in);

    public void cash(float pay) {
        float rest;
        float pay1 = 0;
        if (Products.getDiscount() >= 10) {
            pay1 = (pay * 90) / 100;
        } else if (Products.getDiscount() >= 6) {
            pay1 = (pay * 95) / 100;
        }
        System.out.println("Сума до сплати " + pay1 + "$");
        System.out.println("Введіть суму яку ви даєте");
        int cash = sc.nextInt();
        rest = cash - pay;
        if (rest > 0) {
            this.cashReg += pay;
            this.cashReg -= rest;
            System.out.println("Ваша решта = " + rest + "$\nДякуємо за замовлення!");
        } else {
            this.cashReg += pay;
            System.out.println("Дякуємо за замовлення.");
        }

    }

    public void card(float pay) {
        this.card.pay(pay);

    }

    public CashRegister() {
    }

    public float getCashReg() {
        return cashReg;
    }

    public void takeOff(float take) {
        this.cashReg -= take;
        System.out.println("В касі залишилося = " + this.cashReg + "$");
    }

    public void addCash(float take) {
        this.cashReg += take;
        System.out.println("В касі залишилося = " + this.cashReg + "$");
    }
}
