package tkachenko.products;

import java.util.Scanner;

public class Products {
    NumberOfProducts numOfProd = new NumberOfProducts();
    Scanner sc = new Scanner(System.in);
    private static   float price;
    private static float priceYourself;
    private int countClassic;
    private int countFrench;
    private int countGerman;
    private int countYourself;
    private static   int discount;
    private static int countEverything;
    private int porkSausage;
    private int chickenSausage;
    private int longSausage;
    private int classicBun;
    private int softBun;
    private int frenchBread;
    private int ketchup;
    private int bacon;
    private int sweetMustard;
    private int mayonnaise;
    private int carrotSalad;
    private int sauerkraut;
    private int pickledCucumber;

    public void classic() {
        classicBun = 1;
        chickenSausage = 1;
        ketchup = 2;
        mayonnaise = 2;
        sweetMustard = 1;
        carrotSalad = 1;
        sauerkraut = 1;
        System.out.println("Бажаєте щось додати до хот-догу?\n1.Так.\n2.Ні");
        int scan = sc.nextInt();
        boolean check = true;
        if (scan == 1) {
            while (check) {
                System.out.println("""
                        Оберіть продукт який ви хочете додати до хот-догу\s
                        1.Куряча сосиска.
                        2.Кетчуп
                        3.Майонез.
                        4.Солодка гірчиця.
                        5.Морковний салат.
                        6.Квашена капуста.
                        0.Закінчити додавання""");
                scan = sc.nextInt();
                switch (scan) {
                    case 1 -> {
                        chickenSausage += 1;
                        price += 8;
                    }
                    case 2 -> {
                        ketchup += 1;
                        price += 3;
                    }
                    case 3 -> {
                        mayonnaise += 1;
                        price += 3;
                    }
                    case 4 -> {
                        sweetMustard += 1;
                        price += 3;
                    }
                    case 5 -> {
                        carrotSalad += 1;
                        price += 8;
                    }
                    case 6 -> {
                        sauerkraut += 1;
                        price += 8;
                    }
                    case 0 -> check = false;
                }
            }
        }
        System.out.println("Ваше замовлення Класичний хот-дог:" +
                "\nБулочка: " + classicBun + "\nКуряча сосиска: " + chickenSausage +
                "\nКетчуп: " + ketchup + "\nМайонез: " + mayonnaise + "\nСолодка гірчиця: " + sweetMustard +
                "\nМоркв'яний салат: " + carrotSalad + "\nКвашена капуста: " + sauerkraut);

        numOfProd.giveClassicBun(classicBun);
        numOfProd.giveChickenSausage(chickenSausage);
        numOfProd.giveKetchup(ketchup);
        numOfProd.giveMayonnaise(mayonnaise);
        numOfProd.giveSweetMustard(sweetMustard);
        numOfProd.giveCarrotSalad(carrotSalad);
        numOfProd.giveSauerkraut(sauerkraut);
        price += 40;
        this.countYourself++;
        countEverything++;
        discount++;

    }

    public void french() {
        frenchBread = 1;
        longSausage = 2;
        ketchup = 1;
        mayonnaise = 1;
        sweetMustard = 1;
        pickledCucumber = 5;
        System.out.println("Бажаєте щось додати до хот-догу?\n1.Так.\n2.Ні");
        int scan = sc.nextInt();
        boolean check = true;
        if (scan == 1) {
            while (check) {
                System.out.println("""
                        Оберіть продукт який ви хочете додати до хот-догу .
                        1.Кетчуп.
                        2.Майонез
                        3.Солодка гірчиця.
                        4.Мареновані огірки.
                        0.Закінчити додавання.""");
                scan = sc.nextInt();
                switch (scan) {
                    case 1 -> {
                        ketchup += 1;
                        price += 3;
                    }
                    case 2 -> {
                        mayonnaise += 1;
                        price += 3;
                    }
                    case 3 -> {
                        sweetMustard += 1;
                        price += 3;
                    }
                    case 4 -> {
                        pickledCucumber += 1;
                        price += 1;
                    }
                    case 0 -> check = false;
                }
            }
        }
        System.out.println("Ваше замовлення Класичний хот-дог:" +
                "\nБулочка: " + frenchBread + "\nДовга сосиска: " + longSausage +
                "\nКетчуп: " + ketchup + "\nМайонез: " + mayonnaise + "\nСолодка гірчиця: " + sweetMustard +
                "\nМареновані огіркі: " + pickledCucumber);

        numOfProd.giveFrenchBread(frenchBread);
        numOfProd.giveLongSausage(longSausage);
        numOfProd.giveKetchup(ketchup);
        numOfProd.giveMayonnaise(mayonnaise);
        numOfProd.giveSweetMustard(sweetMustard);
        numOfProd.givePickledCucumber(pickledCucumber);
        this.countYourself++;
        countEverything++;
        discount++;
        price += 30;

    }

    public void german() {
        softBun = 1;
        porkSausage = 1;
        ketchup = 2;
        mayonnaise = 2;
        sauerkraut = 1;
        pickledCucumber = 4;
        bacon = 2;
        System.out.println("Бажаєте щось додати до хот-догу?\n1.Так.\n2.Ні");
        int scan = sc.nextInt();
        boolean check = true;
        if (scan == 1) {
            while (check) {
                System.out.println("""
                        Оберіть продукт який ви хочете додати до хот-догу\s
                        1.Свиняча сосиска.
                        2.Кетчуп
                        3.Майонез.
                        4.Квашена капуста.
                        5.Мариновані огірки
                        6.Бекон
                        0.Закінчити додавання""");
                scan = sc.nextInt();
                switch (scan) {
                    case 1 -> {
                        porkSausage += 1;
                        price += 8;
                    }
                    case 2 -> {
                        ketchup += 1;
                        price += 3;
                    }
                    case 3 -> {
                        mayonnaise += 1;
                        price += 3;
                    }
                    case 4 -> {
                        sauerkraut += 1;
                        price += 8;
                    }
                    case 5 -> {
                        pickledCucumber += 1;
                        price += 1;
                    }
                    case 6 -> {
                        bacon += 1;
                        price += 7;
                    }
                    case 0 -> check = false;
                }
            }
        }
        System.out.println("Ваше замовлення Класичний хот-дог:" +
                "\nБулочка: " + softBun + "\nСвиняча сосиска: " + porkSausage +
                "\nКетчуп: " + ketchup + "\nМайонез: " + mayonnaise +
                "\nМариновані огірки: " + pickledCucumber + "\nКвашена капуста: " + sauerkraut + "\nБекон: " + bacon);

        numOfProd.giveSoftBun(softBun);
        numOfProd.givePorkSausage(porkSausage);
        numOfProd.giveKetchup(ketchup);
        numOfProd.giveMayonnaise(mayonnaise);
        numOfProd.giveSauerkraut(sauerkraut);
        numOfProd.givePickledCucumber(pickledCucumber);
        numOfProd.giveBacon(bacon);
        this.countYourself++;
        countEverything++;
        discount++;
        price += 50;
    }

    public void yourself() {
        boolean check = true;
        while (check) {
            System.out.println("""
                    Оберіть продукт який ви хочете додати до хот-догу:\s
                    1.Куряча сосиска.
                    2.Кетчуп
                    3.Майонез.
                    4.Солодка гірчиця.
                    5.Морковний салат.
                    6.Квашена капуста.
                    7.Свина сосиска.
                    8.Довга сосиска.
                    9.Класичка булка.
                    10.Франзуцька булка.
                    11.М'яка булка.
                    12.Бекон.
                    13.Мариновані огірки.
                    0.Закінчити додавання""");
            int scan = sc.nextInt();
            switch (scan) {
                case 1 -> {
                    chickenSausage += 1;
                    price += 8;
                    priceYourself += 8;
                }
                case 2 -> {
                    ketchup += 1;
                    price += 3;
                    priceYourself += 3;
                }
                case 3 -> {
                    mayonnaise += 1;
                    price += 3;
                    priceYourself += 3;
                }
                case 4 -> {
                    sweetMustard += 1;
                    price += 3;
                    priceYourself += 3;
                }
                case 5 -> {
                    carrotSalad += 1;
                    price += 8;
                    priceYourself += 8;
                }
                case 6 -> {
                    sauerkraut += 1;
                    price += 8;
                    priceYourself += 8;
                }
                case 7 -> {
                    porkSausage += 1;
                    price += 8;
                    priceYourself += 8;
                }
                case 8 -> {
                    longSausage += 1;
                    price += 5;
                    priceYourself += 5;
                }
                case 9 -> {
                    classicBun += 1;
                    price += 8;
                    priceYourself += 8;
                }
                case 10 -> {
                    frenchBread += 1;
                    price += 6;
                    priceYourself += 6;
                }
                case 11 -> {
                    softBun += 1;
                    price += 10;
                    priceYourself += 10;
                }
                case 12 -> {
                    bacon += 1;
                    price += 7;
                    priceYourself += 7;
                }
                case 13 -> {
                    pickledCucumber += 1;
                    price += 1;
                    priceYourself += 1;
                }
                case 0 -> check = false;
            }
        }

        System.out.println(" Ваше замовлення хот-дог Зроби сам:\nКурина сосиска: " + chickenSausage +
                "\nКетчуп: " + ketchup + "\nМайонез: " + mayonnaise + "\nСолодка гірчиця: " + sweetMustard + "\n" +
                "\nМорковний салат: " + carrotSalad + "\nКвашена капуста: " + sauerkraut + "\nСвина сосиска" + porkSausage +
                "\nДовга сосиска: " + longSausage + "\nКласична булка: " + classicBun + "\nФранзуцька булка: " + frenchBread +
                "\nМ'яка булка: " + softBun + "\nБекон: " + bacon + "\nМариновані огірки: " + pickledCucumber);

        numOfProd.giveChickenSausage(chickenSausage);
        numOfProd.giveKetchup(ketchup);
        numOfProd.giveMayonnaise(mayonnaise);
        numOfProd.giveSweetMustard(sweetMustard);
        numOfProd.giveCarrotSalad(carrotSalad);
        numOfProd.giveSauerkraut(sauerkraut);
        numOfProd.giveLongSausage(longSausage);
        numOfProd.giveClassicBun(classicBun);
        numOfProd.giveFrenchBread(frenchBread);
        numOfProd.giveSoftBun(softBun);
        numOfProd.givePorkSausage(porkSausage);
        numOfProd.giveBacon(bacon);
        numOfProd.givePickledCucumber(pickledCucumber);

        this.countYourself++;
        countEverything++;
        discount++;

    }


    public int getCountClassic() {
        return countClassic;
    }

    public int getCountFrench() {
        return countFrench;
    }

    public int getCountGerman() {
        return countGerman;
    }

    public int getCountYourself() {
        return countYourself;
    }

    public static float getPriceYourself() {
        return priceYourself;
    }

    public static void setPriceYourself(float priceYourself) {
        Products.priceYourself = priceYourself;
    }

    public void setCountClassic(int countClassic) {
        this.countClassic = countClassic;
    }

    public void setCountFrench(int countFrench) {
        this.countFrench = countFrench;
    }

    public void setCountGerman(int countGerman) {
        this.countGerman = countGerman;
    }

    public void setCountYourself(int countYourself) {
        this.countYourself = countYourself;
    }

    public static int getDiscount() {
        return discount;
    }

    public static void setDiscount(int discount) {
        Products.discount = discount;
    }

    public static float getPrice() {
        return price;
    }

    public static void setPrice(float price) {
        Products.price = price;
    }

    public static int getCountEverything() {
        return countEverything;
    }

    public static void setCountEverything(int countEverything) {
        Products.countEverything = countEverything;
    }
}
