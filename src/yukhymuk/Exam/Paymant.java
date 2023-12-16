package yukhymuk.Exam;

public class Paymant {
private boolean cash;
private boolean card;

    public Paymant(boolean cash, boolean card) {
        this.cash = cash;
        this.card = card;
    }

    public boolean cash() {
        return cash;
    }
    public boolean card() {
        return card;
    }
    public void paymentMetod() {
        if (cash) {
            System.out.println("- Cash");
        }

        if (card) {
            System.out.println("- Card");
        }
    }

}
