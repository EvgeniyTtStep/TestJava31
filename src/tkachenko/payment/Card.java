package tkachenko.payment;

import tkachenko.products.Products;

public class Card {
    public void pay(float pay ) {
        float pay1=0;
        if (Products.getDiscount()>=10){
            pay1= (pay*90)/100;
        }else if (Products.getDiscount()>=6){
            pay1 =  (pay*95)/100;

        }
        System.out.println("Сума до сплати " + pay1 +"$");
        System.out.println("Обробка платежу...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Платіж пройшов успішно");
        System.out.println("Дякуємо за замовлення!");
    }
}
