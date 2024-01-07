package tkachenko.users.admin;

import tkachenko.payment.CashRegister;
import tkachenko.products.NumberOfProducts;
import tkachenko.products.Products;

import java.util.Scanner;

public class AdminMethods implements AdminInterMethods {
    private NumberOfProducts nOfp = new NumberOfProducts();
    Products products = new Products();
    private CashRegister cashRegister = new CashRegister();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void addProduct() {
        System.out.println("Дана функія додає всіх проктів по 5шт, щоб додати більше, оберіть її ще раз");

        nOfp.setBacon(5);
        nOfp.setCarrotSalad(5);
        nOfp.setChickenSausage(5);
        nOfp.setKetchup(5);
        nOfp.setClassicBun(5);
        nOfp.setFrenchBread(5);
        nOfp.setLongSausage(5);
        nOfp.setMayonnaise(5);
        nOfp.setPickledCucumber(5);
        nOfp.setPorkSausage(5);
        nOfp.setSoftBun(5);
        nOfp.setSauerkraut(5);
        nOfp.setSweetMustard(5);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Продукти додані успішно");
    }

    @Override
    public void remainderProduct() {
        System.out.println("Свинні сосиски = " + nOfp.getPorkSausage() + "\nКуринні сосиски = "
                + nOfp.getChickenSausage() + "\nДовгі сосиски = " + nOfp.getLongSausage() + "\nКласична булка = "
                + nOfp.getClassicBun() + "\nМ'яка булка = " + nOfp.getSoftBun() + "\nФранцузька булка = "
                + nOfp.getFrenchBread() + "\nПакетикі острого кетчупу = "
                + "\nПакетиків звичайного кетчупу = " + nOfp.getKetchup() + "\nБекон = " + nOfp.getBacon()
                + "\nПакетиків солодкої гірчиці = " + nOfp.getSweetMustard() + "\nПакетиків майонезу = "
                + nOfp.getMayonnaise() + "\nПорцій морковного салату = " + nOfp.getCarrotSalad()
                + "\nПорцій квашеної капусти = " + nOfp.getSauerkraut() + "\nПорцій солоних огірків = "
                + nOfp.getPickledCucumber());
    }

    @Override
    public void openCashRegister() {
        System.out.println("В касі = " + cashRegister.getCashReg() + "$");
        System.out.println("Оберіть дію з касою \n1.Взяти грощі з каси\n2.Додати грощі до каси");
        int chose = sc.nextInt();
        switch (chose) {
            case 1 -> {
                System.out.println("Введіть суму яку ви хочете забрати з каси");
                float takeOff = sc.nextFloat();
                cashRegister.takeOff(takeOff);
            }
            case 2 -> {
                System.out.println("Введіть суму яку ви хочете покласти в касу");
                float takeOff = sc.nextFloat();
                cashRegister.addCash(takeOff);
            }
        }
    }

    void productsCheck() {
        if (nOfp.getPorkSausage() <= 5 || nOfp.getChickenSausage() <= 5 || nOfp.getLongSausage() <= 5) {
            System.out.println("Один з видів сосисок закінчується, перевірте та додайте нестачу");
        }
        if (nOfp.getClassicBun() <= 5 || nOfp.getSoftBun() <= 5 || nOfp.getFrenchBread() <= 5) {
            System.out.println("Один з видів булочок закінчується, перевірте та додайте нестачу");
        }
        if ( nOfp.getKetchup() <= 5 || nOfp.getMayonnaise() <= 5 || nOfp.getSweetMustard() <= 5) {
            System.out.println("Один з видів соусів закінчується, перевірте та додайте нестачу");
        }
        if (nOfp.getBacon() <= 5 || nOfp.getPickledCucumber() <= 5 || nOfp.getCarrotSalad() <= 5 ||
                nOfp.getSauerkraut() <= 5) {
            System.out.println("Один з видів начинок закінчується, перевірте та додайте нестачу");
        }

    }

    public   void showOrders() {
        System.out.println("Кількість замовлень: \nКласичний хот-дог: "+products.getCountClassic()+"\n" +
                "Німецький хот-дог: "+products.getCountGerman()+"\nФранцузький хот-дог: "+products.getCountFrench()
                +"\n" +
                "Зроби сам: "+products.getCountYourself()+"\n________________________"+"\nВсього заказів: "
                + Products.getCountEverything());
        float firstPriceClassic= 20*products.getCountClassic();
        float firstPriceGerman =25*products.getCountGerman();
        float firstPriceFrench =15*products.getCountFrench();
        float firstPriceYourself=(Products.getPriceYourself()*50)/100;
        float firstSum = firstPriceClassic+firstPriceGerman+firstPriceFrench+firstPriceYourself;
        float secondPriceClassic= 40*products.getCountClassic();
        float secondPriceGerman =50*products.getCountGerman();
        float secondPriceFrench =30*products.getCountFrench();
        float secondPriceYourself= Products.getPriceYourself();
        float secondSum = secondPriceClassic+secondPriceGerman+secondPriceFrench+secondPriceYourself;
        float finishSum=secondSum-firstSum;
        System.out.println("Виручка: "+secondSum+"\nПрибуток"+finishSum);
        System.out.println("Почистити статистику доходив?\n1.Tak.\n2.Hi");
        int choice = sc.nextInt();
        switch (choice){
            case 1-> {
                products.setCountClassic(0);
                products.setCountGerman(0);
                products.setCountFrench(0);
                Products.setPriceYourself(0);
                products.setCountYourself(0);
                Products.setCountEverything(0);
            }
            case 2 -> {break;}

            default -> System.out.println("Помилка вводу");
        }
    }
}