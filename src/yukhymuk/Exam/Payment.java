package yukhymuk.Exam;

public class Payment {
private boolean cash;
private boolean card;

    public Payment(boolean cash, boolean card) {
        this.cash = cash;
        this.card = card;
    }

    public Payment() {

    }

    public boolean cash() {
        return cash;
    }
    public boolean card() {
        return card;
    }

    public void paymentMethod() {
        if (cash) {
            System.out.println("- Cash");
        }

        if (card) {
            System.out.println("- Card");
        }
    }

}
