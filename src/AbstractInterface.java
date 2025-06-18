public class AbstractInterface {
    public static void main(String[] args) {
        Payment cardPayment = new CardPayment();
        cardPayment.pay(1000);
    }
}
interface Payment {
    void pay(double amount); //public,abstract
    int n = 10; // public, static, final
}
class CardPayment implements  Payment {
    public void pay(double amount) {
        System.out.println("Card Payment is about " + amount);
    }
}