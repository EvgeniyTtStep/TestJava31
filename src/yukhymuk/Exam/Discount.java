package yukhymuk.Exam;

public class Discount {
double discount;
int quantity;

public  void discountPrice(int quantity) {

    if (quantity==3){
        discount = 0.1; // discount - 10%
        System.out.println("Discount - 10%");
    } else if (quantity==4){
        discount = 0.3; // discount - 30%
        System.out.println("Discount - 30%");
    } else if (quantity>=5){
        discount = 0.5; // discount - 50%
        System.out.println("Discount - 50%");
    } else {
        System.out.println("No discount. Order more");
    }
}

}
