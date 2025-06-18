interface Payment {
    void pay(double amount); //public,abstract
    int n = 10; // public, static, final
}
class CardPayment implements  Payment {
    public void pay(double amount) {
        System.out.println("Card Payment is about " + amount);
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        CardPayment cardPayment = new CardPayment();
        cardPayment.pay(1000);
    }
}