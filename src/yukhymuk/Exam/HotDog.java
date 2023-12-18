package yukhymuk.Exam;

import java.util.Scanner;

public class HotDog implements IHotDog{
    Ingredients ingredients = new Ingredients();
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
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println(choice);

    }
    @Override
    public String getOrderInfo() {
        return null;
    }

    public static void main(String[] args) {
        HotDog hotDog = new HotDog();
         hotDog.addOunRecipe();
    }
}
